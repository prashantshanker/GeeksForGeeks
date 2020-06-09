import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Insertion {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeTreeInput(true, 0, true);
		printDetailTree(root);
		int key = 12;
		insert(root, key);
		printDetailTree(root);
	}

	private static void insert(BinaryTreeNode<Integer> root, int key) {
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();
		q.add(root);
		while (!q.isEmpty()) {
			root = q.peek();
			q.remove();
			if (root.left == null) {
				root.left = new BinaryTreeNode<Integer>(key);
				break;
			} else {
				q.add(root.left);
			}
			if (root.right == null) {
				root.right = new BinaryTreeNode<Integer>(key);
				break;
			} else {
				q.add(root.right);
			}
		}
	}

	private static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isleft) {
		if (isRoot) {
			System.out.println("Enter root data");
		} else {
			if (isleft) {
				System.out.println("Enter Left Child of" + parentData);
			} else {
				System.out.println("Enter Right Child of" + parentData);
			}
		}
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInput(false, rootData, false);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}

	private static void printDetailTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if (root.left != null) {
			System.out.print("L" + root.left.data);
		}
		if (root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		printDetailTree(root.left);
		printDetailTree(root.right);
	}

}
