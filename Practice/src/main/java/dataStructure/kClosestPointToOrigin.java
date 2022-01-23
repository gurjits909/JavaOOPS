package dataStructure;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int first,second;
    Pair(int first,int second)
    {
        this.first=first;
        this.second = second;
    }
    public int compareTo(Pair a)
    {
        int x1=first*first;
        int y1=second*second;
        int x2=a.first*a.first;
        int y2=a.second*a.second;
        return (x1+y1)-(x2+y2);
    }
}
public class kClosestPointToOrigin {
    public static void main(String[] args) {
        int x[]= new int[]{1,2,3,-5,1};
        int y[]= new int[]{0,1,6,2,-4};
        int k=3,n=x.length;

        PriorityQueue<Pair> qu = new PriorityQueue<Pair>();
        for(int i=0;i<n;i++)
        {
            qu.add(new Pair(x[i],y[i]));
        }

        for(int i=0;i<k;i++)
        {
            Pair temp = qu.poll();
            System.out.println(temp.first+" "+temp.second);
        }

    }
}
