package genericArray;



public class GenericArray<T> {
	int size;
	int i = 0;
	T arr[];
	@SuppressWarnings("unchecked")
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
	
	public void remove(T val) {
		for (int i = 0; i < arr.length; i++) {
		   if(arr[i] == val) {
			   arr[i] = null;
		   }
		}
	}
	
	public void get(int ind) {
		for (int i = 0; i < arr.length; i++) {
			if (i == ind) {
				System.out.println(arr[i] + "\t");		
			}
		}
	}
	
	public boolean contains(T val) {
		System.out.println(arr[1]);
		for (int i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(arr.length <0) {
			return true;
		}
		return false;
	}
	
	public int indexOf(T val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;
	}
	
	public void toArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print("["+arr[i] + "]"+ " ");
		}
	}
	
	public void trimToSize() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == null) {
				this.size = i;
				arr = (T[])new Object[size];
			}
		}
	}
	
//	public void toLowwerCase() {
//		for (int i = 0; i < arr.length; i++) {
//			((String) arr[i]).toLowerCase();
//		}
//	}
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
		a.remove(20);
		a.get(2);
		a.contains(20);
		a.isEmpty();
		a.indexOf(20);
		a.toArray();
		a.trimToSize();
		
//		GenericArray<String> b = new GenericArray<String>(3);
//		b.add("Haseeb");
//		b.add("ali");
//		b.toLowwerCase();
//		b.display();
//		b.remove();
//		b.display();	
	}
}
