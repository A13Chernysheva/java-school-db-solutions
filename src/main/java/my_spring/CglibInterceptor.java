package my_spring;

import lombok.AllArgsConstructor;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@AllArgsConstructor
public class CglibInterceptor<T> implements MethodInterceptor {

    T t;

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if (method.isAnnotationPresent(Benchmark.class) || t.getClass().isAnnotationPresent(Benchmark.class)) {
            System.out.println("-------- BENCHMARK CGLIB STARTED FOR METHOD " + method.getName() + " --------");
            long start = System.nanoTime();
            Object retVal = methodProxy.invokeSuper(o, objects);
            long end = System.nanoTime();
            System.out.println(end - start);
            System.out.println("-------- BENCHMARK CGLIB ENDED FOR METHOD " + method.getName() + " --------");

            return retVal;

        }
        else {
            return methodProxy.invokeSuper(o, objects);
        }
    }
}
