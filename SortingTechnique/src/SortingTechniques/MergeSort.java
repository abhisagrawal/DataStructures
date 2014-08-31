package SortingTechniques;

import java.util.Arrays;

public class MergeSort {
	
	public static void merge(int[] arr,int low,int mid,int high){
		int temp[] = new int[arr.length];
		int left = low;
		int right = mid+1;
		int point = low;
		while(left<=mid && right<=high){
			if(arr[left]<arr[right]){
				temp[point++]=arr[left++];
			}else{
				temp[point++]=arr[right];
				right++;
			}
		}
		
		while(left<=mid){
			temp[point++] = arr[left++];
		}
		
		while(right<=high){
			temp[point++] = arr[right++];
		}
		System.arraycopy(temp, low, arr, low, (high-low+1));
	}
	
	public static void divide(int arr[],int low,int high){
		if(low<high){
			int mid = (low+high)/2;
			divide(arr,low,mid);
			divide(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,6,7,1,2,3,4};
		System.out.println(Arrays.toString(arr));
		divide(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

}
