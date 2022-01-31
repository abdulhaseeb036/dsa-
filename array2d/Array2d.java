package array2d;

import java.util.LinkedList;
import java.util.Scanner;


public class Array2d {
	public void getVal(int [][] array2d) {
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
		    System.out.println("Enter value");
			Scanner sc = new Scanner(System.in);
			int val = sc.nextInt();
			array2d[i][j] = val;		
			}		
		}	
	}
	
	public void display(int [][] array2d) {
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + " ");
			}
		   System.out.println("");
		}
	}
	public void multiplication(int [][]array2d, int[][] vacMul) {
	  for (int i = 0; i < array2d.length; i++) {
		for (int j = 0; j < array2d[i].length; j++) {
			vacMul[i][j] = array2d[i][j];		
			
		}
	}
	}

	public static void main(String[] args) {
		Array2d a2d = new Array2d();
		
//      one way to declare 2d array in java
//		int[][] arr2d = { { 1, 2, 3, 4 }, { 5, 6, 4, 3 }, { 2, 3, 1, 2 } };
		
//		second wai to declare array in java;
		int[][] array2d = new int[3][4];
		int [][] vecMul = new int[3][4];
		a2d.getVal(array2d);	
		a2d.display(array2d);
		a2d.multiplication(array2d, vecMul);
	}
}
