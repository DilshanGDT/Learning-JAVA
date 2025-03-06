public class BinarySearchTree {

	TreeNode root;

	public BinarySearchTree() {
		this.root = null;
	}

	// insertion of a node
	public void insert(int key) {
		TreeNode newNode = new TreeNode(key);
		this.root = insertTreeNode(this.root, newNode);
	}

	private TreeNode insertTreeNode(TreeNode root, TreeNode newNode) {

		int key = newNode.key;

		if (root == null) {
			root = newNode;
			return root;
		}

		if (key < root.key) {
			root.left = insertTreeNode(root.left, newNode);

		} else if (key > root.key) {
			root.right = insertTreeNode(root.right, newNode);

		}
		return root;
	}

	//search tree height
	public int getLevel(int key) {
		int depth = TreeLevel(root, key, 0);
		return depth;
	}

	private int TreeLevel(TreeNode root, int key, int level) {
		if (root == null) {
			return 0;
		}
		if (root.key == key) {
			return level;
		}
		int result = TreeLevel(root.left, key, level + 1);
		if (result != 0) {
			// If found in left subtree , return
			return result;
		}
		result = TreeLevel(root.right, key, level + 1);
		return result;
	}

}