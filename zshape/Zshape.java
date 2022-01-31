package zshape;

public class Zshape {
	public static void main(String args[]) {
		for(int i=1; i<4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 4; j>=1; j--) {
			for (int k = 1; k < j; k++) {
				System.out.print("");
			}
			System.out.print("*");
		}
		System.out.println();
	}

}
