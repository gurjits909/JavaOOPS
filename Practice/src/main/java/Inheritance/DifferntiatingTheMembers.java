package Inheritance;
/*
The super keyword
The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used.
    > It is used to differentiate the members of superclass from the members of subclass, if they have same names.
    > It is used to invoke the superclass constructor from subclass.
* */
class superClass{
    int num=10;
    public void display()
    {
        System.out.println("I am the display method of superClass");
    }
}
public class DifferntiatingTheMembers extends superClass{
    int num=20;
    public void display()
    {
        System.out.println("I am the display method of subclass");
    }
    public void myCallMethod()
    {
        // Instantiating subclass
        DifferntiatingTheMembers ob= new DifferntiatingTheMembers();
        // Invoking the display() method of sub class
        ob.display();
        // Invoking the display() method of superclass
        super.display();
        // printing the value of variable num of subclass
        System.out.println("Variable num in subClass "+ob.num);
        // printing the value of variable num of superclass
        System.out.println("Variable num in superClass "+super.num);
    }
    public static void main(String[] args) {
        DifferntiatingTheMembers ob = new DifferntiatingTheMembers();
        ob.myCallMethod();
    }
}
