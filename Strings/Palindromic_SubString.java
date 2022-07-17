package Strings;

import java.util.Scanner;

public class Palindromic_SubString {
	
	public static boolean isPalindrome(String subString) {
		int start=0, end=subString.length()-1;
		while(start<end) {
			if(subString.charAt(start)!=subString.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "" + str.charAt(0);
		for(int st=0; st<str.length(); st++) {
			for(int end=st; end<str.length(); end++) {
				String subString = str.substring(st, end+1);
				if(isPalindrome(subString)==true) {
					if(ans.length()<subString.length()) {
						ans = subString;
					}					
				}
			}
		}
		System.out.println(ans);
	}
}
