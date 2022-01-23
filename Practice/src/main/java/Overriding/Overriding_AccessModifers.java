package Overriding;

class AccessModifires_parent {
    // private methods are not overridden
    private void m1()
    {
        System.out.println("From parent m1()");
    }

    protected void m2()
    {
        System.out.println("From parent m2()");
    }
}
class AccessModifires_Child extends AccessModifires_parent{
    // m1 method is not overridden , as its private
    private void m1()
    {
        System.out.println("From child m1()");
    }
    @Override
    public void m2()
    {
        System.out.println("From child m2()");
    }

}
public class Overriding_AccessModifers {
    public static void main(String[] args) {

        /*Can't override the private method, the method above , m1 is not overridden
        If a child override a method of parent class, then we can call the overridden
        method using the reference of parent and object of child
         > as m1 is private so its not overriden , so we can't call it using the reference of
         parent class and object of child class
         > as m2 is not private so it is overridden , so we can call it using the reference of
         parent class and object of child class
        */
        AccessModifires_parent ob =new AccessModifires_Child();
//        ob.m1();   ERROR
        ob.m2();

    }

}
