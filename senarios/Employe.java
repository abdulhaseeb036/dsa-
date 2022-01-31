package senarios;

public class Employe {
	static String id;
	static String name;
	static String depart;
	static String post;

	public Employe(String id,String name, String depart,String post) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.post = post;
		
	}
	public static void display() {
		System.out.print(id + " " + name + " "+ depart + " " + post);
	}
	
	public static void main(String [] args) {
		Employe e1 = new Employe("IT-012", "haseb", "IT", "junior developer");
		Employe e2 = new Employe("IT-013", "alam","IT", "junior developer");
		Employe[] emp = {e1, e2};
		Employe.display();
		
	}
	

}
