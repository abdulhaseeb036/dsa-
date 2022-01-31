package sortings;

public class SelectionSort {
	int min; int minIndex; int temp;
	public void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[j] <= arr[min]) {
					min = j;
				}
				int temp = arr[min];	
				arr[min] = arr[i];
			    arr[i] = temp;
			}
 		}
		for (int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + "\t");
		}
	}
	
	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int[] arr = {3,6,4,2,4,6,2,5};
		s.selectionSort(arr);
		
	}

}
