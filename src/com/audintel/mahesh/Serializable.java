package com.audintel.mahesh;

import java.io.*;

public class Serializable {
    public static void main(String[] args) throws Exception{
        Student s=new Student();

        try {
            FileOutputStream fos = new FileOutputStream("test.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s);
            System.out.println("Reading from file");

            FileInputStream fis=new FileInputStream("test.txt");
            ObjectInputStream ois =new ObjectInputStream(fis);
            Student s1= (Student)ois.readObject();
            System.out.println(s1.name+" "+s1.rno);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Student implements java.io.Serializable {
    int age=20;
    String name="Mahesh";
    int rno=4;
}
