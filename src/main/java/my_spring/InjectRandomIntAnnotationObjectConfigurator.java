package my_spring;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import utils.RandomUtil;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

@NoArgsConstructor
public class InjectRandomIntAnnotationObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t, Context context) {
        Class<?> type = t.getClass();
        for (Field field : type.getDeclaredFields()) {
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if(annotation!=null){
                int max = annotation.max();
                int min = annotation.min();
                field.setAccessible(true);
                field.set(t, RandomUtil.between(min, max));
            }
        }

    }
}
