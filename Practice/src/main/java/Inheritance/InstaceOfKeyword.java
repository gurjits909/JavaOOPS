package Inheritance;
/*
IS-A Relationship (instanceof keyword)
Let us use the instanceof operator to check determine whether Mammal is actually an Animal, and dog is actually an Animal.
* */

class animal{

}
class mamal extends animal{

}
class raptile extends animal{

}
class dogs extends mamal{

}

public class InstaceOfKeyword extends dogs{
    public static void main(String[] args) {
        animal an = new animal();
        mamal ma = new mamal();
        raptile ra = new raptile();
        dogs dog = new dogs();


        System.out.println("-------------------animal-----------------------");
        System.out.println(an instanceof animal);
        System.out.println(ma instanceof animal);
        System.out.println(ra instanceof animal);
        System.out.println(dog instanceof animal);

        System.out.println("-------------------mamal-----------------------");
        System.out.println(ma instanceof mamal);
        //System.out.println(ra instanceof mamal);//error
        System.out.println(dog instanceof mamal);

        System.out.println("-------------------raptile-----------------------");
        System.out.println(ra instanceof raptile);
        System.out.println(ra instanceof animal);
//        System.out.println(dog instanceof raptile);//error

        System.out.println("-------------------dogs-----------------------");
        System.out.println(dog instanceof dogs);
        System.out.println(dog instanceof animal);
        System.out.println(dog instanceof mamal);

    }
}
