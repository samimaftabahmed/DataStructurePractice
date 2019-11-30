package com.samhad.basics;

import java.util.Scanner;

public class StackFunctions {


    public StackFunctions() {

        boolean loopCondition = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Provide size of stack or press 0 for default:");
        int size = sc.nextInt();
        StackDS stackDS;

        if (size == 0) {
            stackDS = new StackDS();

        } else {
            stackDS = new StackDS(size);
        }

        while (loopCondition) {

            System.out.println("Option:\t 1. Push\t 2. Pop\t 3.Peek Top\t 4. Show Stack\t 99. Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("Enter value to Push: ");
                    int value = sc.nextInt();
                    stackDS.push(value);

                    break;
                }
                case 2:
                    stackDS.pop();
                    break;
                case 3:
                    stackDS.peek();
                    break;
                case 4:
                    stackDS.showStack();
                    break;
                case 99:
                    System.out.println("Exiting...");
                    loopCondition = false;
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
