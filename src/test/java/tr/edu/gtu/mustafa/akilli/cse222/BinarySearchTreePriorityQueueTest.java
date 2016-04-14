package tr.edu.gtu.mustafa.akilli.cse222;

import junit.framework.TestCase;

/**
 * Created by MustafaMonster on 14.04.2016.
 */
public class BinarySearchTreePriorityQueueTest extends TestCase {

    public void testEnqueue() throws Exception {
        MyComparator myComparator = new MyComparator();
        BinarySearchTreePriorityQueue<Integer> binarySearchTreePriorityQueue = new BinarySearchTreePriorityQueue<Integer>(myComparator);
        boolean result;

        binarySearchTreePriorityQueue.enqueue(5);
        binarySearchTreePriorityQueue.enqueue(8);
        binarySearchTreePriorityQueue.enqueue(1);

        if(1 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(8 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testDequeue() throws Exception {
        MyComparator myComparator = new MyComparator();
        BinarySearchTreePriorityQueue<Integer> binarySearchTreePriorityQueue = new BinarySearchTreePriorityQueue<Integer>(myComparator);
        boolean result;

        binarySearchTreePriorityQueue.enqueue(9);
        binarySearchTreePriorityQueue.enqueue(5);
        binarySearchTreePriorityQueue.enqueue(6);
        binarySearchTreePriorityQueue.enqueue(3);
        binarySearchTreePriorityQueue.enqueue(41);

        if(3 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(5 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(6 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(9 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        if(41 == binarySearchTreePriorityQueue.dequeue())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }

    public void testIsEmpty() throws Exception {
        MyComparator myComparator = new MyComparator();
        BinarySearchTreePriorityQueue<Integer> binarySearchTreePriorityQueue = new BinarySearchTreePriorityQueue<Integer>(myComparator);

        assertEquals(true,binarySearchTreePriorityQueue.isEmpty());
        binarySearchTreePriorityQueue.enqueue(5);
        assertEquals(false,binarySearchTreePriorityQueue.isEmpty());
    }

    public void testSize() throws Exception {
        MyComparator myComparator = new MyComparator();
        BinarySearchTreePriorityQueue<Integer> binarySearchTreePriorityQueue = new BinarySearchTreePriorityQueue<Integer>(myComparator);
        boolean result;

        if(0 == binarySearchTreePriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);

        binarySearchTreePriorityQueue.enqueue(5);

        if(1 == binarySearchTreePriorityQueue.size())
            result = true;
        else
            result = false;

        assertEquals(true,result);
    }
}