package com.example.ibrahim.task1;

/*interface Hello {
    //    private String ab;
    String Method1();

    String Method2();
}*/

public class AbstractTestClass {
    public static void main(String args[]) {
//        ParentClass parentClassObj = new ParentClass();
//        System.out.println("Parent Class object: " + parentClassObj.Method1());

        ParentClass parentObj1 = new Child1();
        System.out.println("\nUp-casting from Child1 : " + parentObj1.Method1());
        System.out.println("Up-casting from Child1 : " + parentObj1.Method2());
//System.out.println("Up-casting from Child1 : " + parentObj1.Method3());  /* U can't call Method3 using parentObj1 */

/*
        Child1 c1 = new Child1();
        System.out.println("\nChild Class object: " + c1.Method1());

        ParentClass upcastingTest1 = c1;
        System.out.println("\nUp-casting-casting:  " + upcastingTest1.Method1());
        System.out.println("\nUp-casting-casting:  " + upcastingTest1.Method2());
*/

      /*  ParentClass downCatingTest1 = parentObj1;
        System.out.println("\ndown-casting:  " + downCatingTest1.Method1());
        System.out.println("\ndown-casting:  " + downCatingTest1.Method2());
*/
        Child1 Child1 = (Child1) parentObj1;
        System.out.println("\nDown-casting :" + Child1.Method1());
        System.out.println("Down-casting :" + Child1.Method2());
        System.out.println("Down-casting :" + Child1.Method3());

        ParentClass parentObj2 = new Child2();
        System.out.println("\n Upcasting from Child 2 :" + parentObj2.Method1());
        System.out.println("\n Upcasting from Child 2 :" + parentObj2.Method2());

        Child2 Child2 = (Child2) parentObj2;
        System.out.println("Down-casting :" + Child2.Method1());
        System.out.println("Down-casting :" + Child2.Method2());


    }

}

class ParentClass {
    public String Method1() {
        System.out.println();
        return "ParentClass Method1 call";
    }

    public String Method2() {
        return "ParentClass Method2 call";
    }

}


class Child1 extends ParentClass {

    public String Method1() {
        return "Child1 class Method1 call";
    }

    public String Method3() {
        return "Child1 class Method3 call";
    }

}

class Child2 extends ParentClass {

    public String Method1() {
        return "Child2 class Method1 call";
    }

}

