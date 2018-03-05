package basics;

public class k_LAB1_Assignment_Factorials {

	public static void main(String[] args) {
		//Write a function that takes a value n 
		//returns the sum of numbers 1 to n
		System.out.println(sum(3));
	
	}
		
		public static int sum(int f) {	
			int sum = 0;
			for( int i = 1; i <= f; i++) {
				System.out.print(sum + " + "+ i);
				sum = sum + i;	
				System.out.println(" = " + sum);
			}
			return sum;
		
	}
		
}