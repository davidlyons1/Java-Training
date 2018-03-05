package basics;

public class c_Weather_IfElseBlocks {
	//if statements
	public static void main (String[] args) {
		//this program will suggest what to wear based on weather
		
		int temperature = 20;
		
		
		if (temperature > 80) {
			System.out.println("It's pleasant , wear shorts and a t shirt");
			;
		}
		
		else if (temperature > 60) {
			System.out.println("It's a little cooler , perhaps wear a long sleeve tshirt and jeans");
			;
	}
		
		else {
			System.out.println("Cold day - bring a sweater");
			
		}
	}
}
