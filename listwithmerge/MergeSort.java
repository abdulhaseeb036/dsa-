package listwithmerge;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
	private ArrayList<String> strList;

//    This is a constructor
	public MergeSort(ArrayList<String> input) {
		this.strList = input;
	}

//	sort method
	public void sort() {
		strList = mergeSort(strList);
	}

	public ArrayList<String> mergeSort(ArrayList<String> unsorted) {
		ArrayList<String> left = new ArrayList<String>();
		ArrayList<String> right = new ArrayList<String>();
		if (unsorted.size() == 1) {
			return unsorted;
		} else {
			int middle = unsorted.size() / 2;
			for (int i = 0; i < middle; i++) {
				left.add(unsorted.get(i));
			}
			for (int i = middle; i < unsorted.size(); i++) {
				right.add(unsorted.get(i));
			}
			System.out.println("\t" + left.clone());
			System.out.println("\t \t" + right.clone());
			mergeSort(left);
			mergeSort(right);
			System.out.println("Left array clone: "+ left.clone() +  ", Right array clone: " + right.clone() + ", unsorted array clone: "+ unsorted.clone());
			merge(left, right, unsorted);
		}
		return unsorted;
	}

	private void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> unsorted) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < left.size() && j < right.size()) { //left and right empty ni hay - base if left & right array empty
			if ((left.get(i).compareTo(right.get(j)) < 0)) { // left < right
				unsorted.set(k, left.get(i)); //setting in unsorted to sorted;
				k++;
				i++;
			} else {
				unsorted.set(k, right.get(j));
				k++;
				j++;
			}
			k++;
		}
	}

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your list items, type done to exit");
		String strin = sc.nextLine();
		while (!strin.equals("done")) {
			input.add(strin);
			strin = sc.nextLine();
		}
		System.out.println("***********************************************");
		MergeSort test = new MergeSort(input);
		test.sort();
	}
}
