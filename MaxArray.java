package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int ans = maxfind(arr);
		System.out.println(ans);
		System.out.println(Arrays.toString(arr));
	}

	public static int maxfind(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(max);
			if (arr[i] > max) {
				max = arr[i];

			}
		}

		return max;
	}
}
