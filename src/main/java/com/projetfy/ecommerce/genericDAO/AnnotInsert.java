package com.projetfy.ecommerce.genericDAO;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AnnotInsert {
    boolean isNotInContent() default true;
}
