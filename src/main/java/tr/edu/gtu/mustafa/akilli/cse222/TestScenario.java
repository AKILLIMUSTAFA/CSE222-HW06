package tr.edu.gtu.mustafa.akilli.cse222;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * HW06_131044017_Mustafa_Akilli
 *
 * File:   TestScenario
 *
 * Description:
 *
 * Test Scenario
 *
 * @author Mustafa_Akilli
 * @since Tuesday 13 April 2016 by Mustafa_Akilli
 */
public class TestScenario
{
    public static void main( String[] args )
    {
        HuffmanTree huffmanTree = new HuffmanTree();

        // Create symbol array
        HuffmanTree.HuffData[] symbols = {
                new HuffmanTree.HuffData(186, '_'),
                new HuffmanTree.HuffData(103, 'e'),
                new HuffmanTree.HuffData(80, 't'),
                new HuffmanTree.HuffData(64, 'a'),
                new HuffmanTree.HuffData(63, 'o'),
                new HuffmanTree.HuffData(57, 'i'),
                new HuffmanTree.HuffData(57, 'n'),
                new HuffmanTree.HuffData(51, 's'),
                new HuffmanTree.HuffData(48, 'r'),
                new HuffmanTree.HuffData(47, 'h'),
                new HuffmanTree.HuffData(32, 'd'),
                new HuffmanTree.HuffData(32, 'l'),
                new HuffmanTree.HuffData(23, 'u'),
                new HuffmanTree.HuffData(22, 'c'),
                new HuffmanTree.HuffData(21, 'f'),
                new HuffmanTree.HuffData(20, 'm'),
                new HuffmanTree.HuffData(18, 'w'),
                new HuffmanTree.HuffData(16, 'y'),
                new HuffmanTree.HuffData(15, 'g'),
                new HuffmanTree.HuffData(15, 'p'),
                new HuffmanTree.HuffData(13, 'b'),
                new HuffmanTree.HuffData(8, 'v'),
                new HuffmanTree.HuffData(5, 'k'),
                new HuffmanTree.HuffData(1, 'j'),
                new HuffmanTree.HuffData(1, 'q'),
                new HuffmanTree.HuffData(1, 'x'),
                new HuffmanTree.HuffData(1, 'z')
        };

        // Build hufffman tree
        huffmanTree.buildTree(symbols);

        System.out.println("PART 1 TEST");
        System.out.println();

        /*Print to screen */
        (huffmanTree).toString();

        /*Print stars*/
        System.out.println("********************");

        /*Print*/
        System.out.println("mustafa : " + huffmanTree.encode("mustafa",huffmanTree.huffTree));
        System.out.println("akilli  : " + huffmanTree.encode("akilli",huffmanTree.huffTree));
        System.out.println("&       : " + huffmanTree.encode("*",huffmanTree.huffTree));


        System.out.println();
        System.out.println();
        System.out.println("PART 2 TEST");
        System.out.println();

        BinarySearchTree<Integer> Btree = new BinarySearchTree<Integer>();
        Btree.add(2);
        Btree.add(1);
        Btree.add(12);
        Btree.add(20);
        Btree.add(11);
        Btree.add(0);
        Btree.add(15);

        /*Print to screen */
        System.out.println(Btree.toString());

        /*Make iterator */
        Iterator<Integer> iter = Btree.iterator(); /*Iterator */

        /*Print all element */
        while(iter.hasNext()){
            System.out.print(iter.next());
            if(iter.hasNext())
                System.out.print("-");
        }
        System.out.println();

        /*Make iterator */
        iter = Btree.iterator(); /*Iterator */

        /*Remove 12 */
        while(iter.hasNext()){
            if(iter.next() == 12){
                iter.remove();
                System.out.println("Remove 12: ");
            }
        }

        /*Make iterator */
        iter = Btree.iterator(); /*Iterator */

        /*Print all element */
        while(iter.hasNext()){
            System.out.print(iter.next());
            if(iter.hasNext())
                System.out.print("-");
        }







        MyComparator myComparator = new MyComparator();
        ArrayListPriorityQueue<Integer> arrayListPriorityQueue = new ArrayListPriorityQueue<Integer>(myComparator);
        VectorPriorityQueue<Integer> vectorPriorityQueue = new VectorPriorityQueue<Integer>(myComparator);
        LinkedListPriorityQueue linkedListPriorityQueue = new LinkedListPriorityQueue(myComparator);
        BinarySearchTreePriorityQueue<Integer> binarySearchTreePriorityQueue = new BinarySearchTreePriorityQueue<Integer>(myComparator);
        ArrayList<Integer> myArrayList1 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList10 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList100 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList1000 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList10000 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList100000 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList1000000 = new ArrayList<Integer>();
        ArrayList<Integer> myArrayList10000000 = new ArrayList<Integer>();

        long startTime;
        int randomNumber;
        int size;
        long endTime;
        long timeofExe;

        /* For 1 */
        for (int index = 0; index < 1; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList1.add(randomNumber);
        }

        /* For 10 */
        for (int index = 0; index < 10; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList10.add(randomNumber);
        }

        /* For 100 */
        for (int index = 0; index < 100; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList100.add(randomNumber);
        }

        /* For 1.000 */
        for (int index = 0; index < 1000; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList1000.add(randomNumber);
        }

        /* For 10.000 */
        for (int index = 0; index < 10000; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList10000.add(randomNumber);
        }

        /* For 100.000 */
        for (int index = 0; index < 100000; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList100000.add(randomNumber);
        }

        /* For 1.000.000 */
        for (int index = 0; index < 1000000; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList1000000.add(randomNumber);
        }

        /* For 10.000.000 */
        for (int index = 0; index < 10000000; ++index) {
            randomNumber = (int) (Math.random() * 1000 + 1);
            myArrayList10000000.add(randomNumber);
        }


        /*For 1 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList1.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("\nArray List Enqueue(1) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(1) : " + timeofExe);


        /*For 10 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList10.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(10) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(10) : " + timeofExe);





        /*For 100 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList100.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(100) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(100) : " + timeofExe);



        /*For 1.000 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList1000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(1000) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(1000) : " + timeofExe);



        /*For 10.000 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList10000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(10000) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(10000) : " + timeofExe);



        /*For 100.000 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100000.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList100000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(100000) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(100000) : " + timeofExe);




        /*For 1.000.000 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000000.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList1000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(1000000) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(1000000) : " + timeofExe);



        /*For 10.000.000 Array List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000000.size(); ++index) {
            arrayListPriorityQueue.enqueue(myArrayList10000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Enqueue(10000000) : " + timeofExe);

        size = arrayListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            arrayListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Array List Dequeue(10000000) : " + timeofExe);




















































        /*For 1 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList1.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(1) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(1) : " + timeofExe);


        /*For 10 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList10.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(10) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(10) : " + timeofExe);





        /*For 100 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList100.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(100) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(100) : " + timeofExe);



        /*For 1.000 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList1000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(1000) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(1000) : " + timeofExe);



        /*For 10.000 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList10000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(10000) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(10000) : " + timeofExe);



        /*For 100.000 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100000.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList100000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(100000) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(100000) : " + timeofExe);




        /*For 1.000.000 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000000.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList1000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(1000000) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(1000000) : " + timeofExe);



        /*For 10.000.000 Vector */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000000.size(); ++index) {
            vectorPriorityQueue.enqueue(myArrayList10000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Enqueue(10000000) : " + timeofExe);

        size = vectorPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            vectorPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Vector Dequeue(10000000) : " + timeofExe);

























        /*For 1 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList1.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(1) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(1) : " + timeofExe);


        /*For 10 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList10.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(10) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(10) : " + timeofExe);





        /*For 100 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList100.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(100) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(100) : " + timeofExe);



        /*For 1.000 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList1000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(1000) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(1000) : " + timeofExe);



        /*For 10.000 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList10000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(10000) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(10000) : " + timeofExe);



        /*For 100.000 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100000.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList100000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(100000) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(100000) : " + timeofExe);




        /*For 1.000.000 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000000.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList1000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(1000000) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(1000000) : " + timeofExe);



        /*For 10.000.000 Linked List */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000000.size(); ++index) {
            linkedListPriorityQueue.enqueue(myArrayList10000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Enqueue(10000000) : " + timeofExe);

        size = linkedListPriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            linkedListPriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("Linked List Dequeue(10000000) : " + timeofExe);


























        /*For 1 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList1.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(1) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(1) : " + timeofExe);


        /*For 10 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList10.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(10) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(10) : " + timeofExe);





        /*For 100 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList100.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(100) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(100) : " + timeofExe);



        /*For 1.000 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList1000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(1000) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(1000) : " + timeofExe);



        /*For 10.000 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList10000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(10000) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(10000) : " + timeofExe);



        /*For 100.000 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList100000.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList100000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(100000) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(100000) : " + timeofExe);




        /*For 1.000.000 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList1000000.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList1000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(1000000) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(1000000) : " + timeofExe);



        /*For 10.000.000 BinarySearchTree */

        startTime = System.currentTimeMillis();

        for (int index = 0; index < myArrayList10000000.size(); ++index) {
            binarySearchTreePriorityQueue.enqueue(myArrayList10000000.get(index));
        }

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Enqueue(10000000) : " + timeofExe);

        size = binarySearchTreePriorityQueue.size();

        startTime = System.currentTimeMillis();

        for (int index = 0; index < size; ++index)
            binarySearchTreePriorityQueue.dequeue();

        endTime = System.currentTimeMillis();
        timeofExe = endTime - startTime;
        System.out.println("BinarySearchTree Dequeue(10000000) : " + timeofExe);





    }
}
