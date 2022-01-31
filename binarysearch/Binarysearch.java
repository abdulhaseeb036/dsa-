package binarysearch;

public class Binarysearch {
	public void binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start + end) / 2;

//			System.out.println(start + " " + mid + " " + end);
			if(arr[mid] < target) {
			 start = mid +1;
			}
			else if(arr[mid] > target) {
				end = mid -1;
			}
			else if(arr[mid] == target){
				System.out.println(target + " found at index " + mid);
				break;
			}
			else {
				System.out.println("target not found");
			}
//			if(start > end) {
//				System.out.println("System out space");
//			}
//			if(mid > end ) {
//				System.out.println("System out space mid greater");
//			}
		}
		
//		return target;
		
	}
	public static void main(String[] args) {
		int arr[] = {2,4,5,6,7,12,15};
		int target = 7;
		Binarysearch b1= new Binarysearch();
		b1.binarySearch(arr, target);
		
	}

}
