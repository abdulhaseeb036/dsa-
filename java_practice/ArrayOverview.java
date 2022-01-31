package java_practice;
import java.util.Scanner;

public class ArrayOverview {

    //creates array function.
	static int arr[];
	int arr1[]={1,4,6,7,9};
	int size;
	
	//get array as user input func.
	public int[] getarray()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter array size");
		size=input.nextInt();
		arr=new int[size];
		System.out.println("Enter array values");
		for (int i = 0; i < size; i++) {
			arr[i]=input.nextInt();
		}
		return arr;
	}
	
    //display array func
	public void display(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	//total of arrays values.
	public void total(int arr[])
	{
		int total=0;
		for (int i = 0; i < arr.length; i++) {
			total=total + arr[i];
		}
		System.out.println("Sum of values are " + total);
	}
	
    //linear search.
//	public boolean linearSearch(int arr[],int value)
//	{
//		boolean found=false;
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]==value)
//			{
//				found=true;
//			}
//		}
//		return found;
//	}
    // sort array.
//	public void sort(int arr[])
//	{
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 1; j < arr.length; j++) {
//				if(arr[i]<arr[j-1])
//				{
//				int temp=arr[i];
//				arr[i]=arr[j-1];
//				arr[j-1]=temp;
//				}
//			}
//		}
//	}
	
	public void binarySearch(int arr[]) {
	 	for(int i=0; i<arr.length; i++) {
	 		if(arr[i] > arr[i+1]) {
	 			int temp = arr[i];
	 			arr[i] = arr[i+1];
	 			arr[i+1] = temp;
	 		}
	 	}
	}
	
    //vector multiplication array
//	public void vecMul(int arr[],int arr1[])
//	{
//		int ansarr[]=new int[arr.length];
//		for (int i = 0; i < ansarr.length; i++) {
//			ansarr[i]=arr[i]*arr1[i];
//		}
//	
//		for (int i = 0; i < ansarr.length; i++) {
//			System.out.println(arr[i] +" * " + arr1[i] + " = " + ansarr[i]);
//		}
//	
//	}
	
    //main.
	public static void main(String[] args) {
		ArrayOverview a=new ArrayOverview();
		int x[]=a.getarray();
//		int y[]=a.getarray();
		a.display(x);
		a.total(x);
		a.binarySearch(x);
		a.display(x);
		//System.out.println(a.linearSearch(x, 6));
		//a.sort(x);
		//a.display(x);
//		a.vecMul(x, y);

	}

}