package com.audintel.rohith;

public class staticDemo {
    static int var=10;
    public static void main(String[] args){
        static2 obj=new static2();
        System.out.println(obj.getStatic());
        static3 obj2=new static3();
        System.out.println(obj2.getStatic3());

    }

}
class static2{
    int getStatic(){
        return staticDemo.var;
    }
}
class static3{
    int getStatic3(){
        return staticDemo.var;
    }
}
