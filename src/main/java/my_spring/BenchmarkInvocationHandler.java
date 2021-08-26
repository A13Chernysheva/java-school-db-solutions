package my_spring;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

@AllArgsConstructor
public class BenchmarkInvocationHandler<T> implements InvocationHandler {

    T t;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.isAnnotationPresent(Benchmark.class) || t.getClass().isAnnotationPresent(Benchmark.class)) {

            System.out.println("********BENCHMARK STARTED FOR METHOD " + method.getName() + " **********");
            long start = System.nanoTime();
            Object retVal = method.invoke(t, args);
            long end = System.nanoTime();
            System.out.println(end - start);

            System.out.println("********BENCHMARK ENDED FOR METHOD " + method.getName() + " **********");

            return retVal;

        }
        else {
            return method.invoke(t, args);
        }
    }
}
