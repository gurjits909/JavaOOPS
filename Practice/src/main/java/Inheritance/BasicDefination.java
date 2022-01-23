package Inheritance;
class calculation {
    int z;
    public void addition(int a,int b)
    {
        z = a+b;
        System.out.println("The sum of the given numbers = "+z);
    }
    public void subtraction(int a,int b)
    {
        z=a-b;
        System.out.println("The difference between two numbers = "+ z);
    }
}
public class BasicDefination extends calculation{
    public void multiplication(int a,int b)
    {
        z = a*b;
        System.out.println("The product of the given numbers = "+ z);
    }
    public static void main(String arg[])
    {
        /*
        1. Created a class calcuation with two method addition and subtraction
        2. Extended the calculation class in BasicDefination(it has one method : multiplication)
        3. Create an object of BasicDefination and implement the calculation class methods

        Explanation :
        when an object to BasicDefination class is created, a copy of the contents of the superclass(calculation) is made within it.
         */
        System.out.println("-----------------------------------------------------");

        System.out.println("Reference of subclass with the object of subclass");

        System.out.println("-----------------------------------------------------");

        BasicDefination ob=new BasicDefination();
        ob.addition(1,2);
        ob.subtraction(21,12);
        ob.multiplication(4,5);

        System.out.println("-----------------------------------------------------");
        System.out.println("Reference of super class with the object of subclass");
        System.out.println("-----------------------------------------------------");
        /*
        The Superclass(calculation) reference variable can hold the subclass(BasicDefination) object, but using that variable you can access
        only the members of the superclass, so to access the members of both classes it is recommended to always
        create reference variable to the subclass.
         */

        calculation ob2 = new BasicDefination();
        ob2.addition(10,5);
        ob2.subtraction(10,5);

        System.out.println("-----------------------------------------------------");
        /*ob2.multiplication(4,5);  this will throw error*/

        /*
        Reference of subclass() holding the object of super class will throw errors
        BasicDefination ob3 = new calculation();   //error
         */
    }
}
