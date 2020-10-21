package hw07;
/*
Kallan Brainard 
CS 211
August 4, 2020
 */

/*Write a method called writeNums that takes an integer n as a parameter
and prints to the console the first n integers starting with 1 in sequential
order, separated by commas. For example, consider the following calls:
writeNums(5);
System.out.println(); // to complete the line of output
writeNums(12);
System.out.println(); // to complete the line of output
These calls should produce the following output:
1, 2, 3, 4, 5
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
Your method should throw an IllegalArgumentException if passed a
value less than 1.*/
import java.util.*;

public class HW07Ex02 {

	public static void main(String[] args) {
		writeNums(5);  // to complete the line of output
		System.out.println();
		writeNums(12); // to complete the line of output
	}

	public static void writeNums(int n) {
		if (n < 1) { //if less than 1, throw exception
			throw new IllegalArgumentException();
		} else if (n == 1) { //base case
			System.out.print(1);
		} else {
			writeNums(n - 1);
			System.out.print(", " + n);
		} 
	}
}
