package tr.edu.gtu.mustafa.akilli.cse222;

import junit.framework.TestCase;

/**
 * Created by MustafaMonster on 14.04.2016.
 */
public class ArrayListPriorityQueueTest extends TestCase {

    public void testEnqueue() throws Exception {
        MyComparator myComparator = new MyComparator();
        ArrayListPriorityQueue<Integer> arrayListPriorityQueue = new ArrayListPriorityQueue<Integer>(myComparator);
        boolean result;

        arrayListPriorityQueue.enqueue(5);
        arrayListPriorityQueue.enqueue(8);
        arrayListPriorityQueue.enqueue(1);

        if(1 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(8 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testDequeue() throws Exception {
        MyComparator myComparator = new MyComparator();
        ArrayListPriorityQueue<Integer> arrayListPriorityQueue = new ArrayListPriorityQueue<Integer>(myComparator);
        boolean result;

        arrayListPriorityQueue.enqueue(9);
        arrayListPriorityQueue.enqueue(5);
        arrayListPriorityQueue.enqueue(6);
        arrayListPriorityQueue.enqueue(3);
        arrayListPriorityQueue.enqueue(41);

        if(3 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(6 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(9 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(41 == arrayListPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testIsEmpty() throws Exception {
        MyComparator myComparator = new MyComparator();
        ArrayListPriorityQueue<Integer> arrayListPriorityQueue = new ArrayListPriorityQueue<Integer>(myComparator);

        assertEquals(true,arrayListPriorityQueue.isEmpty());
        arrayListPriorityQueue.enqueue(5);
        assertEquals(false,arrayListPriorityQueue.isEmpty());
    }

    public void testSize() throws Exception {
        MyComparator myComparator = new MyComparator();
        ArrayListPriorityQueue<Integer> arrayListPriorityQueue = new ArrayListPriorityQueue<Integer>(myComparator);
        boolean result;

        if(0 == arrayListPriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        arrayListPriorityQueue.enqueue(5);

        if(1 == arrayListPriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }
}