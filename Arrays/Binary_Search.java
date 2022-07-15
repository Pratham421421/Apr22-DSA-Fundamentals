package Arrays;

import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    int target = sc.nextInt();
	    
	    System.out.println(binarySearch(arr, target));
	}
	
	public static int binarySearch(int[] arr, int target) {
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
}
