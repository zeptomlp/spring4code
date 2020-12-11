package cn.albers.knight.aspect;

import java.lang.annotation.*;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MinstrelNeeding {

    String name() default "";

}
