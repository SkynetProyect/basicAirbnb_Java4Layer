package udemedellin.com.co.basicAirbnb.aspectos;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    @Before("execution(* udemedellin.com.co.basicAirbnb.controller..*(..))")
    public void logBeforeExecution(JoinPoint joinPoint) {
        System.out.println("Antes de ejecutar el método: " + joinPoint.getSignature().getName());
    }

    @Around("execution(* udemedellin.com.co.basicAirbnb.controller..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long elapsedTime = System.currentTimeMillis() - start;
        System.out.println("Tiempo de ejecución del método " + joinPoint.getSignature().getName() +
                ": " + elapsedTime + " ms");

        return result;
    }

    @After("execution(* udemedellin.com.co.basicAirbnb.controller..*(..))")
    public void logAfterExecution(JoinPoint joinPoint) {
        System.out.println("Después de ejecutar el método: " + joinPoint.getSignature().getName());
    }

}