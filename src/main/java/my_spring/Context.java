package my_spring;

import lombok.Data;
import lombok.Getter;

public class Context {
    @Getter
    private final Config config = new JavaConfig();
}
