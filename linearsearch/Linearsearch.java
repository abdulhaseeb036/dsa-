package linearsearch;

public class Linearsearch {
	public int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				System.out.println(target + " " + "Found at " + i);
			} else {
				System.out.println(target + " " + "not found");
			}
		}
		return -1;
		
	}
	public static void main(String [] args) {
		int arr[] = {2,4,23,2,3};
		int target = 23;
		
		Linearsearch ls = new Linearsearch();
		ls.linearSearch(arr, target);
	}
   
}
