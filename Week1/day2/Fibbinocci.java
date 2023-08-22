package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		

		/*Home Assignment 1: Print Fibbinocci series for first 11 numbers

		0  1  1  2  3  5  8  13  21  34  55  89  144

		Goal: To understand the arthimetic operation and loop

		a) Create a class by name: Fibbinocci
		b) Create a main method using shortcut
		c) Write a logic to print fibbinocci from 0 to 56*
		
		*/

     int firstNum = 0; int secNum = 1; int sum = 0;
     System.out.println(firstNum);
     for (int i=2; i<11;++i)
     {
    	 
	  sum=firstNum+secNum;//3= 1+2
	  System.out.println(sum);
	 
	  firstNum=secNum; //1=2 > first number 2
	  secNum=sum;//3>>
	  
     
     }
	}
}

