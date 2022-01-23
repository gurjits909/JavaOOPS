package dataStructure;

public class StringBuilder_examples {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder str2 = new StringBuilder(str);

        // appending sequence in the end of the string
        System.out.println("Before appending the sequence : "+str2.length()+" "+str2.capacity());
        System.out.println(str2);
        str2.append(" Gurjit");

        System.out.println("After appending the sequence : "+str2.length()+" "+str2.capacity());
        System.out.println(str2);

        // accessing the value at specific index
        System.out.println("Value at index 0 : "+str2.charAt(0));
        //index of first character of given value
        System.out.println("First Occurence of l : "+ str2.indexOf("l"));
        //index of last character of given value
        System.out.println("First Occurence of l : "+ str2.lastIndexOf("l"));
        //replace string at specific index
        str2.replace(0,1,"M");
        System.out.println("After replacing first char with M : "+str2);
        str2.setCharAt(0,'H');
        System.out.println("After replacing first char with H again : "+str2);
        System.out.println(str2);
        //substring starting from index goes it end
        System.out.println("Substring starting with index 6 : "+str2.substring(6));
        //substring starting from index start and goes it end index
        System.out.println("Substring starting with index 6 : "+str2.substring(6,8));
    }
}
