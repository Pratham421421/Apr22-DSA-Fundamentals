package Arrays;

import java.util.Scanner;

public class Maximum_SubArray {
	public static void main(String[] args) {
		
//		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//		Output: 6
//		Explanation: [4,-1,2,1] has the largest sum = 6.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(maxSubArray(arr));
	}
	public static int maxSubArray(int[] nums) {       
        int sum=nums[0];
        for(int i=0; i<nums.length; i++){
            int eachSum = nums[i];
            sum = Math.max(sum, eachSum);
            for(int j=i+1; j<nums.length; j++){
                eachSum = eachSum + nums[j];
                sum = Math.max(sum, eachSum);
            }
        }
        return sum;
    }
}
