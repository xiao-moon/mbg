package com.moon.utils;


import org.apache.commons.collections.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author moon
 * @date 2023-09-21 15:14
 * @description
 */
public class ValidationUtils {

    private static volatile Validator VALIDATOR;

    private ValidationUtils() {
    }

    /**
     * Gets validator, or create it.
     *
     * @return validator
     */
    public static Validator getValidatorOrCreate() {
        if (VALIDATOR == null) {
            synchronized (ValidationUtils.class) {
                if (VALIDATOR == null) {
                    // Init the validation
                    VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();
                }
            }
        }

        return VALIDATOR;
    }

    /**
     * Validates bean by hand and throw exception.
     *
     * @param obj    bean to be validated
     * @param groups validation group
     * @throws ConstraintViolationException throw if validation failure
     */
    public static void validateAndThrow(Object obj, Class<?>... groups) {

        Validator validator = getValidatorOrCreate();

        // Validate the object
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(obj, groups);

        if (CollectionUtils.isNotEmpty(constraintViolations)) {
            // If contain some errors then throw constraint violation exception
            throw new ConstraintViolationException(constraintViolations);
        }
    }

    /**
     * Validates bean by hand.
     *
     * @param obj    bean to be validated
     * @param groups validation group
     * @throws ConstraintViolationException throw if validation failure
     */
    public static boolean validate(Object obj, Class<?>... groups) {

        Validator validator = getValidatorOrCreate();

        // Validate the object
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(obj, groups);

        if (CollectionUtils.isNotEmpty(constraintViolations)) {
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

}
