package zshape;


public class GenericArray<T> {
	int size;
	int i = 0;
	T arr[];
	public GenericArray(int s) {
		this.size = s;
		arr = (T[])new Object[size];
	}
	
	public void add(T val) {
		if(i < size) {
			arr[i] = val;
			i++;
		}
		else {
			System.out.println("Limit full");
		}
	}
	
	public void display(){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " \t");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		GenericArray<Integer> a = new GenericArray<Integer>(3);
		a.add(3);
		a.add(4);
		a.add(20);
		a.display();
	}
}
