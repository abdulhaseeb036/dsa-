package zshape;

public class MaxMinarr {
	public void maxMinValue(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Min value is: " + arr[0]);
		System.out.println("Max value is: " + arr[arr.length-1]);
	}
	public static void main(String[] args) {
		MaxMinarr maxmin = new MaxMinarr();
		int arr[] = {3,2,6,4,1,3,1};
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		maxmin.maxMinValue(arr);
	}
}
