package arrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {8,65,565,434,2};
		System.out.println(Arrays.toString(sorting(arr)));
		
	}
	public static int[] sorting(int[] arr) {
		
		for(int counter=0;counter<arr.length-1-counter;counter++)
		{ 

			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
					
				}
				
			}
			
			System.out.println("counter"+counter+" : "+Arrays.toString(arr));

		}
		return arr;
		
	}
	public static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

}
