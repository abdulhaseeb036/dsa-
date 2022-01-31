package sortings;

public class BubbleSort {
	public void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) { 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int p = 0; p < arr.length; p++) {
			System.out.print(arr[p] + "\t");
		}
	}
	
	public static void main(String args[]) {
		BubbleSort b = new BubbleSort();
		int[] arr = {4,2,1,3,6};
		b.bubbleSort(arr);
		
	}
	

}
