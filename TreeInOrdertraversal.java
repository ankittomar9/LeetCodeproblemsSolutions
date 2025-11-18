import java.util.ArrayList;
import java.util.List;

public class TreeInOrdertraversal {
    public static void main(String args[]){
        // --- 1. Manual Tree Construction (Your Input) ---
        // We will build the structure: 1 -> 2 (R) -> 3 (L)
        // Which translates to: 1(root), 2(right child), 3(left child of 2)
        System.out.println("Building the tree: 1(root) -> 2(R) -> 3(L of 2)");
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        root.right = node2;
        node2.left = node3;

    List<Integer> result=new ArrayList<>();
    TreeInOrdertraversal tree=new TreeInOrdertraversal();
       
    tree.InorderHelper(root,result);

    System.out.println("Inorder Traversal Result: " + result);
    }

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

      public TreeNode(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    
    public void InorderHelper(TreeNode root,List<Integer> result){
      
        if(root==null){
            return;
        }

        InorderHelper(root.left,result);
        result.add(root.val);
        InorderHelper(root.right,result);

    }
}
