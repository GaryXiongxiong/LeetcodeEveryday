import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @Author: Gary J
 * @Date: 2019-09-26 19:47:05
 * @LastEditors: Gary J
 * @LastEditTime: 2019-09-26 21:59:41
 * @Description: https://leetcode.com/problems/smallest-string-starting-from-leaf/
 */
public class SmallestStringStartingFromLeaf{
    public String smallestFromLeaf(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<TreeNode> listOfNode = new ArrayList<TreeNode>();
        ArrayList<TreeNode> listOfLeaves = new ArrayList<TreeNode>();
        HashMap<TreeNode,TreeNode> fatherNode = new HashMap<TreeNode,TreeNode>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        queue.add(root);
        fatherNode.put(root,null);
        while(queue.peek()!=null){
            TreeNode curNode = queue.poll();
            if(curNode.left!=null) {
                queue.add(curNode.left);
                fatherNode.put(curNode.left, curNode);
            }
            if(curNode.right!=null) {
                queue.add(curNode.right);
                fatherNode.put(curNode.right,curNode);
            }
            listOfNode.add(curNode);
            if(curNode.left==null&&curNode.right==null){
                listOfLeaves.add(curNode);
            }
        }
        // ****** old version of compare String ******
        // TreeNode smallestLeaves = listOfLeaves.get(0);
        // for(int i = 1;i<listOfLeaves.size();i++){
        //     TreeNode node1=smallestLeaves,node2=listOfLeaves.get(i);
        //     while(true){
        //         if(node1.val>node2.val){
        //             smallestLeaves = listOfLeaves.get(i);
        //             break;
        //         }
        //         else if(node1.val<node2.val){
        //             break;
        //         }
        //         else if(node1.val==node2.val){
        //             if(fatherNode.get(node1)==null){
        //                 break;
        //             }
        //             else if(fatherNode.get(node2)==null){
        //                 smallestLeaves = listOfLeaves.get(i);
        //                 break;
        //             }
        //             else{
        //                 node1 = fatherNode.get(node1);
        //                 node2 = fatherNode.get(node2);
        //             }
        //         }
        //     }
        // }
        String smallestLeave = "~";
        for(int i = 0;i<listOfLeaves.size();i++){
            TreeNode curLeaves = listOfLeaves.get(i);
            StringBuilder sb = new StringBuilder();
            while(curLeaves!=null){
                sb.append(alphabet.charAt(curLeaves.val));
                curLeaves = fatherNode.get(curLeaves);
            }
            if(sb.toString().compareTo(smallestLeave)<0){
                smallestLeave = sb.toString();
            }
        }
        return smallestLeave;
    }
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(0);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(2);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(3);
        TreeNode t7 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        SmallestStringStartingFromLeaf sssfl = new SmallestStringStartingFromLeaf();
        System.out.println(sssfl.smallestFromLeaf(t1));
    }
}

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode(int x) { val = x; }
}
