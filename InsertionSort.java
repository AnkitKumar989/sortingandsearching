package arrays;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 88, 11, 44, 99, 33 };
		insertionsort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void insertionsort(int arr[]) {
		for (int counter = 1; counter <= arr.length - 1; counter++) {
			int val = arr[counter];
			int j = counter - 1;
			while (arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = val;
		}
	}

}
