/*
 * Programmed by: Dilpreet Singh
 * Date: April 1, 2018
 * COMP 730
 * Homework 8
 */

package HW8;

public class FibonacciSequence {

	public int GetResult (int n) {
		
		if(n <= 1) {
			return n;			
		}
		
		return GetResult(n - 1) + GetResult(n - 2);
	}
	
}