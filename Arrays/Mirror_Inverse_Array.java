package Arrays;

import java.util.Scanner;

public class Mirror_Inverse_Array {
	public static void main(String[] args) {
		
		//[3,4,2,0,1] means 3<-->0 4<-->1 2<-->2
		// 0 1 2 3 4
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(inverse(arr));
	}
	
	public static Boolean inverse(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int save = arr[i]; //save index value
			if(arr[save]!=i) return false; //checking value and index are same or not
		}	
		return true;
	}
}
