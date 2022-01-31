package zshape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// JS

//class TreeProblem {
//	constructor() {
//		this.data = data;
//	}
//}
//const treeProblem = new TreeProblem("CEO");
//const treeProblem = new TreeProblem("GM1");

public class TreeProblem<T> {
	T data;
    public List<TreeProblem> children = new ArrayList<>();
    public TreeProblem ceo = null;

	TreeProblem(T data) {
		this.data = data; // here our value is set 1-data = CEO; 2-data = General Manager1
		System.out.println(data);
		System.out.println();
       
	}
	
	public void addChild(String child) {
		
	}

	public static void main(String[] args) {
		TreeProblem<String> root = new TreeProblem<>("CEO");
		TreeProblem<String> GM1 = new TreeProblem<>("General Manager1");
		GM1.addChild("Employe 1");
		

	}

}
