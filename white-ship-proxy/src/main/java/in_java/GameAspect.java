package in_java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GameAspect {
    @Around("bean(gameService)")
    public void timestamp(ProceedingJoinPoint joinPoint) {
        long before = System.currentTimeMillis();
        try {
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        System.out.println(System.currentTimeMillis() - before + "ms");
    }
}
