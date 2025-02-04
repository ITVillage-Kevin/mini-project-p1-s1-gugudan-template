package com.itvillage.v2;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GuGuDanApplicationV2 {
    private static final int MIN_DAN = 2;
    private static final int MAX_DAN = 9;
    private static final int MULTIPLICATION_MIN_RANGE = 1;
    private static final int MULTIPLICATION_MAX_RANGE = 9;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isValidDan = false;

        while (!isValidDan) {
            // 입력: 특정 단 입력
            int dan = inputDan();

            // 입력 받은 단에 대한 유효성을 검증.
            isValidDan = isValidDan(dan);

            if (!isValidDan) {
                System.out.println("! 구구단은 2단에서 9단 까지의 숫자만 입력할 수 있습니다.");
            } else {
                // 구구단 로직 구현
                Stream<String> danResult = makeDanResult(dan);

                // 구구단 출력
                printDan(danResult);

            }
        }
    }

    private static int inputDan() {
        System.out.println("> 단을 입력해 주세요(2 - 9): ");

        return scanner.nextInt();
    }

    private static boolean isValidDan(int dan) {
        return dan >= MIN_DAN && dan <= MAX_DAN;
    }

    private static Stream<String> makeDanResult(int dan) {
        return Stream.of(dan)
                .flatMap(num ->
                        IntStream.range(MULTIPLICATION_MIN_RANGE, MULTIPLICATION_MAX_RANGE + 1)
                                .mapToObj(row -> num + " * " + row + " = " + num * row));
    }

    private static void printDan(Stream<String> danResult) {
        danResult.forEach(System.out::println);
    }
}
