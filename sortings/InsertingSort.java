package sortings;

public class InsertingSort {
	public void insertionSort(int arr[]) {
		int key; int value;
		for (int i = 1; i < arr.length; i++) {
			key = i;
			value = arr[i]; //3
			while(key>0 && value < arr[key-1]) { //3 < 5 
				 arr[key] = arr[key-1];  //[2, 3,5, 6,7];
				 key--; //1
			}
			arr[key]= value;
		}
		for (int p = 0; p < arr.length; p++) {
			System.out.println(arr[p] + "\t");
		}
		
	}
 	public static void main(String[] args) {
		InsertingSort i = new InsertingSort();
		int[] arr = {2,5,3,5,6,7};
		i.insertionSort(arr);
	}

}
