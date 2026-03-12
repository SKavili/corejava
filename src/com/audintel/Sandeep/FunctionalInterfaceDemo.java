package com.audintel.Sandeep;

@FunctionalInterface

interface Square {
    int calculate(int x);
}

class FunctionalInterfaceDemo {
    public static void main(String[] args)
    {
        int a = 5;

        Square s = (int x) -> x * x;

        int ans = s.calculate(a);
        System.out.println(ans);
    }
}


//public class FunctionalInterfaceDemo implements interface_test{
//    public static void main(String[] args) {
//        FunctionalInterfaceDemo obj=new FunctionalInterfaceDemo();
//        obj.run();
//    }
//
//    @Override
//    public void run() {
//        System.out.println("Func_Interface");
//    }
//
//}
//
//
//@FunctionalInterface
//interface interface_test{
//    void run();
//}