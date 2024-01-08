package com.audintel.Sandeep;

public class StaticDemo {

    static int counter = 0;

    static {
        System.out.println("Static block executed");
    }

    public static void incrementCounter() {
        counter++;
        System.out.println("Counter: " + counter);
    }

    public void printMessage() {
        System.out.println("Instance method called");
    }

    static class NestedClass {
        public void accessOuterCounter() {
            System.out.println("Counter from nested class: " + counter);
        }
    }

    public static void main(String[] args) {

        incrementCounter();

        StaticDemo obj = new StaticDemo();
        obj.printMessage();


        StaticDemo.NestedClass nested = new StaticDemo.NestedClass();
        nested.accessOuterCounter();

        System.out.println("Counter via object: " + obj.counter);
    }
}

