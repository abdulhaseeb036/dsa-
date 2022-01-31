package zshape;
import java.util.Scanner;

public class Power {
	public void powerNum(int n,int b, int e) {
		int result = 1;
		System.out.println("Base is " + b + " and exponent " + e);
		if(e == 1) {
			return;
		}
		e--;
		powerNum(n, n*b,e);
	}
	public static void main(String[] args) {
		Power p = new Power();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base ");
		int base = sc.nextInt();
		System.out.println("Enter Exponent");
		int exponent = sc.nextInt();
		int num = base;
		p.powerNum(num,base, exponent);
	}

}
