package matrixMul;


public class Matrixmul {
	public void matrixMul(int a[][], int b[][], int result[][]) {
		int sum = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				for (k = 0; k < 3; k++) {
					sum += a[i][k] * b[k][j];
				}
				result[i][j] = sum;
				sum = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Matrixmul mm = new Matrixmul();
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
		int result[][] = new int[2][2];
		mm.matrixMul(a, b, result);
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(result[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
