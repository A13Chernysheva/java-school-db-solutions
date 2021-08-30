package real_spring;

import org.springframework.stereotype.Component;

@Component
public class B {
    void b(){
        C repository = new C();
        repository.c();
    };
}
