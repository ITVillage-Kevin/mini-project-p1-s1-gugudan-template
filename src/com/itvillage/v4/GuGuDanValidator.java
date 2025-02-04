package com.itvillage.v4;

import com.itvillage.validator.InputValidator;

import static com.itvillage.v4.GuGuDanCalculator.MAX_DAN;
import static com.itvillage.v4.GuGuDanCalculator.MIN_DAN;

public class GuGuDanValidator {
    public static void validateDan(int dan) {
        if (!InputValidator.isRangeNumber(dan, MIN_DAN, MAX_DAN)) {
            throw new InvalidDanException("Out of range number");
        }
    }
}
