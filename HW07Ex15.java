package hw07;
/*
Kallan Brainard 
CS 211
August 4, 2020
 */

/*15. Write a recursive method called permut that accepts two integers n and r
as parameters and returns the number of unique permutations of r items
from a group of n items. For given values of n and r, this value P(n, r)
can be computed as follows:
P(n,r)=n!(n−r)!
For example, permut(7, 4) should return 840. It may be helpful to note
that permut(6, 3) returns 120, or 840 / 7.*/

public class HW07Ex15 {
	public static void main(String[] args) {
		//test case 1
		int n = 7;
		int r = 4;
		int result = permut(n,r);
		System.out.println("n = " + n + ", " + "r = " + r + ", result = " + result );

		//test case 2
		n = 6;
		r = 3;
		result = permut(n,r);
		System.out.println("n = " + n + ", " + "r = " + r + ", result = " + result );
	}

	public static int permut(int n, int r) {
		if (n > n - r) {
			return n * permut(n-1, r-1); 
		} else {
			return 1;	
		}
	}
}
