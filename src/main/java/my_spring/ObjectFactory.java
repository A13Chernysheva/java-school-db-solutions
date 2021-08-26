package my_spring;

import org.reflections.Reflections;
import lombok.Getter;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class ObjectFactory {
    @Getter
    private static final ObjectFactory instance = new ObjectFactory();
    private final List<ObjectConfigurator> configurators;
    private Reflections scanner = new Reflections("my_spring");
    private static Context context = new Context();
    private static Config config;


    @SneakyThrows
    ObjectFactory() {
        config = context.getConfig();
        configurators = new ArrayList<>();
        Set<Class<? extends ObjectConfigurator>> allConfigurations = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> objectConfigurator: allConfigurations) {
            configurators.add(objectConfigurator.getConstructor().newInstance());
        }
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        if (type.isInterface()) {
            type = config.getImplClass(type);
        }

        T t = type.getDeclaredConstructor().newInstance();
        configurators.forEach(ObjectConfigurator -> ObjectConfigurator.configure(t, context));

        return t;
    }




}
