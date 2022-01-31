package zshape;

public class ReverseString {
	public String substr(int s, String name) {
		String newStr = "";
		for (int i = s; i < name.length(); i++) {
			newStr += name.charAt(i);
		}
		return newStr;
	}

	public String firstInd(int s, int l, String name) {
		String newStr = "";
		for (int i = s; i < l; i++) {
			newStr += name.charAt(i);
		}
		return newStr;
	}

	public String reverse(String name) {
		if (name.isEmpty()) {
			return name;
		}
		return reverse(substr(1, name)) + firstInd(0,1,name);
	}

	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		String name = "haseeb";
		System.out.println("Before reverse " + name);
		rs.substr(1, name);
		rs.firstInd(0, 1, name);
		rs.reverse(name);
		System.out.println("After reverse " +rs.reverse(name));
	}

}
