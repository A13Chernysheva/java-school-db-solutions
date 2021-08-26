package my_spring;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import utils.RandomUtil;

import java.lang.reflect.Field;

@NoArgsConstructor
public class InjectByTypeAnnotationObjectConfigurator implements ObjectConfigurator{

    @Override
    @SneakyThrows
    public void configure(Object t, Context context) {
        Class<?> type = t.getClass();
        for (Field field : type.getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class) && field.getType().isInterface()) {
                field.setAccessible(true);
                field.set(t, context.getConfig().getImplClass(field.getType()).getDeclaredConstructor().newInstance());
            }
        }
    }
}
