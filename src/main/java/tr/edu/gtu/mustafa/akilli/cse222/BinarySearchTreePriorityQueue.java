package tr.edu.gtu.mustafa.akilli.cse222;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 * HW06_131044017_Mustafa_Akilli
 *
 * File:   BinarySearchTreePriorityQueue
 *
 * Description:
 *
 * Binary Search Tree Priority Queue
 *
 * @author Mustafa_Akilli
 * @since Tuesday 14 April 2016 by Mustafa_Akilli
 */
public class BinarySearchTreePriorityQueue<E extends Comparable<E>> implements PriorityQueueInterface<E>{

    /** The BinarySearchTree to hold the data. */
    private BinarySearchTree<E> theData;
    /** An optional reference to a Comparator object. */
    private Comparator<E> comparator = null;

    /**
     * One parameter Constructor
     *
     * @param newComparator for the tree
     */
    public BinarySearchTreePriorityQueue(Comparator<E> newComparator){
        setTheData();
        setComparator(newComparator);
    }//end of the One parameter Constructor

    /**
     * Get The Data
     *
     * @return The Data
     */
    private BinarySearchTree<E> getTheData() {
        return theData;
    }

    /**
     * Set The Data
     */
    private void setTheData() {
        this.theData = new BinarySearchTree<E>();
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
     * @param newComparator for the tree
     */
    private void setComparator(Comparator<E> newComparator) {
        this.comparator = newComparator;
    }

    /**
     * Insert an item into the priority queue.
     *
     * @param item The item to be inserted
     * @throws NullPointerException if the item to be inserted is null.
     * pre The BinarySearchTree theData is in heap order.
     * post The item is in the priority queue and
     * theData is in heap order.
     * @return if anqueue is successfully than return true, othewise return false
     */
    public boolean enqueue(E item) {

        //if the item to be inserted is null.
        if (item == null) {
            throw new NullPointerException();
        }

        // Add the item to the BinarySearchTree.
        return getTheData().add(item);
    }

    /**
     * Remove an item from the priority queue
     *
     * @return The item with the smallest priority value or null if empty.
     * pre The BinarySearchTree theData is in heap order.
     * post Removed smallest item, theData is in heap order.
     */
    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        return getTheData().delete(findBiggestPriorityElement());
    }

    private E findBiggestPriorityElement(){
        BinaryTree.Node<E> localRoot = getTheData().root;

        /*Find Smallest Element */
        while(localRoot.left != null){
            localRoot = localRoot.left;
        }

        return localRoot.data;
    }

    /**
     * is Empty Queue
     *
     * @return if queue is empty then return true, otherwise return false
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
        /*Make iterator */
        Iterator<E> iter = getTheData().iterator(); /*Iterator */
        int size = 0;

        /*Find Size */
        while(iter.hasNext()){
            iter.next();
            ++size;
        }

        return size;
    }

    /**
     * Compare two items using either a Comparator object's compare method
     * or their natural ordering using method compareTo.
     * pre If comparator is null, left and right implement Comparable.
     * @param left One item
     * @param right The other item
     * @return Negative int if left less than right,
     *         0 if left equals right,
     *         positive int if left bigger than right
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
     * Starter method add.
     * pre The object to insert must implement the
     *      Comparable interface.
     * @param item The object being inserted
     * @return true if the object is inserted, false
     *         if the object already exists in the tree
     */

    private boolean add(E item) {
        getTheData().root.data = add(getTheData().root, item);
        return getTheData().addReturn;
    }

    /**
     * Recursive add method.
     * post The data field addReturn is set true if the item is added to
     *       the tree, false if the item is already in the tree.
     * @param localRoot The local root of the subtree
     * @param item The object to be inserted
     * @return The new local root that now contains the
     *         inserted item
     */
    private E add(BinaryTree.Node<E> localRoot, E item) {
        if (localRoot == null) {
            // item is not in the tree insert it.
            getTheData().addReturn = true;
            return item;
        } else if (compare(item, localRoot.data) == 0) {
            // item is equal to root
            getTheData().addReturn = false;
            return localRoot.data;
        } else if (compare(item, localRoot.data) < 0) {
            // item is less than localRoot.data
            localRoot.left.data = add(localRoot.left, item);
            return localRoot.data;
        } else {
            // item is greater than localRoot.data
            localRoot.right.data = add(localRoot.right, item);
            return localRoot.data;
        }
    }

}
