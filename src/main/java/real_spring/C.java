package real_spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class C {
    void c() throws DBException{
        throw new DBException("I am exception from C bean");
    }
}
