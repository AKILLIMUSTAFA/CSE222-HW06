package tr.edu.gtu.mustafa.akilli.cse222;

import java.util.Comparator;

/**
 * HW06_131044017_Mustafa_Akilli
 *
 * File:   MyComparator
 *
 * Description:
 *
 * MyComparator
 *
 * @author Mustafa_Akilli
 * @since Tuesday 14 April 2016 by Mustafa_Akilli
 */
public class MyComparator implements Comparator<Integer>{
    /**
     * Compare two element
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     */
    public int compare(Integer o1, Integer o2) throws NullPointerException{
        if(o1 == null || o2 == null)
            throw new NullPointerException();

        return o1-o2;
    }
}
