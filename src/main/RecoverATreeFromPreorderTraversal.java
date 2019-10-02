package main;

import java.util.ArrayList;
import java.util.Stack;

/*
 * @Author: Yixiong J
 * @Date: 2019-09-30 11:20:13
 * @LastEditors: Yixiong J
 * @LastEditTime: 2019-10-02 00:56:54
 * @Description: https://leetcode.com/problems/recover-a-tree-from-preorder-traversal/
 */
public class RecoverATreeFromPreorderTraversal{
    public ArrayList<int[]> build(String S) {
        String[] list = S.split("-");
        ArrayList<int[]> depths = new ArrayList<int[]>();
        int[] depth = {Integer.parseInt(list[0]),0};
        depths.add(depth);
        int d = 1;
        for(int i = 1;i<list.length;i++){
            if(!list[i].isEmpty()){
                int[] curDepth = {Integer.parseInt(list[i]),d};
                depths.add(curDepth);
                d = 1;
            }
            else{
                d++;
            }
        }
        return depths;
    }
    public TreeNode recoverFromPreorder(String S) {
        ArrayList<int[]> depths = build(S);
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = new TreeNode(depths.get(0)[0]);
        stack.add(root);
        for(int i =1;i<depths.size();i++){
            TreeNode curNode = new TreeNode(depths.get(i)[0]);
            if(stack.peek().left==null) stack.peek().left=curNode;
            else if(stack.peek().right==null) stack.peek().right=curNode;
            else System.err.println("WrongInput");
            if(i+1<depths.size()){
                int diff = depths.get(i)[1]-depths.get(i+1)[1];
                if(diff == -1){
                    stack.add(curNode);
                }
                else if(diff > 0){
                    for(int j = 0;j<diff;j++){
                        stack.pop();
                    }
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {
        RecoverATreeFromPreorderTraversal ratfpt = new RecoverATreeFromPreorderTraversal();
        TreeNode tree = ratfpt.recoverFromPreorder("1-401--349---90--88");
    }
}
