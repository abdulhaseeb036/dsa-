package zshape;

public class Quicksortalo {
		public void swap(int[] arr, int pIndex, int i) {
			int temp  = arr[i];
			arr[i] = arr[pIndex];
			arr[pIndex] = temp; 
			
		}
		public void quickSort(int[] arr, int low, int high) {
			if(low<high) {
				int p = partition(arr, low, high);
				quickSort(arr, low, p-1);
				quickSort(arr, p+1, high);
			}
		}
		public int partition(int[] arr, int low, int high) { 
			int pivot = arr[high];
			int pIndex = low -1;
			for (int i = 0; i <=high-1; i++) {
				if(arr[i] < pivot){
					pIndex++;
				}
			}
			swap(arr, pIndex + 1, high);
			return (pIndex++);
		}
		public static void main(String[] args) {
			Quicksortalo q = new Quicksortalo();
			int[] arr = {3,2,1,4,5};
			q.quickSort(arr, 0, arr.length-1);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + "\t");
			}
		}

	}


