package com.itvillage.common;

import java.util.Scanner;

public class ConsoleInputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputValue() {
        return scanner.nextInt();
    }

    public static void clearInputValue() {
        scanner.nextLine();
    }
}
