package com.audintel.yagnesh;



import java.io.*;

public class Serializable_test {
    public static void main(String[] args) {
        Laptop lp=new Laptop();
        lp.id=12342;
        lp.holder_name="shiva";
        Laptop lp1=new Laptop();
        lp1.id=15381;
        lp1.holder_name="naresh";

        try {
            FileOutputStream fos = new FileOutputStream(new File("C:/Users/yagne/Downloads/laptop.txt"));
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(lp);
            obj.writeObject(lp1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream(new File("C:/Users/yagne/Downloads/laptop.txt"));
            ObjectInputStream obj = new ObjectInputStream(fis);
            Laptop ob=(Laptop) obj.readObject();
            System.out.println(ob.id);
            System.out.println(ob.holder_name);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class Laptop implements Serializable{
    int id;
    String holder_name;
}