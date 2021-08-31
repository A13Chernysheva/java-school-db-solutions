package aop_advanced_example.aop;

import aop_advanced_example.DBException;
import lombok.SneakyThrows;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
@Aspect
public class ExceptionHandlerAspect {

    @Autowired
    private DBExceptionHandler dbExceptionHandler;


    @Pointcut("execution(* aop_advanced_example.services..*.*(..))")
    public void allBusinessMethods() {}


    @Before("allBusinessMethods() && @annotation(Deprecated)")
    public void handleOurDeprecatedMethods(JoinPoint joinPoint) {
        System.out.println("Что ж вы уроды, до сих пор не выпилили старые метода");
        object = joinPoint;
    }

    Object object;


    @Around("allBusinessMethods()")
    @SneakyThrows
    public Object handleDB(ProceedingJoinPoint joinPoint) {
        try {
            Object retVal = joinPoint.proceed();
            return retVal;
        } catch (DBException dbException) {
            String[] message = dbException.getMessage().split(" ");
            if (message[message.length - 1].equals("1")) {
                dbExceptionHandler.handle(dbException);
            }
            throw new DBException(dbException.getMessage() + "2");

        }
    }

}


