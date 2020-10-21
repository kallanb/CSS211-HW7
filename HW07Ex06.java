package hw07;
/*
Kallan Brainard 
CS 211
August 4, 2020
 */

/*6. Write a recursive method called writeSquares that accepts an integer
parameter n and prints the first n squares separated by commas, with the
odd squares in descending order followed by the even squares in
ascending order. For example, writeSquares(8); prints the following
output:49, 25, 9, 1, 4, 16, 36, 64
A call of writeSquares(1); prints 1. The method should throw an
IllegalArgumentException if it is passed a value less than 1.*/

import java.util.*;

public class HW07Ex06 {

	public static void main(String[] args) {
		//Demonstrate writeSquares method. 
		int n = 8;
		System.out.print("Write Squares of ");
		System.out.println(n);
		System.out.print("Result: ");
		writeSquares(n);

		n = 1;
		System.out.print("\n\nWrite Squares of ");
		System.out.println(n);
		System.out.print("Result: ");
		writeSquares(n);
	}

	public static void writeSquares(int n) {
		if (n < 1) { //if num is less than 1, throw exception
			throw new IllegalArgumentException();
		} else if (n == 1){
			 System.out.print("1");
		} else if (n % 2 == 1) { // if odd, print descending order
			System.out.print(n * n + ", ");
			writeSquares(n - 1);
		} else { //even, print ascending order
			writeSquares(n - 1);
			System.out.print(", " + n * n);
		}
	}
}
