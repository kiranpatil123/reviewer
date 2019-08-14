package com.kiran;

class palindrome {

	public int checkPalindrome(String s1) {
//		int j = s1.length() - 1;
		int count = 0;
		char[] cs = s1.toCharArray();
		for (int i = 0, j = s1.length() - 1; i < s1.length() && j >= 0; i++, j--) {
			if (cs[i] == cs[j]) {

				count++;
			} else {
				break;
			}
		}
		return count;

	}
}

public class DemoArr {

	public static void main(String[] args) {

		/*
		 * int arr[]={0,0,4,0,0,90,0,5,6,7,0,5,8}; int count=0; for (int
		 * i=0;i<arr.length;i++){ if(arr[i]!=0){ arr[count++]=arr[i]; }
		 * 
		 * } while(count <arr.length){ arr[count++]=0; } for (int i = 0; i < arr.length;
		 * i++) System.out.print(arr[i] + " "); }
		 */

		/*
		 * int a[] = { 1, 2, 0, 0, 4, 6, 8, 7 }; int countdesc = a.length - 1; int
		 * countasc = 0;
		 * 
		 * int c[] = new int[a.length];
		 * 
		 * for (int i = 0; i < a.length; i++) {
		 * 
		 * if (a[i] != 0) { c[countdesc] = a[i]; countdesc--;
		 * 
		 * } else { c[countasc] = a[i]; countasc++; }
		 * 
		 * }
		 * 
		 * for (int j = 0; j < c.length; j++) { System.out.print(c[j] + " "); }
		 */

		/*
		 * palindrome palindrome = new palindrome(); String checkString = "RADAR"; int
		 * checkPalindrome = palindrome.checkPalindrome(checkString);
		 * 
		 * if (checkPalindrome == checkString.length()) {
		 * System.out.println("Given String is a plaindrome"); } else {
		 * System.out.println("Given string is not a palindrome"); }
		 */
		
		int arr[]={3,5,6,78,89,0,4,0,9,0,2,9,0};
		int count=arr.length-1;
		for (int i=arr.length-1;i>=0;i--){
		if(arr[i]!=0){
		arr[count]=arr[i];
		count--;
		}

		}
		while(count >=0){
		arr[count]=0;
		count--;
		}
		for (int i = 0; i < arr.length; i++) 
		System.out.print(arr[i] + " "); 
		}
	}


