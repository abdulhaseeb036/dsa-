package employee;

import employee.Mergesort;

public class Employe<T>{
	int size;
	T arr[];

	Employe() {
		this(3);
	}

	public Employe(int iniCap) {
		if (iniCap > 0) {
			arr = (T[]) new Object[size];
		} else if (iniCap == 0) {
			arr = (T[]) new Object[0];
		} else {
			System.out.println("Limit Exceeded");
		}
	}

	private void add(T data) {
		ensureCapacity();
		arr[size] = data;
		size++;
	}

	public void ensureCapacity() {
		if (arr.length < 0) {
			System.out.println("Alert! Memory Error");
		} else if (arr.length > 11) {
			System.out.println("Limit of eployees reach");
		} else if (arr.length <= size) {
			int oldCap = arr.length;
			int newCap = arr.length + 1;
			T temp[] = (T[]) new Object[newCap];
			for (int i = 0; i < arr.length; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		} else {
			return;
		}
	}

	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Employe<String> emp = new Employe<String>();
		emp.add("Employe 1");
		emp.add("Employe 10");
		emp.add("EMploye 11");
		emp.add("employe 4");
		emp.add("employe 6");
		emp.add("employe 5");
		emp.add("employe 2");
		emp.add("employe 3");
		emp.add("employe 7");
		emp.add("employe 8");
		emp.add("employe 9");
		emp.add("employe CEO");
		Mergesort mergesort = new Mergesort(emp);
		emp.printArray();
//		System.out.println("Employee unsorted arraylist");
//		System.out.println(mergesort.getUnsortedArrayList());
		
		
	}

}
