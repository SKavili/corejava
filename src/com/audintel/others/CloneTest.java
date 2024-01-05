package com.audintel.others;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test t = new Test();
          Object obj =  t.clone();
        System.out.println(t.a);
        System.out.println(t.b);

        Test t1 = (Test)obj;

        System.out.println(t1.a);
        System.out.println(t1.b);
        t.a=30;
        t1.b=40;

        System.out.println(t.a);
        System.out.println(t.b);


        System.out.println("t1.a" + t1.a);
        System.out.println("t1.b"+ t1.b);


        Test t2=t1;
        t2.a=30;
        System.out.println(t1.a);

    }
}

class Test implements Cloneable {
    int a =10;
    int b=20;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }


    /*
    Test t1= new Test();
    t1.a=10;
    Test t2= new Test();

    Test t3=t1.clone();
    Test t4=t1;

t2=t1;

     */
}
