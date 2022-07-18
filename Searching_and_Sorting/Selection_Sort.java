package Searching_and_Sorting;

public class Selection_Sort {
	public static void main(String[] args) {
		int[] arr = {3,1,6,4,8,9,6,7,2};
		
		selectionSort(arr);

		//selection sort means find smallest element from array and placing first
		//and one loop for one sort
	}
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int minIndex = i; 
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j; //checking which element is small in array
				}
			}
			// now smallest element placing first
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;		
		}
		
		//printing sorted array
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}
