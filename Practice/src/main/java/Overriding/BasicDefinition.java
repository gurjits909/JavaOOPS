package Overriding;

import java.sql.SQLOutput;

class parent{
    public void show()
    {
        System.out.println("parent's Show method");
    }
}
class Child extends parent{
    public void show()
    {
        System.out.println("child's Show method");
    }
    public void simpleMethod()
    {
        System.out.println("hello world !! from simple method of child");
    }
}
public class BasicDefinition {
    public static void main(String[] args) {

        /* If a Parent type reference refers
         to a Parent object, then Parent's
         show is called*/
        System.out.println("---------------------------------------------------------");
        parent ob = new parent();
        ob.show();

        /* If a Parent type reference refers
         to a Child object Child's show()
         is called. This is called RUN TIME
         POLYMORPHISM.*/
        System.out.println("---------------------------------------------------------");
        parent ob2 = new Child();
        ob2.show();
//        ob2.simpleMethod(); i will throw error as the method is not overriden
        System.out.println("---------------------------------------------------------");
        Child ob3 = new Child();
        ob3.simpleMethod();
        ob3.show();
    }
}
