package com.audintel.sealed;

final public class SealedTest {
}

//class Test1 extends SealedTest{
//
//}
 sealed class Test2 permits T3,T4 {

}
final class T3 extends Test2{

}

final class T4 extends Test2{

}