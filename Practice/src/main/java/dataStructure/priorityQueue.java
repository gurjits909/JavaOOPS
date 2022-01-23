package dataStructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(13);
        pq.add(15);
        pq.add(7);
        pq.add(8);
        pq.add(1);
        System.out.println("Top element of the queue "+pq.peek());

        System.out.println("Removing the top element of the queue "+pq.poll());

        System.out.println("Top element of the queue after removing the element "+pq.peek());

        //iterating through the priority queue
        Iterator it = pq.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
