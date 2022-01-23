package dataStructure;

//import java.util.List;
import java.util.*;
import java.util.stream.*;
public class StringClass {
    public static void main(String[] args) {
        //comparing two strings
        String str1,str2;
        str1= new String("gurjit");
        str2="Gurjit";
        System.out.println(str1=="gurjit");
        System.out.println(str1.equalsIgnoreCase(str2));

        //Convert a string to space separated array of string , then convert the array of string to list
        String str = "Gurjit Singh";
        String[] spaceSep = str.split(" ");
        List<String> ls_string = new ArrayList<String>();
        Collections.addAll(ls_string, spaceSep);
        for(int i=0;i<spaceSep.length;i++)
        {
            System.out.println(ls_string.get(i));
        }
        // getting a substring

    }
}
