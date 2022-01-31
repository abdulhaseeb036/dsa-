package sortings;

public class Mergesort {
	public void mergeSort(int[] arr) {
		int length = arr.length; //5
		if(length < 2) { // 5 < 2
			return;
		}
		int mid =length /2; //mid = 5/2 = 2		
		int[] left = new int[mid]; //left[2]
		int[] right = new int[length - mid]; //3
		for(int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int i = mid; i < length; i++) {
			right[i-mid] = arr[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}
	public void merge(int[] arr, int[] left, int[] right) {
		int leftLength = left.length; 
		int rightLength = right.length; 
		int i = 0; int j = 0; int k= 0;
		while(i < leftLength && j < rightLength) { //left and right empty ni hay - base if left & right array empty
			if(left[i] < right[j]) { 
				arr[k] = left[i];
				i++;
				k++;
			} else {
				arr[k] = right[j];
				j++;
				k++;			
			}
			while(i<leftLength) {
				arr[k] = left[i];
				k++;
				i++;
			}
			while(j<rightLength) {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		
	}
	public static void main(String[] args) {
		Mergesort m = new Mergesort();
		int[] arr = {3,1,5,6,4};
		m.mergeSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
	}

}
