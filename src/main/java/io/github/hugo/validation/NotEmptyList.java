package io.github.hugo.validation;

import io.github.hugo.validation.constraintvalidation.NotEmptyListValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Constraint(validatedBy = NotEmptyListValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotEmptyList {

    String message() default "A lista não pode ser vazia. ";
    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
