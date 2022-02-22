package com.ionutgradinaru.learning.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {MyDtoValidator.class})
public @interface MyAnnotation {

  String message() default "Invalid DTO.";

  Class<?>[] groups() default { };

  Class<? extends Payload>[] payload() default { };
}
