package tr.edu.gtu.mustafa.akilli.cse222;

import junit.framework.TestCase;

/**
 * Created by MustafaMonster on 14.04.2016.
 */
public class VectorPriorityQueueTest extends TestCase {

    public void testEnqueue() throws Exception {
        MyComparator myComparator = new MyComparator();
        VectorPriorityQueue<Integer> vectorPriorityQueue = new VectorPriorityQueue<Integer>(myComparator);
        boolean result;

        vectorPriorityQueue.enqueue(5);
        vectorPriorityQueue.enqueue(8);
        vectorPriorityQueue.enqueue(1);

        if(1 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(8 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testDequeue() throws Exception {
        MyComparator myComparator = new MyComparator();
        VectorPriorityQueue<Integer> vectorPriorityQueue = new VectorPriorityQueue<Integer>(myComparator);
        boolean result;

        vectorPriorityQueue.enqueue(9);
        vectorPriorityQueue.enqueue(5);
        vectorPriorityQueue.enqueue(6);
        vectorPriorityQueue.enqueue(3);
        vectorPriorityQueue.enqueue(41);

        if(3 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(6 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(9 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(41 == vectorPriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testIsEmpty() throws Exception {
        MyComparator myComparator = new MyComparator();
        VectorPriorityQueue<Integer> vectorPriorityQueue = new VectorPriorityQueue<Integer>(myComparator);

        assertEquals(true,vectorPriorityQueue.isEmpty());
        vectorPriorityQueue.enqueue(5);
        assertEquals(false,vectorPriorityQueue.isEmpty());
    }

    public void testSize() throws Exception {
        MyComparator myComparator = new MyComparator();
        VectorPriorityQueue<Integer> vectorPriorityQueue = new VectorPriorityQueue<Integer>(myComparator);
        boolean result;

        if(0 == vectorPriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        vectorPriorityQueue.enqueue(5);

        if(1 == vectorPriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }
}