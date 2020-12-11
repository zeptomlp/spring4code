package cn.albers.knight.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
@Component
@Aspect
@Slf4j
public class Minstrel {

    @Pointcut("@annotation(cn.albers.knight.aspect.MinstrelNeeding)")
    public void annotationPointcut() {

    }

    @Around("annotationPointcut()")
    public void aroundEmbark(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        log.info("Fa la la, the knight is so brave!");
        proceedingJoinPoint.proceed();
        log.info("Tee hee hee, the brave knight did embark on a quest!");
    }

}
