package Inheritance;
/*
Invoking The Super Class Constructor
The program given in this section demonstrates how to use the super keyword to invoke the parametrized constructor of the
superclass. This program contains a superclass and a subclass, where the superclass contains a parameterized constructor
which accepts a integer value, and we used the super keyword to invoke the parameterized constructor of the superclass.
* */
class Cons_superClass{
    int a,b;

    Cons_superClass(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void getValue()
    {
        System.out.println("The two values are  = "+a+" "+b);
    }
}
public class InvokingSuperClassConstructor extends Cons_superClass{
    InvokingSuperClassConstructor(int a,int b)
    {
        super(a,b);
    }
    public static void main(String[] args) {
        InvokingSuperClassConstructor ob = new InvokingSuperClassConstructor(1,2);
         ob.getValue();
    }

}
