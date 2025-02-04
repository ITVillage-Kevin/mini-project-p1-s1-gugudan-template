package com.itvillage.v3;

import com.itvillage.common.ConsoleInputHandler;
import com.itvillage.common.ConsolePrinter;
import com.itvillage.validator.InputValidator;

import static com.itvillage.v3.GuGuDanCalculator.MAX_DAN;
import static com.itvillage.v3.GuGuDanCalculator.MIN_DAN;

public class GuGuDanApplicationV3 {
    public static void main(String[] args) {
        GuGuDanCalculator calculator = new GuGuDanCalculator();

        boolean isValidDan = false;

        while (!isValidDan) {
            // 입력: 특정 단 입력
            System.out.println("> 단을 입력해 주세요(2 - 9): ");

            int dan = ConsoleInputHandler.inputValue();

            // 입력 받은 단에 대한 유효성을 검증.
            isValidDan = InputValidator.isRangeNumber(dan, MIN_DAN, MAX_DAN);

            if (!isValidDan) {
                System.out.println("! 구구단은 2단에서 9단 까지의 숫자만 입력할 수 있습니다.");
            } else {
                // 구구단 로직 구현
                String danResult = calculator.calculate(dan);

                // 구구단 출력
                ConsolePrinter.println(danResult);

            }
        }
    }
}
