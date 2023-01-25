package com.cybage;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
  
   String input1="noon";
   App app=new App();
   boolean expected = true;
   
   @Test
   public void isPalindromeTest() {
	   assertEquals(expected, app.isPalindrome(input1));
	

} 
   @Test
   public void isNotPalindromTest() {
	   assertEquals(false, app.isPalindrome("abc"));
   }
   @Test(expected = IllegalArgumentException.class)
   public void isPalindromExceptionTest() {
	   assertEquals(false, app.isPalindrome(null));
	// TODO Auto-generated method stub

   }
}
