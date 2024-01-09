package com.audintel.Vineeth;

import java.io.*;

public class Serializable_V {



    public static void main(String[] args) {
        Customer a = new Customer();
        a.custID = "20BD1A053D";
        a.name   = "Vineeth Sajjan";
        a.item   = "shampoo,soaps,onions";
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/vinee/IdeaProjects/corejava/src/com/audintel/Vineeth/Customer_Items");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(a);
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileInputStream fis = new FileInputStream("C:/Users/vinee/IdeaProjects/corejava/src/com/audintel/Vineeth/Customer_Items");
            ObjectInputStream obj = new ObjectInputStream(fis);



            Customer b = (Customer) obj.readObject();
            System.out.println(b.custID);
            System.out.println(b.name);
            System.out.println(b.item);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Customer implements Serializable {

    String custID;
    String name;
    String item;
}
