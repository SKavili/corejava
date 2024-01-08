package com.audintel.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        printAllLines();
    }

    private static void simpleDemo1()  {

        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\D\\useful-skaviligit.txt"));
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void printAllLines()  {

        Scanner sc = null;
        try {
            sc = new Scanner(new File("C:\\D\\useful-skaviligit.txt"));
            while(sc.hasNextLine())
            System.out.println(sc.nextLine());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
