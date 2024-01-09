package com.audintel.saitejam;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        Account a1 = new Account(2918731,"832748237","Sai Teja M");
//        SerializeOut(a1);
        Account a2 = SerializeIn();
        System.out.println(a2.accid);
    }
    public static void SerializeOut(Account a1){
        try {
            FileOutputStream fos = new FileOutputStream(("D:\\Serializable Files Demo\\Doc.txt"));
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(a1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static Account SerializeIn(){
        Account a = null;
        try{
            FileInputStream fis = new FileInputStream(("D:\\Serializable Files Demo\\Doc.txt"));
            ObjectInputStream ois = new ObjectInputStream(fis);
            a = (Account) ois.readObject();
        }catch(Exception e){
            e.printStackTrace();
        }
        return a;
    }
}

class Account implements Serializable {
    int accid;
    String name;
    String accno;
    Account(int accid, String accno, String name){
        this.accid = accid;
        this.accno = accno;
        this.name = name;
    }
}

