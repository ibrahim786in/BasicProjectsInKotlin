package com.example.ibrahim.task1;

/*interface Hello {
    //    private String ab;
    String Method1();

    String Method2();
}*/

public class AbstractTestClass {
    public static void main(String args[]) {
        TestClass testClass = new TestClass();
        System.out.println("Parent Class object: "+testClass.Method1());

        TestClass aClass = new New1();
        System.out.println(""+aClass.Method1());

        New1 a=new New1();
        System.out.println("Child Class object: "+a.Method1());

        TestClass test = a;
        System.out.println("Upcasting"+test.Method1());

        New1 new1 = (New1) aClass;
        System.out.println("Upcasting"+new1.Method1());

    }

}

class TestClass {
    public String Method1() {
        System.out.println();
        return "TestClass i.e Parent";
    }

    public String Method2() {
        return null;
    }

}


class New1 extends TestClass {

    public String Method1() {
        return "New1 class i.e Child";
    }

}

