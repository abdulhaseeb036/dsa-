package arrayList;
import java.util.*;

public class Arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(3);
		l1.add(49);
		l1.add(4);
		l1.add(0, 9); //Its take index 0 then put the value in it 0 index
		//Now our expected array will be --> [9 3 3 49 4]

		
        //ArrayList.size() -> like Array.length
		System.out.println("The size of ArrayList " + l1.size());
		
        //ArrayList.clone() return a complete array like reference [9 3 3 49 4].
		System.out.println("The clone of ArrayList " + l1.clone());
		//ArrayList.containes() check the given value if it is present in array return true else false.
        System.out.println("The contains of ArrayList is item became " + l1.contains(3));
                
        
		
      
		
		
        
	}

}
