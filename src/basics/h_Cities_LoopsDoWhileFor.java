package basics;

public class h_Cities_LoopsDoWhileFor {

	public static void main(String[] args) {
		//declare and define array
		String [] cities = {"New York" , "San Francisco" , "Miami" , "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		//declare array
		String[] countries;
		
		//define the array
		countries = new String[3];
		countries[0]= "USA";
		countries[1]= "Canada";
		countries[2]= "UK";
		System.out.println(countries[1]);
		
		System.out.println("**************************");	
	
		//declare and define array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i = 0;
		
		//Do loop enters the loop THEN tests the condition
		do {
		System.out.println("STATE: " + states[i]);
		i =i + 1;
		} while (i < 5);
		
		//while loop tests condition first THEN enters the loop
		int n = 0 ;
		boolean stateFound = false;
		while (!stateFound) { //while state found is NOT true - the opposite !
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND!"); 
				stateFound = true;
			}
			n++;
		}
		
		System.out.println("\nPrinting with For Loop\n");
		
		//for loop best structure for iterating through array
		for (int x = 0; x < 5 ; x++) {
			System.out.println(states[x]);
		}	
		
	}
}
