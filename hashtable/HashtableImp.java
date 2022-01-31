package hashtable;

class Entry<k, v> {
	k key;
	v value;

	Entry(k key1, v value1) {
		this.key = key1;
		this.value = value1;
	}
}

public class HashtableImp<k, v> {
	Entry bucket[];
	int size;

	HashtableImp(int n) {
		size = n;
		bucket = new Entry[size];
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = new Entry<k, v>(null, null);
		}
	}

	public int hashCode(v value) {
		return (int) value % size;
	}

	public void put(k key, v value) {
		int index = hashCode(value);
//		System.out.println(index);
		Entry<k, v> put = new Entry<k, v>(key, value);
		bucket[index] = put;
	}

	public void display() {
		for (int j = 0; j < bucket.length; j++) {
			Entry i = bucket[j];
			k name = (k) i.key;
			v number = (v) i.value;
			System.out.println(name + ",\t" + "Mob#:" + number);
		}
	}

	public static void main(String args[]) {
		HashtableImp<String, Integer> hti = new HashtableImp<String, Integer>(9);
		hti.put("HASEEB", 1242243);
		hti.put("JOHN", 22422498);
		hti.put("MURTAZA", 32423);
		hti.put("BOBY", 32443);
		hti.put("ALI", 3242243);
		hti.put("SALMA", 32422);
		hti.put("PASHA", 322423243);
		hti.put("ASAD", 242276);
		hti.put("WAHID", 2455443);
		hti.display();
	}
}
