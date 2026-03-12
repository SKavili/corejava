package com.audintel.Sandeep;

public class OuterClass {

    int a = 10;

    class InnerClass {
        public void accessOuterNumber() {
            System.out.println("Accessing outerNumber from inner class: " + a);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuterNumber();
    }
}

