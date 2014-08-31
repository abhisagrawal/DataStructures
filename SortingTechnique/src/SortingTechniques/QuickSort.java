package SortingTechniques;

import java.util.Arrays;

public class QuickSort {
	
	public static void quickSort(int arr[],int low,int high){
		if(high>low){
			int pivot = getPivot(arr,low,high);
			quickSort(arr,low,pivot-1);
			quickSort(arr,pivot+1,high);
		}
	}
	
	public static int getPivot(int arr[],int low,int high){
		int left = low;
		int right = high;
		int pivot = low;
		
		while(left<right){
			while(arr[left]<=arr[pivot] && left<=high)
				left++;
			while(arr[right]>arr[pivot] && right>=low)
				right--;
			if(left<right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		int temp = arr[pivot];
		arr[pivot] = arr[right];
		arr[right] = temp;
		return temp;
	}
	
	public static void main(String args[]){
		int arr[] = {5,6,7,1,2,3,4};
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
