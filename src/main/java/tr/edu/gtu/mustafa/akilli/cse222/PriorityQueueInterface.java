package tr.edu.gtu.mustafa.akilli.cse222;

/**
 * HW06_131044017_Mustafa_Akilli
 *
 * File:   PriorityQueueInterface
 *
 * Description:
 *
 * Priority Queue Interface
 *
 * @author Mustafa_Akilli
 * @since Tuesday 14 April 2016 by Mustafa_Akilli
 */
public interface PriorityQueueInterface<E> {

    /**
     * Insert an item into the priority queue.
     * pre The ArrayList theData is in heap order.
     * post The item is in the priority queue and
     *       theData is in heap order.
     * @param item The item to be inserted
     * @throws NullPointerException if the item to be inserted is null.
     * @return if anqueue is successfully than return true, othewise return false
     */
    boolean enqueue(E item);

    /**
     * Remove an item from the priority queue
     * pre The ArrayList theData is in heap order.
     * post Removed smallest item, theData is in heap order.
     * @return The item with the smallest priority value or null if empty.
     */
    E dequeue();

    /**
     * is Empty Queue
     *
     * @return if queue is empty then return true, otherwise return false
     */
    boolean isEmpty();

    /**
     * Size of Priority Queue
     *
     * @return size of Priority Queue
    */
    int size();
}
