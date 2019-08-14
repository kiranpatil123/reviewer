package com.kiran;

class Array {

	int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0 };
	int b[] = new int[a.length];

	public int[] delete(int position, int data) {
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (i == position) {
				System.out.println(i);
				b[count] = a[i + 1];
				i = i + 1;
				count++;
				System.out.println(i);

			} else {

				b[count] = a[i];
				count++;
			}

		}

		return b;

	}

	public int[] add(int position, int data) {

		for (int i = a.length - 1; i > position; i--) {
			a[i] = a[i - 1];
		}
		a[position] = data;
		return a;

	}
}

public class DemonewArray {
	public static void main(String[] args) {

		/*
		 * int a[] = { 0, 2, 1, 3, 4, -1, -2, -3, -4 }; int k[] = new int[a.length]; int
		 * count = 0; for (int i = 0; i < a.length; i++) { for (int j = i + 1; j <
		 * a.length; j++) {
		 * 
		 * if (a[i] == -a[j]) {
		 * 
		 * k[++count] = a[i]; k[++count] = a[j];
		 * 
		 * } }
		 * 
		 * } for (int m : k) { System.out.print(m); }
		 */

		/*
		 * Array array = new Array();
		 * 
		 * int[] add = array.delete(3, 8); for (int k : add) { System.out.print(k +
		 * " "); }
		 * 
		 * System.out.println("\\n"); int[] add2 = array.add(2, 10); for (int k : add2)
		 * { System.out.print(k + " "); }
		 */

		int a[] = { 1, 1, 2, 2, 3, 3, 4, 4, 0, 0 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = 0;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
