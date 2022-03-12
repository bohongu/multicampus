package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
	//조회
	//DFS
	//중위
	public void inorder(Node n) {
		if(n!=null) {
			inorder(n.getLeft());
			System.out.println(n.getName());
			inorder(n.getRight());
		}
	}
	
	//전위
	public void preorder(Node n) {
		if(n!=null) {
			System.out.println(n.getName());
			preorder(n.getLeft());
			preorder(n.getRight());
		}
	}
	
	//후위
	public void postorder(Node n) {
		if(n!=null) {
			postorder(n.getLeft());
			postorder(n.getRight());
			System.out.println(n.getName());
		}
	}
	
	//BFS
	public void levelorder(Node n) {
		Queue<Node> q = new LinkedList();
		q.add(n);//root
		Node temp;
		while(!q.isEmpty()) {
			temp = q.remove();
			System.out.print(temp.getName() + "-");
			if(temp.getLeft() != null) {
				q.add(temp.getLeft());
			}
			if(temp.getRight() != null) {
				q.add(temp.getRight());
			}
		}
	}
	
	public void find(Node n) {
		if(n!=null) {
			find(n.getLeft());
			find(n.getRight());
			System.out.println(n.getName());
			
		}
	}
}
