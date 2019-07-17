/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode;

/**
 *
 * @author droro
 */
public class RecursionReverse {
	
	
	public static void reverseString(char[] s) {
		char[] y = reverseString(0,s[s.length-1], s);
	for (char c : y) {
		System.out.print(c);
	}
	}

	public static char[] reverseString(int index,char buff, char[] arr) {

		if (index+1 >= arr.length || arr == null) {
			return arr;
		}
		char[] rel = reverseString(index+1,arr[arr.length-1 -(index+1)], arr);
		
		rel[rel.length-1] = rel[index] ;
		rel[index] = buff;		
				
		return rel;
		
	}

	public static void main(String[] args) {
		char[] x = { 'h', 'e', 'l', 'l', 'o', 'p' };
		 reverseString(x);
	}
}
