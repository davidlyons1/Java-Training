package basics;

public class m_LAB3_3functions_min_av_max {

	public static void main(String[] args) {
		//Write 3 functions which return the min , avg and max of an array
		int[] numbers = {5 , -2 , 0 , 234 , -38 , 63};
		System.out.println("Min: " + findMin(numbers));
		System.out.println("Max: " + findMax(numbers));
		System.out.println("Max: " + findAvg(numbers));
	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
		if (arr[i] < min) {
			min = arr[i];
			}
		}
		return min;
	}
	
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++) {
		if (arr[i] > max) {
			max = arr[i];
			}
		}
		return max;
	}
	
	public static int findAvg(int[] arr) {
		//take sum , divide by number of elements
		int sum = 0;
		for(int n = 0; n < arr.length; n++) {
		sum = sum + arr[n];
		}
		return sum/arr.length;
	}
}


