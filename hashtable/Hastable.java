package hashtable;
import java.util.Hashtable;

public class Hastable {
	public static void main(String args[]) {
		Hashtable<String, Integer> ht = new Hashtable();
		
		ht.put("Haseeb alam", 100);
		ht.put("Biala", 15);
		ht.put("ALi", 50);
		ht.put("haris", 150);
		
		System.out.println(" " + ht.entrySet());
		
		int maxMarks =  0;
		String maxKey ="";
		for (String key: ht.keySet()) {
			if(maxMarks < ht.get(key)) {
				maxKey = key;
				maxMarks= ht.get(key);
			}
		}
		System.out.println("The max marks of the student: " + maxKey + " and the marks: " + maxMarks);
	}
}

