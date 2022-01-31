package recursion;

public class Recursion {
	//getTriangularNum
//	public int getTriangularNum(int num) {
//		int result;
//		if(num ==1) {
//			System.out.println("Method: " + num);
//			return 1;
//		} else {
//			System.out.println("Method: " + num);
//			result = num + getTriangularNum(num -1);
//			System.out.print(num + " + getTriangularNum(" + num + "-1) ");
//		}
//		System.out.println(" " + result);
//		return result;
//	}
    //factorial
//	public int factorial(int num) {
//		int result;
//		if(num ==1) {
//			System.out.println("Method" + num);
//			return 1;
//		} else {
//			System.out.println("Method" + num);
//			result = num * factorial(num -1);
//			System.out.print(num + " * factorial("+ num + "-1)");
//		}
//		System.out.println(" " + result);
//		return result;
//	}
    //febonaci
	public int fabonnaci(int location) {
		int result = 0;
		if(location <= 0) {
			System.out.println("Out of range");
			return 0;
		} else if(location == 1 || location == 2){
			return 1;
		} 
		else return fabonnaci(location-2) + fabonnaci(location-1);
		
	}
	
	public static void main(String[] args) {
		Recursion r = new Recursion();
//		r.getTriangularNum(6);
//		r.factorial(5);
		for (int i = 1; i < 6; i++) {
			System.out.print(r.fabonnaci(i));
		}
		
	}

}
