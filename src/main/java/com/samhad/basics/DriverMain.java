package com.samhad.basics;

import java.util.Scanner;

public class DriverMain {

    public static void main(String[] args) {

        System.out.println("Options:\t 1. Stack\t 2. Queue");
        Scanner scanner = new Scanner(System.in);
        int dsChoice = scanner.nextInt();

        switch (dsChoice) {

            case 1:
                new StackFunctions();
                break;

            case 2:
                new QueueFunctions();
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}
