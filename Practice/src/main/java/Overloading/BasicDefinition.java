package Overloading;


// Java program to demonstrate working of method
// overloading in Java.

class Sum {

    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) {
        return (x + y);
    }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double parameters
    public double sum(double x, double y) {
        return (x + y);
    }
}
class Demo {
    public void show(int x)
    {
        System.out.println("In int " + x);
    }
    public void show(String s)
    {
        System.out.println("In String " + s);
    }
    public void show(byte b)
    {
        System.out.println("In byte " + b);
    }
}
public class BasicDefinition {
    public static void main(String[] args) {
        System.out.println("-------------------- Definition ----------------------");
        Sum s = new Sum();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));

        System.out.println("-------------------- Prototype doesn't match arguments ----------------------");
        /*1. Type Conversion but to higher type(in terms of range) in same family.
          2. Type conversion to next higher family(suppose if there is no long data
          type available for an int data type, then it will search for the float data type).
        */

        byte b = 12;
        Demo ob = new Demo();
        ob.show(b);
        ob.show("hello"); // String
        ob.show(250); // Int
        ob.show('A');// Since char is
        // not available, so the datatype
        // higher than char in terms of
        // range is int.


        //ob.show(7.5); since float datatype is not available and so it's higher datatype, so at this step their will be an error.

    }
}
