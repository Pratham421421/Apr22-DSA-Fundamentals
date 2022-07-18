package Searching_and_Sorting;

public class Buuble_Sort {

	public static void main(String[] args) {
		int[] arr = {3,1,6,4,8,9,6,7,2};
		
		bubbleSort(arr);
		//largest element placed last
	}

	public static void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
