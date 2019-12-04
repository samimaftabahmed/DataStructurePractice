package com.samhad.basics;

public class QueueDS {

    private int[] queue;
    private int size;
    private int front;
    private int rear;

    public QueueDS() {
        this.size = 50;
        this.queue = new int[this.size];
        this.front = -1;
        this.rear = -1;
    }

    public QueueDS(int size) {
        this.size = size;
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(int value) {
        this.queue[++rear] = value;
        System.out.println("Item added: " + value);
    }

    public void deQueue() {
        System.out.println("Item removed: " + this.queue[++front]);
    }


}
