package Arrays;

import java.util.Scanner;

public class Sum_of_Digits_in_Base_K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
			
		System.out.println(sumBase(n, k));
	}
	public static int sumBase(int n, int k) {
        int sum=0;
        while(n!=0){
            sum = sum + n%k;
            n = n/k;
        }
        return sum;
    }
}
