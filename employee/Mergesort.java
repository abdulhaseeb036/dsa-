package employee;

public class Mergesort {
	private Employe<String> employedataSorted;

	public Mergesort(Employe<String> employedataSorted) {
		this.employedataSorted = employedataSorted;
	}

	public Employe<String> getUnsortedArrayList() {
		return employedataSorted;
	}
	
	public void divide(String[]  employedataSorted) {
		int n =  employedataSorted.length;
		int mid = 0+n/2;
		System.out.println(n);
		
		
		String[] left = new String[mid];
		String[] right = new String[n - mid];
		divide(left);
		divide(right);
	}
	public void merge(String[] employedataSorted, String[] left,String[] right) {
		
	}

}
