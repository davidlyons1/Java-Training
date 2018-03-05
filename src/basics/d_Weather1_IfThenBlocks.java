package basics;


public class d_Weather1_IfThenBlocks {
	//if,else if statements
	public static void main (String[] args) {
		//this program will suggest what to wear based on weather
		
		int temperature = 45;
		String sunCondition = "Overcast";
		
		
		if (temperature > 80) {
			System.out.println("It's pleasant , wear shorts and a t shirt");
			;
		}
		
		else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("It's a little cooler , perhaps wear a long sleeve tshirt and jeans");
			System.out.println("Wear a hat to keep the sun out of your eyes");
			
	}
		else if  ((temperature > 50) || (sunCondition == "Overcast"))
			System.out.println("This is a cool day make sure to wear warmer clothers");
		
		
		else {
			System.out.println("Cold day - bring a sweater");
			
		}
		System.out.println("The program is ending");
	}

}
