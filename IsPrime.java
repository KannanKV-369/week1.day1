package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// Home Assignment 2: Print if the given number is prime

		//Goal: To understand the problem solving, looping and conditional statement
		
		/* store the input value n = 13
		 * iterate through all number from 2 to n-1
	    */

		int n = 13;
		
		for (int i = 2; i <=n-1; i++) {
			
			if(n%i==0)
			{
				System.out.println(i+": "+"Not Prime");
				
			}
			else if(n%i!=0)
			{
				System.out.println(i+": "+"Prime");
				
			}
		}


	}

}
