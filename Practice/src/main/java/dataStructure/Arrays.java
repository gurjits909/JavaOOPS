package dataStructure;

import com.sun.security.jgss.GSSUtil;

public class Arrays {
    public static int[] method()
    {
        return new int[]{111,222,333};
    }
    public static void main(String[] args) {
        int n=10;
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int duplicate_arr[];
        duplicate_arr=arr;//copying
        arr[0]=3333;
        //copied array to another
        for(int x:duplicate_arr)
            System.out.println(x);

        int []methodArray = method();

        System.out.println("Array recieved from method");
        for(int i=0;i<methodArray.length;i++)
        {
            System.out.println(methodArray[i]);
        }
    }
}
