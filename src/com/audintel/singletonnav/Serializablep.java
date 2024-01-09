package com.audintel.singletonnav;

import java.io.*;

public class Serializablep {
    public static void main(String[] args){
        Input in=new Input();
        in.input(1,2344,"Navy");

        try{
            FileOutputStream fos=new FileOutputStream(("C:\\Users\\navne\\Documents\\szinput.txt"));
            ObjectOutputStream obj=new ObjectOutputStream(fos);
            obj.writeObject(in);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream fis=new FileInputStream(("C:\\Users\\navne\\Documents\\szinput.txt"));
            ObjectInputStream obj1=new ObjectInputStream(fis);
            Input i1 = (Input) obj1.readObject();
            System.out.println(i1.id);
            System.out.println(i1.name);
            System.out.println(i1.phone);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Input implements Serializable{
    int id;
    int phone;
    String name="";
    void input(int id,int phone,String name){
        this.name=name;
        this.id=id;
        this.phone=phone;
    }
}