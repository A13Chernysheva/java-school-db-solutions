package real_spring;

import org.springframework.stereotype.Component;

@Component
public class A {
    void a() {
        B b = new B();
        b.b();
    }
}
