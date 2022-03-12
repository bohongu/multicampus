package tree;

public class TreeMain {

	public static void main(String[] args) {
		Node nj = new Node("J");
		Node ni = new Node("I");
		Node nh = new Node("H");
		Node nd = new Node("D", nh, ni);
		Node ne = new Node("E", nj, null);
		Node nb = new Node("B", nd, ne);
		Node nf = new Node("F");
		Node ng = new Node("G");
		Node nc = new Node("C", nf, ng);
		Node na = new Node("A", nb, nc);
		
		BinaryTree bt = new BinaryTree();
		bt.setRoot(na);
		System.out.println("=전위=");
		bt.inorder(na);
		System.out.println("=중위=");
		bt.preorder(na);
		System.out.println("=후위=");
		bt.postorder(na);
		System.out.println("=너비우선=");
		bt.levelorder(na);
		
	}

}
