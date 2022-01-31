package zshape;
//package assignments;
//import java.util.Arrays;
//import java.util.List;
//
//public class MergeNodes {
//	
////	
//	
//
//	public class TreeProblem<T>{
//	    private T data = null;
//	    private List<TreeProblem> children = new ArrayList<>();
//	    private TreeProblem ceo = null;
//
//	    public TreeProblem(T data) {
//	        this.data = data;
//	    }
//
//	    public void addChild(TreeProblem child) {
//	        child.setceo(this);
//	        this.children.add(child);
//	    }
//
//	    public void addChild(T data) {
//	        TreeProblem<T> newChild = new TreeProblem<>(data);
//	        this.addChild(newChild);
//	    }
//
//	    public void addChildren(List<TreeProblem> children) {
//	        for(TreeProblem t : children) {
//	            t.setceo(this);
//	        }
//	        this.children.addAll(children);
//	    }
//
//	    public List<TreeProblem> getChildren() {
//	        return children;
//	    }
//
//	    public T getData() {
//	        return data;
//	    }
//
//	    public void setData(T data) {
//	        this.data = data;
//	    }
//
//	    private void setceo(TreeProblem ceo) {
//	        this.ceo = ceo;
//	    }
//
//	    public TreeProblem getceo() {
//	        return ceo;
//	    }
//
//
//	    public static void main(String[] args) {
//	        TreeProblem<String> root = new TreeProblem<>("CEO");
//
//	TreeProblem<String> GM1 = new TreeProblem<>("Gernal Manager(1)");
//	GM1.addChild("Employee 1");
//	GM1.addChild("Employee 2");
//	GM1.addChild("Employee 3");
//	GM1.addChild("Employee 4");
//	GM1.addChild("Employee 5");
//
//
//
//
//	TreeProblem<String> GM2 = new TreeProblem<>("Gernal Manager(2)");
//	GM2.addChild("Employee 1");
//	GM2.addChild("Employee 2");
//	GM2.addChild("Employee 3");
//	GM2.addChild("Employee 4");
//
//
//	TreeProblem<String> GM3 = new TreeProblem<>("Gernal Manager(3)");
//	GM3.addChild("Employee 1");
//	GM3.addChild("Employee 2");
//	GM3.addChild("Employee 3");
//
//
//	root.addChild(GM1);
//	root.addChild(GM2);
//	root.addChild(GM3);
//
//	// root.addChildren(Arrays.asList(
////	         new TreeProblem<>("Child4"),
////	         new TreeProblem<>("Child5"),
////	         new TreeProblem<>("Child6")
//	// ));
//
//	for(TreeProblem node : root.getChildren()) {
//	    System.out.println(node.getData());
//	}
//	    }
//	}
//	
//	
//	
////
//
//}
