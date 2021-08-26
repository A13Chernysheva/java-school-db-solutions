package my_spring;

import lombok.AllArgsConstructor;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;
import java.util.Arrays;

@AllArgsConstructor
public class ProxyService<T> {

    T t;
    Class<T> type;

    public <T> T createCglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(type);
        enhancer.setCallback(new CglibInterceptor<T>((T) t));
        return (T) enhancer.create();
    }

    public <T> T getProxyInstanceIfNeeded() {
        if (type.isAnnotationPresent(Benchmark.class) || Arrays.stream(type.getDeclaredMethods()).anyMatch(field -> field.isAnnotationPresent(Benchmark.class))) {
            if (Arrays.stream(type.getInterfaces()).count() == 0) {
                return createCglibProxy();
            }
            else {
                return (T) Proxy.newProxyInstance(type.getClassLoader()
                        , type.getInterfaces()
                        , new BenchmarkInvocationHandler<T>((T) t));
            }
        }

        return (T) t;
    }
}
