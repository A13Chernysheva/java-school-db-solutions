package real_spring;

import lombok.SneakyThrows;
import my_spring.InjectRandomInt;
import my_spring.InjectRandomIntAnnotationObjectConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import utils.RandomUtil;

import java.lang.reflect.Field;

public class InjectRandomNameAnnotationBeanPostProcessor implements BeanPostProcessor {

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = bean.getClass();
        for (Field field : type.getDeclaredFields()) {
            InjectRandomName annotation = field.getAnnotation(InjectRandomName.class);
            if(annotation!=null){
                field.setAccessible(true);
                field.set(bean, RandomUtil.randomName());
            }
        }
        return bean;
    }

}
