package com.itvillage.v1;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GuGuDanApplicationV1 {
    private static final int MIN_DAN = 2;
    private static final int MAX_DAN = 9;
    private static final int MULTIPLICATION_MIN_RANGE = 1;
    private static final int MULTIPLICATION_MAX_RANGE = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValidDan = false;

        while (!isValidDan) {
            // 입력: 특정 단 입력
            System.out.println("> 단을 입력해 주세요(2 - 9): ");
            int dan = scanner.nextInt();

            // 입력 받은 단에 대한 유효성을 검증.
            isValidDan = dan >= MIN_DAN && dan <= MAX_DAN;

            if (!isValidDan) {
                System.out.println("! 구구단은 2단에서 9단 까지의 숫자만 입력할 수 있습니다.");
            } else {
                // 구구단 로직 구현
                Stream.of(dan)
                        .flatMap(num ->
                                IntStream.range(MULTIPLICATION_MIN_RANGE, MULTIPLICATION_MAX_RANGE + 1)
                                .mapToObj(row -> num + " * " + row + " = " + num * row))
                        .forEach(System.out::println); // 구구단 출력
            }
        }
    }
}
