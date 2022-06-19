package com.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ChaeckEmailValidator implements ConstraintValidator<CheckEamil,String> {

    private String endOfEMAIL;

    @Override
    public void initialize(CheckEamil checkEamil) {
    endOfEMAIL= checkEamil.value();
    }

    @Override
    public boolean isValid(String enteradvalue, ConstraintValidatorContext context) {
        return enteradvalue.endsWith(endOfEMAIL);
    }
}
