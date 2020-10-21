package hw07;
/*
Kallan Brainard 
CS 211
August 4, 2020
 */

/*8. Write a recursive method called multiplyEvens that returns the product
of the first n even integers. For example, multiplyEvens(1) returns 2
and multiplyEvens(4) returns 384 (because 2 * 4 * 6 * 8 = 384). The
method should throw an IllegalArgumentException if it is passed a
value less than or equal to 0.*/
import java.util.*;

public class HW07Ex08 {

	public static void main(String[] args) {
		int n = 1;
		System.out.println("Multiply Evens of " + n); 
		System.out.println(multiplyEvens(n));

		n = 4;		 
		System.out.println("\nMultiply Evens: " + n);
		System.out.println(multiplyEvens(n));
	}

	public static int multiplyEvens(int n) {
		if (n <= 0) { //less than or equal to 0, throw exception
			throw new IllegalArgumentException();
		} else if (n == 1) { 
			return 2;
		} else {
			return (n * 2) * multiplyEvens(n - 1);
		}
	}
}
