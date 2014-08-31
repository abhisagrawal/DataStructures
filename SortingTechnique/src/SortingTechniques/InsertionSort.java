package SortingTechniques;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr,int pos){
		for(int i=pos+1;i<arr.length;i++){
			int j = i;
			while(j>0 && arr[j-1]>arr[j]){
				int temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {5,6,7,1,2,3,4};
		System.out.println(Arrays.toString(arr)); 
		insertionSort(arr,0);
		System.out.println(Arrays.toString(arr));
	}

}
