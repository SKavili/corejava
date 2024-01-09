package com.audintel.functionalinterface;

//public class FunctionalInterface_SAM_Test implements SAM
//{
//    @Override
//    public void run() {
//        System.out.println("Impl");
//    }
//
//    public static void main(String[] args) {
//        FunctionalInterface_SAM_Test o = new FunctionalInterface_SAM_Test();
//        o.run();
//    }
//}

public class FunctionalInterface_SAM_Test
{
   SAM s = ()-> System.out.println("SAM");

    public static void main(String[] args) {
        FunctionalInterface_SAM_Test obj = new FunctionalInterface_SAM_Test();
        obj.s.run();
    }
}

@FunctionalInterface
interface SAM{
    void run();
}
