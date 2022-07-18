package Searching_and_Sorting;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] arr = {3,1,6,4,8,9,6,7,2};
		
		insertionSort(arr);
	}

	public static void insertionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
				else {
					break;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
