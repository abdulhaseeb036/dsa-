package infixtopost;

import java.util.Scanner;
import java.util.Stack;

public class Infixtopost {
	public static int precedence(char oprator) {
		if (oprator == '+') {
			return 1;
		} else if (oprator == '-') {
			return 1;
		} else if (oprator == '*') {
			return 2;
		} else if (oprator == '/') {
			return 2;
		} else {
			System.out.println("Operator not valid");
		}
		return 0;
	}

	public static int operation(int val1, int val2, char oprator) {
		if (oprator == '+') {
			return val1 + val2;
		} else if (oprator == '-') {
			return val1 - val2;
		} else if (oprator == '*') {
			return val1 * val2;
		} else if (oprator == '/') {
			return val1 / val2;
		}
		return 0;
	}

	public static void main(String args[]) {
		Infixtopost inf = new Infixtopost();
		Scanner sc = new Scanner(System.in);
		String exp = sc.nextLine();
        System.out.println(exp);
		Stack<Integer> operants = new Stack<Integer>();
		Stack<Character> operators = new Stack<Character>();
		for (int i = 0; i < exp.length(); i++) {
			char ch = exp.charAt(i);
			if (ch == '(') {
				operators.push(ch);
			} else if (Character.isDigit(ch)) {
				operants.push(ch - '0');
			} else if (ch == ')') {
				while (operators.peek() != '(') {
					char operator = operators.pop();
					int val2 = operants.pop();
					int val1 = operants.pop();
					int result = operation(val1, val2, operator);
					operants.push(result);
				}
				operators.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (operators.size() > 0 || operators.peek() != '('
						|| precedence(ch) <= precedence(operators.peek())) {
					char operator = operators.pop();
					int val2 = operants.pop();
					int val1 = operants.pop();
					int result = operation(val1, val2, operator);
					operants.push(result);
				}
				operants.push(ch - '0');
			}
		}
		while (operators.peek() != '0') {
			char operator = operators.pop();
			int val2 = operants.pop();
			int val1 = operants.pop();
			int result = operation(val1, val2, operator);
			operants.push(result);
		}
		System.out.println(operators.peek());
	}
}
