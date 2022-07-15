package Arrays;

import java.util.Scanner;

public class Digit_Frequency {
	public static void main(String[] args) throws Exception {
	    // write your code here
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(); //taking number
	    int d = sc.nextInt(); //taking digit number
	    int freq = 0;
	    while(n>0) {
	    	int dig = n%10;
	    	n = n/10;    	
	    	if(dig==d) {
	    		freq++;
	    	}
	    }
	    System.out.println(freq);
	 }
}
