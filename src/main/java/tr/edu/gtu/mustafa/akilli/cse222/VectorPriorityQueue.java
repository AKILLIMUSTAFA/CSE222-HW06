package tr.edu.gtu.mustafa.akilli.cse222;

import java.util.Comparator;
import java.util.Vector;

/**
 * HW06_131044017_Mustafa_Akilli
 *
 * File:   VectorPriorityQueue
 *
 * Description:
 *
 * Vector Priority Queue
 *
 * @author Mustafa_Akilli
 * @since Tuesday 14 April 2016 by Mustafa_Akilli
 */
public class VectorPriorityQueue<E> implements PriorityQueueInterface<E>{

    /** The Vector to hold the data. */
    private Vector<E> theData;
    /** An optional reference to a Comparator object. */
    private Comparator<E> comparator = null;

    /**
     * One parameter Constructor
     */
    public VectorPriorityQueue(Comparator<E> newComparator){
        setTheData();
        setComparator(newComparator);
    }//end of the One parameter Constructor

    /**
     * Get The Data
     *
     * @return The Data
     */
    private Vector<E> getTheData() {
        return theData;
    }

    /**
     * Set The Data
     */
    private void setTheData() {
        this.theData = new Vector<E>();
    }

    /**
     * Get Comparator
     *
     * @return Comparator
     */
    private Comparator<E> getComparator() {
        return comparator;
    }

    /**
     * Set Comparator
     *
     * @param newComparator
     */
    private void setComparator(Comparator<E> newComparator) {
        this.comparator = newComparator;
    }


    /**
     * Insert an item into the priority vector.
     *
     * @param item The item to be inserted
     * @throws NullPointerException if the item to be inserted is null.
     * @pre The Vector theData is in heap order.
     * @post The item is in the priority queue and
     * theData is in heap order.
     */
    public boolean enqueue(E item) {
        //if the item to be inserted is null.
        if (item == null) {
            throw new NullPointerException();
        }

        // Add the item to the Vector.
        getTheData().add(item);
        // child is newly inserted item.
        int child =  size() - 1;
        int parent = (child - 1) / 2; // Find child's parent.


        while (parent >= 0 && compare(getTheData().get(parent),
                getTheData().get(child)) > 0) {
            swap(parent, child);
            child = parent;
            parent = (child - 1) / 2;
        }
        return true;
    }

    /**
     * Remove an item from the priority vector
     *
     * @return The item with the smallest priority value or null if empty.
     * @pre The Vector theData is in heap order.
     * @post Removed smallest item, theData is in heap order.
     */
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        // Save the top of the Vector.
        E result = getTheData().get(0);
        // If only one item then remove it.
        if (getTheData().size() == 1) {
            getTheData().remove(0);
            return result;
        }
        // Remove the last item from the Vector and place it into
        // the first position.
        getTheData().set(0, getTheData().remove(getTheData().size() - 1));
        // The parent starts at the top.
        int parent = 0;
        while (true) {
            int leftChild = 2 * parent + 1;
            if (leftChild >= getTheData().size()) {
                break; // Out of heap.
            }
            int rightChild = leftChild + 1;
            int minChild = leftChild; // Assume leftChild is smaller.
            // See whether rightChild is smaller.
            if (rightChild < getTheData().size() && compare(getTheData().get(leftChild),
                    getTheData().get(rightChild)) > 0) {
                minChild = rightChild;
            }
            // assert: minChild is the index of the smaller child.
            // Move smaller child up heap if necessary.
            if (compare(getTheData().get(parent),
                    getTheData().get(minChild)) > 0) {
                swap(parent, minChild);
                parent = minChild;
            } else { // Heap property is restored.
                break;
            }
        }
        return result;
    }

    /**
     * is Empty vector
     *
     * @return if vector is empty then return true, otherwise return false
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Size of Priority Queue
     *
     * @return size of Priority Queue
     */
    public int size() {
        return getTheData().size();
    }

    /**
     * Compare two items using either a Comparator object's compare method
     * or their natural ordering using method compareTo.
     * @pre If comparator is null, left and right implement Comparable<E>.
     * @param left One item
     * @param right The other item
     * @return Negative int if left less than right,
     *         0 if left equals right,
     *         positive int if left > right
     * @throws ClassCastException if items are not Comparable
     */
    private int compare(E left, E right) {
        if (getComparator() != null) { // A Comparator is defined.
            return getComparator().compare(left, right);
        } else { // Use left's compareTo method.
            return ((Comparable<E>) left).compareTo(right);
        }
    }

    /**
     * Swap left Value and Right value
     *
     * @param parent of child
     * @param child of parent
     */
    private void swap(int parent, int child){
        E temp = getTheData().get(child);
        getTheData().set(child,getTheData().get(parent));
        getTheData().set(parent,temp);
    }

}
