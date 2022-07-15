package Arrays;

import java.util.Scanner;

public class Bar_Chart {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    
	    for(int i=0; i<n; i++) {
	    	arr[i] = sc.nextInt();
	    }
	    
	    int col = arr.length;
	    int max = Integer.MIN_VALUE;
	    for(int i=0; i<n; i++) {
	    	if(arr[i]>max) {
	    		max = arr[i];
	    	}
	    }
	    int row = max;
	    
	    for(int i=row; i>0; i--) {
	    	for(int j=0; j<col; j++) {
	    		if(i<=arr[j]) {
	    			System.out.print("*	");
	    		}
	    		else {
	    			System.out.print(" 	");
	    		}
	    	}
	    	System.out.println();
	    }        
	}
}
