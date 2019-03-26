package com.itonglian.fms.log;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface OperationLog {

    String description() default "";
}
