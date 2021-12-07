package org.te.quicksort;

public class Occurence {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 3, 5, 5, 6, 3, 3, 1, 1, 7 };
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					for (int k = j; k < n - 1; k++) {
						arr[k] = arr[k + 1];
					}
					// count++;
					j--;
					n--;
				}
			}
			System.out.println(arr[i] + " is occurences " + count);

		}

	}
}