package tr.edu.gtu.mustafa.akilli.cse222;

import junit.framework.TestCase;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by MustafaMonster on 13.04.2016.
 */
public class BinarySearchTreeTest extends TestCase {

    public void testIterator() throws Exception {
        BinarySearchTree<Integer> Btree = new BinarySearchTree<Integer>();
        boolean checkNextMethod;
        boolean checkRemoveMethod;

        Iterator<Integer> iter = Btree.iterator(); /*Make iterator */

        /*İter has no element */
        assertEquals(false , iter.hasNext());

        try{
            iter.next();
            checkNextMethod = true;
        }catch(NoSuchElementException e){
            checkNextMethod = false;
        }

        /*İter has no element */
        assertEquals(false , checkNextMethod);

        try{
            iter.remove();
            checkRemoveMethod = true;
        }catch(IllegalStateException e){
            checkRemoveMethod = false;
        }

        /*İter has no element */
        assertEquals(false , checkRemoveMethod);

        /*add element */
        Btree.add(2);

        iter = Btree.iterator(); /*Make iterator */

        /*İter has a element */
        assertEquals(true , iter.hasNext());

        try{
            iter.next();
            checkNextMethod = true;
        }catch(NoSuchElementException e){
            checkNextMethod = false;
        }

        /*İter has no element */
        assertEquals(true , checkNextMethod);

        try{
            iter.remove();
            checkRemoveMethod = true;
        }catch(IllegalStateException e){
            checkRemoveMethod = false;
        }

        /*İter has no element */
        assertEquals(true , checkRemoveMethod);

    }
}