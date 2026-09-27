import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        preOrder(root, list);
        Collections.sort(list);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int x : list)
        {
            set.add(x);
        }

        int count = 0;
        for(int ele : set) { 
            if(count == 1) {
                return ele;
            }
            count++;
        } 
        
        return -1; 
    }

    public void preOrder(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return;
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }
}