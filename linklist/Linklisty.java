package linklist;
import java.util.Iterator;
import java.util.LinkedList;

public class Linklisty {
	public static void main(String[] args) {
		LinkedList linky = new LinkedList();
		linky.add(4);
		linky.add("haseeb");
		System.out.println(linky);
		System.out.println(linky.contains(4));
		System.out.println(linky.get(0));
        
	   Iterator i = linky.iterator();
	   while(i.hasNext()) {
		   if(i.next() == "haseeb") {
			 String name  =  i.toString();
			 System.out.println(name);
		   }
	   }
	}
}
