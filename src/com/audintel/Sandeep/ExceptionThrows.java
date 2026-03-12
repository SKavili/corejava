package com.audintel.Sandeep;

public class ExceptionThrows {

        public static void divide(int a, int b) throws ArithmeticException {
            try {
                int result = a / b;
            } catch (ArithmeticException e) {
                throw new ArithmeticException("Division by zero");
            }
        }

        public static void main(String[] args) {
            try {
                divide(10, 0);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException caught: " + e.getMessage());
            }
        }
}



