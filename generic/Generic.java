package generic;

class Container<T> {
	private T x;
	public void setVal(T y) {
		this.x = y;
	}

	public T getVal() {
		System.out.println("heelo" + x);
		return x;
	}
}

public class Generic {
  public static void main(String[] args) {
	  Container<Integer> obj = new Container<Integer>();
	  obj.setVal(5);
	  obj.getVal();
	  
	  Container<String> obj2 = new Container<String>();
	  obj2.setVal("Haseeb Active hay");
	  obj2.getVal();
	  
  }
}
