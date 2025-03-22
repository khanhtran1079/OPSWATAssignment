package com.opswat.part3.simplewaybyusingScanner;

import java.util.Scanner;

public class SimpleScript {
    private static int lastResult = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine().trim();
            if (command.startsWith("print ")) {
                System.out.println(command.substring(6));
            } else if (command.startsWith("add ")) {
                String[] parts = command.split(" ");
                lastResult = Integer.parseInt(parts[1]) + Integer.parseInt(parts[2]);
            } else if (command.startsWith("subtract ")) {
                String[] parts = command.split(" ");
                lastResult = Integer.parseInt(parts[1]) - Integer.parseInt(parts[2]);
            } else if (command.equals("print result")) {
                System.out.println("Result: " + lastResult);
            } else if (command.equals("exit")) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }
}
