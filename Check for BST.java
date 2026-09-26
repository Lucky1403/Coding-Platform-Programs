/* Structure of a Binary Search Tree node
class Node {
	int data;
	Node left;
	Node right;
	
	Node(int val) {
		data = val;
		left = right = null;
	}
} */

import java.util.ArrayList;

class Solution {
	public boolean isBST(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		inOrder(root, list);
		for (int i = 1; i < list.size(); i++)
			{
			if (list.get(i - 1) >= list.get(i))
				return false;
		}
		return true;
	}
	
	public void inOrder(Node root, ArrayList<Integer> list) {
		if (root == null)
			return;
		inOrder(root.left, list);
		list.add(root.data);
		inOrder(root.right, list);
	}
}
