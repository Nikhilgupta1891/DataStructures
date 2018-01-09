class Node {

	int data;
	Node left, right;
	public Node(int data) {
		this.data = data;
	}
	
	public void insert(int value) {
		if(value<=data) {
			if(left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if(right ==null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value == data) {
			return true;
		} else if(value < data) {
			if(left == null) {
				return false;
			} else {
				return left.contains(value);
			}
		} else {
			if(right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
	}
	
	public void inOrderTraversal() {
		if(left!=null) {
			left.inOrderTraversal();
		} 
		System.out.println(data);
		if(right!=null) {
			right.inOrderTraversal();
		}
	}
}