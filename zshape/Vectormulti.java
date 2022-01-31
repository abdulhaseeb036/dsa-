package zshape;

public class Vectormulti {
	public void vecMul(int a[], int b[], int r[]) {
        for (int i = 0; i < r.length; i++) {
			r[i] = a[i] * b[i];
		}
	}

	public static void main(String[] args) {
		Vectormulti vm = new Vectormulti();
		 int a[] = {2,3,6,4};
		 int b[] = {4,2,6,4};
		 int r[] = new int[4];
		 vm.vecMul(a,b,r);
		 for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + "\t");
		}
	}
}
