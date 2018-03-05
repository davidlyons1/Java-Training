package basics;

public class l_LAB2_Factorials {

	public static void main(String[] args) {
		// Factorials
				// 1! = 1 * 1
				// 2! = 2 * 1
				// 3! = 3 * 2 * 1
				// 4! = 4 * 3 * 2 * 1
		
		//write a function which computes factorial values
		System.out.println("this is the factorial " + fact(4));

	}
	
	public static int fact(int n) {
		if (n==0) {
			return 1;
		}
		//recursive function - we know fact(n-1) equals 3*2*1
		//so multiple 4*3*2*1) = 24
		//we are continually calling n-1 until we get to 0
		System.out.println(n);
		return fact(n-1) * n ;
		
	}

}
//n is firstly 4
//(n-1) 3 * 4 = 12
//(n-2) 2 * 12 = 24
//(n-3) 1 * 24 = 24

//then we loop
//1st loop = n (4) * n-1 (3) = 12
//return 12
//2nd loop = n (12) * n-1 (2) = 24
//return 24
//3rd loop = n (24) * n-1 (1) = 24