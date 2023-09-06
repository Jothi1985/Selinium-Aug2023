package week3.JavaChallenge;

/*

Example3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/

public class StringValidation3 {

	public static void main(String[] args) {
     
	 String s = "luffy is still joyboy";	
     String lastNchars = s.substring( Math.max(0, s.length()-6));
     System.out.println(lastNchars);
     int a = lastNchars.length();
     System.out.println(a);
   
  
	}

}

