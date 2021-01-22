package edu.wit.cs.comp2350;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

/** Sorts integers from command line using insertion sort and mergesort algorithms <p>
 * 
 * Wentworth Institute of Technology <br>
 * COMP 2350 <br>
 * Lab Assignment 1 solution <br>
 * <p>
 * Javadoc example: <br>
 * http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#examples <br>
 * Press: Shift+F2 to view the docs
 * 
 * @author      YOUR NAME
 * @author      Memo Ergezer
 * @author      Frank Kreimendahl
 * @version     %I%, %G%
 * @since       1.0
 */

public class LAB1 {

	// TODO: document this method using Javadocs
	
	/*
	 * Briefly explain what your method does.
	 * Leave your future-self notes to save yourself time.
	 * For instance:
	 */
	
	/**
	 * Implementation of insertionSort as given in week 1 lecture. <br>
	 * temp is the key <br>
	 * we step through the array and look for the proper place to insert the key 
	 * elements up the key are assumed to be sorted. 
	 * <p> Steps: 
	 * <ul> 
	 * <li> Copy the key 
	 * <li> Copy elements UP until we find where the key goes
	 * <li> We put [insert] the key
	 * <li> Repeat for j+1
	 * </ul>
	 * <p>
	 * Java, C++ implementation: <br>
	 * http://www.algolist.net/Algorithms/Sorting/Insertion_sort
	 * <p>
	 * Expected Costs: <br>
	 * Time: O(n^2) <br>
	 * Space: O(1)
	 * 
	 * @param a	array to be sorted
	 * @return sorted array
	 */
	public static int[] insertionSort(int[] a) {
		//TODO: implement this method
		return a;
	}

	// TODO: document this method
	public static int[] mergeSort(int[] a) {
		//TODO: implement this method
		//Hint: you can take advantage of copyOfRange
		return a;
	}

	//Subroutine to merge two subarrays
	public static int[] merge(int[] a1, int[] a2) {
		//TODO: implement this method
		return null;
	}



	/********************************************
	 *
	 * Do NOT modify anything below
	 *
	 ********************************************/

	public final static int MAX_INPUT = 524287;
	public final static int MIN_INPUT = 0;


	/* Implementation note: The "system" sorting algorithm is a Dual-Pivot Quicksort
	 * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch.
	 *  This algorithm offers O(n log(n)) performance on many data
	 *  sets that cause other quicksorts to degrade to quadratic performance,
	 *  and is typically faster than traditional (one-pivot) Quicksort implementations.
	 */

	public static int[] systemSort(int[] a) {
		Arrays.sort(a);
		return a;
	}

	// read ints from a Scanner
	// returns an array of the ints read
	private static int[] getInts(Scanner s) {
		ArrayList<Integer> a = new ArrayList<Integer>();

		while (s.hasNextInt()) {
			int i = s.nextInt();
			if ((i <= MAX_INPUT) && (i >= MIN_INPUT))
				a.add(i);
		}

		return toIntArray(a);
	}

	// copies an ArrayList of Integer to an array of int
	private static int[] toIntArray(ArrayList<Integer> a) {
		int[] ret = new int[a.size()];
		for(int i = 0; i < ret.length; i++)
			ret[i] = a.get(i);
		return ret;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.printf("Enter the sorting algorithm to use ([i]nsertion, [m]erge, or [s]ystem): ");
		char algo = s.next().charAt(0);

		System.out.printf("Enter the integers that you would like sorted, followed by a non-integer character: ");
		int[] unsorted_values = getInts(s);
		int[] sorted_values = {};

		s.close();

		switch (algo) {
		case 'm':
			sorted_values = mergeSort(unsorted_values);
			break;
		case 'i':
			sorted_values = insertionSort(unsorted_values);
			break;
		case 's':
			sorted_values = systemSort(unsorted_values);
			break;
		default:
			System.out.println("Invalid sorting algorithm");
			System.exit(0);
			break;
		}

		System.out.println(Arrays.toString(sorted_values));
	}

}
