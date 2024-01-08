package com.audintel.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FinallyTest {
    public static void main(String[] args) {
        finallyTest();
        simpleDemo1();
    }

    private static void finallyTest() {
        try {

        } finally {
            System.out.println("In finally block");
        }
    }

    private static void simpleDemo1() {

        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\D\\useful-skaviligit.txt"));
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            sc.close();
        }
    }
}
