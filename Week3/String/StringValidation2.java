package week3.JavaChallenge;

/*Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.*/

public class StringValidation2 {

	public static void main(String[] args) {
     
	 String s = "fly me   to   the moon ";	
     String lastNchars = s.substring( Math.max(0, s.length()-5));
     System.out.println(lastNchars);
     int a = lastNchars.length();
     System.out.println(a);
     
   
  
	}

}




