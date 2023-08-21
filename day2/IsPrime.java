package week1.day2;

/*a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime*/

public class IsPrime {
	public static void main(String[] args) {
		int n=20;
		for(int i=1;i<=n;i++) {
			int count = 0;	
			for(int j=2;j<=i/2;j++)
			{
			    if(i%j==0)
				{count++;}
	         }
		if (count==0)
		{System.out.println(i);}
		}
		
}
}
	