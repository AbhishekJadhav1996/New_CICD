package com.cybage;

/**
 * Hello world!
 *
 */
public class App 
{
	public boolean isPalindrome(String input) {
		if(input==null) {
			throw new IllegalArgumentException("Input shouldnt be null");
		}
		if(input.equals(reverse(input))) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }

	private String reverse(String input) {
		String rev= "";
		for(int i=input.length() - 1; i>=0; i--) {
			rev=rev + input.charAt(i);
		}
		return rev;
	}
}
