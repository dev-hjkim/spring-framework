package com.example.springframework.aop;

import java.lang.annotation.*;

/**
 * 성능을 로깅해주는 어노테이션
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PerfLogging {
}
