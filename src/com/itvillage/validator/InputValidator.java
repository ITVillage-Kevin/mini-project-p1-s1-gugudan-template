package com.itvillage.validator;

public class InputValidator {
    public static boolean isRangeNumber(int targetNumber, int fromNumber, int toNumber) {
        return targetNumber >= fromNumber && targetNumber <= toNumber;
    }
}
