package basics;

public class f_NumbersCalc_Functions {
	
	public static void main(String [] args) {
		
		System.out.println("Program starting..");	
		
		printName();
		
		int numA = 10;
		int numB = 30;
		addNumbers(numA,numB);
				
		System.out.println(multiplyNumbers(numA,numB));
		
	}
		//function with no params , no rtn type
		static void printName() {
			System.out.println("My name is David");
		}
		
		//function with params , no return type
		static void addNumbers(int numA , int numB) {
			int sum = numA + numB;
			System.out.println("The sum of numbers "+ numA + " and " + numB + " is: " + sum);			
		}
		
		//function with params and a return type
	    static int  multiplyNumbers(int valueA,int valueB) {
	    	int product = valueA * valueB;
	    	//function within a function
	    	addNumbers(product , product);
	    	return product;
	    	    }
		
	    
	    
}
	

	


