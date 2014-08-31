package SortingTechniques;

import java.util.Arrays;

class SelectionSort{
	public static int getMin(int[] arr,int pos){
		int min = pos;
		for(int i=pos+1;i<arr.length;i++){
			if(arr[i]<arr[min])
				min = i;
		}
		return min;
	}

	public static  void selectionsort(int[] arr,int pos){
		if(pos!=arr.length){
			int temp = getMin(arr,pos);
			if(temp!=pos){
				int a = arr[pos];
				arr[pos] = arr[temp];
				arr[temp] = a;
			}
			selectionsort(arr,pos+1);
		}
	} 

	public static void main(String args[]){
		int arr[] = {5,6,7,1,2,3,4};
		System.out.println(Arrays.toString(arr));
		selectionsort(arr,0);
		System.out.println(Arrays.toString(arr));
	}
}