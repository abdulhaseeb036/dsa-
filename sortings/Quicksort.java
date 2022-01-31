package sortings;

public class Quicksort {
	public void swap(int[] arr, int pIndex, int i) { //arr , 0 , 0; arr, 4,4
		int temp  = arr[i]; //temp = 3  
		arr[i] = arr[pIndex]; // [3,2,1,4,5]
		arr[pIndex] = temp; 
		
	}
	public void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int p = partition(arr, low, high);  //high = 4 ind val , low = 0, 
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	public int partition(int[] arr, int low, int high) {  // arr, 0, 4 ,  arr = {3,2,1,4,5}
		int pivot = arr[high]; //arr[4] = 5
		int pIndex = low -1; //0-1 = -1;
		for (int i = 0; i <=high-1; i++) { //i=0; i<=4-1 = 3, i=1; 
			if(arr[i] < pivot){ //i=0 -> 3<5 = true,;; i=1 -> 2<5;
				pIndex++; //0 1
//				swap(arr, pIndex, i); //arr , 0, 0
			}
		}
		swap(arr, pIndex + 1, high); //arr, 4, 4
		return (pIndex++);
	}
	public static void main(String[] args) {
		Quicksort q = new Quicksort();
		int[] arr = {3,2,1,4,5};
		q.quickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
