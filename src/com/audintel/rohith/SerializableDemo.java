package com.audintel.rohith;

import java.io.*;

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       Bike myBike =new Bike();
       myBike.model=2023;
       myBike.modelName="Apache1604v";
       myBike.color="black";
       //writing the object
        FileOutputStream fos=new FileOutputStream("C:/Users/vanap/IdeaProjects/serial.txt");
        ObjectOutputStream out=new ObjectOutputStream(fos);
        out.writeObject(myBike);
        //reading the file
        FileInputStream fis=new FileInputStream("C:/Users/vanap/IdeaProjects/serial.txt");
        ObjectInputStream in=new ObjectInputStream(fis);
          Bike obj=(Bike)in.readObject();
        System.out.println(obj.model);
        System.out.println(obj.modelName);

    }
}
class Bike implements Serializable {
    int model;
    String modelName;
    String color;
    int mileage;

}

