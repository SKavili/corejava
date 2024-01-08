package com.audintel.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) throws Exception {
        finallyTest();
        simpleDemo1();
        simpleDemo2();
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

    private static void simpleDemo2() throws Exception{

        Scanner sc = new Scanner(new File("C:\\D\\useful-skaviligit.txt"));
        try (sc){

            System.out.println(sc.nextLine());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            sc.close();
        }
    }
}
