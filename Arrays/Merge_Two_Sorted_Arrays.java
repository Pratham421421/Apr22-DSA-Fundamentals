package Arrays;

import java.util.Arrays;

//Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
//Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
//Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
//Output: arr3[] = {4, 5, 7, 8, 8, 9} 

public class Merge_Two_Sorted_Arrays {
	public static void main(String[] args) {
		int[] arr1 = {1,3,4,5};
		int[] arr2 = {2,4,6,8};
		
		int l3 = arr1.length+arr2.length;
		int[] arr3 = new int[l3];
		int j=0;
		for(int i=0; i<l3; i++) {
			if(arr1.length>i) {
				arr3[i] = arr1[i]; 
			}
			else {
				arr3[i] = arr2[j];
				j++;
			}
		}
		Arrays.sort(arr3);
		for(int x : arr3) {
			System.out.print(x+" ");
		}
	}
}
