package tr.edu.gtu.mustafa.akilli.cse222;

import junit.framework.TestCase;

/**
 * Created by MustafaMonster on 14.04.2016.
 */
public class LinkedListPriorityQueueTest extends TestCase {

    public void testEnqueue() throws Exception {
        MyComparator myComparator = new MyComparator();
        LinkedListPriorityQueue<Integer> linkedListPriorityQueue = new LinkedListPriorityQueue<Integer>(myComparator);
        boolean result;

        linkedListPriorityQueue.enqueue(5);
        linkedListPriorityQueue.enqueue(8);
        linkedListPriorityQueue.enqueue(1);

        if(1 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(8 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testDequeue() throws Exception {
        MyComparator myComparator = new MyComparator();
        LinkedListPriorityQueue<Integer> linkedListPriorityQueue = new LinkedListPriorityQueue<Integer>(myComparator);
        boolean result;

        linkedListPriorityQueue.enqueue(9);
        linkedListPriorityQueue.enqueue(5);
        linkedListPriorityQueue.enqueue(6);
        linkedListPriorityQueue.enqueue(3);
        linkedListPriorityQueue.enqueue(41);

        if(3 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(6 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(9 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(41 == linkedListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testIsEmpty() throws Exception {
        MyComparator myComparator = new MyComparator();
        LinkedListPriorityQueue<Integer> linkedListPriorityQueue = new LinkedListPriorityQueue<Integer>(myComparator);

        assertEquals(true,linkedListPriorityQueue.isEmpty());
        linkedListPriorityQueue.enqueue(5);
        assertEquals(false,linkedListPriorityQueue.isEmpty());
    }

    public void testSize() throws Exception {
        MyComparator myComparator = new MyComparator();
        LinkedListPriorityQueue<Integer> linkedListPriorityQueue = new LinkedListPriorityQueue<Integer>(myComparator);
        boolean result;

        if(0 == linkedListPriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        linkedListPriorityQueue.enqueue(5);

        if(1 == linkedListPriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }
}