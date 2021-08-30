package real_spring;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Aspect
@Component
public class QuoterAspect {

    /*
        @Before("execution(* real_spring..*.say*(..))")
        public void handleSayMethods() {
            System.out.print("Это цитата: ");
        }*/


  /*  @Before("execution(* real_spring..*.say*(..))")
    public void handleSayMethods(JoinPoint jp) {
        Object proxy = jp.getThis();
        System.out.println(proxy.getClass());
        String originalClassName = jp.getTarget().getClass().getSimpleName();
        System.out.print("Это цитата "+originalClassName+" : ");

    }*/

    @Value("${address}")
    String address;

    @SneakyThrows
    @Around("execution(* real_spring..*.*(..))")
    public Object handleDBException(ProceedingJoinPoint jp) {
        try {
            Object retVal = jp.proceed();
            return retVal;
        } catch (DBException dbException) {
            dbException.printStackTrace();
            System.out.println("sent to " + address + ". Error message: " + dbException.getMessage());
        }
        return null;
    }


    @Around("execution(* real_spring..*.say*(..))")
    @SneakyThrows
    public Object handleSayMethods(ProceedingJoinPoint jp) {
        System.out.println("started");
        Object retVal = jp.proceed();
        System.out.println("ended");
        return retVal;
    }

    //todo write an aspect which handle DBException, without breaking original exception handling if exists
    // send a mail with exception message to all addressees located in mails.properties
    //

}





