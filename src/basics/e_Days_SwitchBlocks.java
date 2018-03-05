package basics;

public class e_Days_SwitchBlocks {

	public static void main(String[] args) {
		//Execute different block of code based upon value of a condition
		
		String dayOfWeek = "Monday";
		
		switch(dayOfWeek) {
		case "Monday" : 
			System.out.println("Today is Monday");
			break;
		case "Tuesday" : 
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday" : 
			System.out.println("Today is Wednesday");
			break;
		case "Friday" : 
			System.out.println("Today is Friday");
			break;
		}

	}

}
