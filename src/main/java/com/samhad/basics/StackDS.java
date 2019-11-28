package com.samhad.basics;

public class StackDS {

    private int[] stack;
    private int top;
    private int size;


    public StackDS() {
        this.top = -1;
        this.size = 50;
        this.stack = new int[50];
    }


    public StackDS(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new int[size];
    }


    public void push(int value) {

        if (top < size - 1) {
            top++;
            this.stack[top] = value;
            System.out.println("Inserted: " + value);

        } else {
            System.out.println("Stack Full with " + this.size);
        }
    }


    public void pop() {

        if (top != -1) {
            System.out.println("Popped: " + stack[top--]);

        } else {
            System.out.println("Stack Empty");
        }
    }


    public void showStack() {

        if (top == -1) {
            System.out.println("Stack Empty");

        } else {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i <= top; i++) {

                if (i != 0) {
                    sb.append(",");
                }

                sb.append(stack[i]);
            }

            System.out.println("Stack Elements: " + sb.toString());
        }
    }
}
