class Driver {

	public static void main(String args[]) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(44);
		tree.insert(27);
		tree.insert(37);
		tree.insert(60);
		tree.insert(12);
		tree.insert(28);
		tree.insert(62);
		tree.insert(42);

		int value = 12;
		System.out.println("Level of " + value + " : " + tree.getLevel(value));;

	}

}