package com.audintel.io;

import java.io.*;

public class SerializableTest {



    public static void main(String[] args) {
        Account a1 = new Account();
        a1.id = 10;
        a1.acctID = "03170005693833";
        a1.name = "Sundar";


        Account a2 = new Account();
        a2.id = 20;
        a2.acctID = "980393";
        a2.name = "Sai";

        Account obj9[] = new Account[2];
        obj9[0]=a1;
        obj9[1]=a2;
        try {
            FileOutputStream fos = new FileOutputStream(new File("c:\\d\\workspace\\acct.txt"));
            ObjectOutputStream obj = new ObjectOutputStream(fos);

            obj.writeObject(obj9);
            obj.writeObject(a1);
            obj.writeObject(a2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // read from the file

        try {
            FileInputStream fis = new FileInputStream(new File("c:\\d\\workspace\\acct.txt"));
            ObjectInputStream obj = new ObjectInputStream(fis);
            Object obj99[] = (Object[]) obj.readObject();


            Account a9 = (Account) obj99[0];
            Account a99 = (Account) obj99[1];

            System.out.println(a9.name);
            Account a = (Account) obj.readObject();
            Account a3 = (Account) obj.readObject();
            System.out.println(a.acctID);
            System.out.println(a3.acctID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Account implements Serializable {
    int id;
    String acctID;
    String name;
}