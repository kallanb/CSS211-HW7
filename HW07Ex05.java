package hw07;
/*
Kallan Brainard 
CS 211
August 4, 2020
 */

/*5. Write a recursive method called writeBinary that accepts an integer as
a parameter and writes its binary representation to the console. For
example, writeBinary(44) should print 101100.*/

public class HW07Ex05 {

	public static void main(String[] args) {
		int value = 44;
		//prints 44 in binary
		System.out.println("Input Value: " + value);
		System.out.print("Binary Representation: ");
		writeBinary(value);
	}

	//prints binary representation for given integer n 
	public static void writeBinary(int n) {
		if (n > 0) { 
			writeBinary(n / 2);
			System.out.print(n % 2);	
		}
	}
}
