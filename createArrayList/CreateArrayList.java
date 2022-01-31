package createArrayList;

public class CreateArrayList<T> {
	T data[];
	int size = 0;

	CreateArrayList() {
		this(1);
	}

	public CreateArrayList(int iniCap) {
		if (iniCap > 0) {
			data = (T[]) new Object[iniCap];
//			System.out.println(data.length);
//			System.out.println(size);
		} else if (iniCap == 0) {
			data = (T[]) new Object[0];
		} else {
			System.out.println("Array index not negative");
		}
	}
	
	public void add(T value) {
		ensureCapacity();
		data[size] = value;
		size++;
	}
	
	public void add(int index, T value) {
		ensureCapacity();
		if(index>size || index < 0) {
			System.out.print("Array Index limit exceed and cannot be negative number");
		} else {
			for (int i = size-1; i >= index; i--) {
				data[i+1] = data[i];
			}
			data[index] = value;
			size++;
		}
	}
	
	public void remove(int index) {
		if(index>= size || index == 0) {
			System.out.print("Array Index limit exceed and cannot be negative number");
		} else {
			T temp = data[index];
			for (int i = index; i < data.length-1; i++) {
				data[i] = data[i+1];
			}
			data[--size] = null;
		}
	}
	
	public void set(int index, T value) {
		if(index>=size) {
			System.out.println("Not Negative Number");
		} else {
			data[index] = value;
		}
	}
	
	public T get(int index) {
		if(index>=size) {
			System.out.println("Not Negative Number");
		} else {
			System.out.println("Your value found at your " + index + " index is: " + data[index]);
		}
		return data[index];
	}
	public boolean contains(T value) {
		if(indexOf(value) != -1) {
			return true;
		}
		return false;	
	}
	
	public int indexOf(T value) {
			for (int i = 0; i < data.length; i++) {
				if(data[i] == value) {
					return  i;
				}
			}
		return -1;
	}
	
	public void remove() {
		for (int i = 0; i < data.length; i++) {
			data[i] = null;
		}
	}
	
	void ensureCapacity() {
		if(data.length<= size) {
			int oldCap = data.length;
			int newCap = data.length+1;
		    T temp[] = (T[]) new Object[newCap];
		    for (int i = 0; i < data.length; i++) {
				 temp[i] = data[i];
			}
		    data = temp;
		}
	}
	
	public void display() {
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		CreateArrayList<Integer> l1 = new CreateArrayList<Integer>();
		l1.add(5);
		l1.add(3);
		l1.add(10);
		l1.display();
		l1.add(1, 23);
		l1.display();
		l1.remove(1);
		l1.display();
		l1.set(2, 18);
		l1.display();
		l1.get(2);
		System.out.println(l1.indexOf(18));
		System.out.println(l1.contains(3));
		l1.remove();
		l1.display();
	}

}
