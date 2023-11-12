package org.howard.edu.lsp.assignment5;

import org.howard.edu.lsp.assignment4.IntegerSet;
import org.howard.edu.lsp.assignment4.IntegerSetException;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		   // Test the IntegerSet class methods

        // Create set1 and add elements
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Create set2 and add elements
        IntegerSet set2 = new IntegerSet();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Value of Set2 is: " + set2.toString());

        // Test the union of set1 and set2
        System.out.println("Union of Set1 and Set2");
        System.out.println("Value of Set1 before union: " + set1.toString());
        System.out.println("Value of Set2 before union: " + set2.toString());
        set1.union(set2); // union of set1 and set2
        System.out.println("Value of Set1 after union: " + set1.toString());

        // Test the intersect of set1 and set2
        System.out.println("Intersection of Set1 and Set2");
        set1.clear();
        set2.clear();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        System.out.println("Value of Set1 before intersection: " + set1.toString());
        System.out.println("Value of Set2 before intersection: " + set2.toString());
        set1.intersect(set2); // intersection of set1 and set2
        System.out.println("Value of Set1 after intersection: " + set1.toString());


        IntegerSet setB = new IntegerSet();
        setB.add(2);
        setB.add(4);
        setB.add(6);

        System.out.println("Set B: " + setB.toString());

        set1.union(setB);
        System.out.println("Set A union B: " + set1.toString());

        set1.intersect(setB);
        System.out.println("Set A intersect B: " + set1.toString());

        set1.diff(setB);
        System.out.println("Set A - B: " + set1.toString());

        set1.complement(setB);
        System.out.println("Complement of Set A with respect to B: " + set1.toString());

        System.out.println("Is the set empty? " + set1.isEmpty());

        System.out.println("Length of Set A: " + set1.length());

        System.out.println("Largest element in Set A: " + set1.largest());

        System.out.println("Smallest element in Set A: " + set1.smallest());

        System.out.println("Does Set A contain 4? " + set1.contains(4));

        System.out.println("Does Set A contain 8? " + set1.contains(8));

        set1.remove(2);
        System.out.println("Removed 2 from Set A: " + set1.toString());

        set1.clear();
        System.out.println("Cleared Set A. Is the set empty now? " + set1.isEmpty());
	}

}
