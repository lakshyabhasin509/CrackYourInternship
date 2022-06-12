package com.DSA.trees;

import java.util.ArrayList;
import java.util.List;

public class CountLeafNodes {

    public static void main(String[] args) {
//-7 -3 -1 -1 -9 -3 9 -7 -4 -1 6 -1 -6 -6 -1 -1 0 6 5 -1 9 -1 -1 1 -4 -1 -1 -1 -2
        Solution ob=new Solution(4);
        ob.createTree();
        System.out.println(ob.diameterOfBinaryTree());
    }
}
//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
class Solution extends BinaryTree {
    Solution(int root) {
        super(root);
    }

    public int noOfLeafNodes(){
        return noOfLeafNodes(root);
    }
    public int noOfLeafNodes(TreeNode root) {
        // Write your code here.
        if(root==null)return 0;
        if(root.right==null && root.left==null)return 1;

        int count=0;
        count+=noOfLeafNodes(root.right);
        count+=noOfLeafNodes(root.left);

        return count;
    }
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> res = new ArrayList<>();
        int depth = (int)(Math.log(label)/Math.log(2));
        System.out.println(depth);
        boolean reverse = (depth & 1)==1;
        // Number of nodes in previous lvls : (1<<depth) - 1;
        // Number of nodes in current lvl: (1<<depth)
        // node index: 4 5 6 7
        // reverse index: 7 6 5 4
        // notice that the index and reverse index sum to a constant number 11 for the same level:
        // index for node 4 : (1<<depth) - 1 + 1
        // reverse index for node 4: (1<<depth) - 1 + (1<<depth)
        // so sum for node 4 is 3 * (1<<depth) - 1
        // so we have formula:
        // id + reverse_id =  3 * (1<<depth) - 1
        System.out.println( Math.pow(2,depth) - 1);
        int id = reverse ? (3 * (1<<depth) - label - 1): label;
        while(id!=0)
        {
            label = reverse ? (3 * (1<<depth) - id - 1) : id;
            res.add(0, label);
            id>>=1;
            depth--;
            reverse = !reverse;
        }

        return res;
    }
    public int diameterOfBinaryTree(){
        return diameterOfBinaryTree(root);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;

        int leftsubtree=diameterOfBinaryTree(root.left);
        int rightsubtree=diameterOfBinaryTree(root.right);
        int mix=height(root.left)+height(root.right);

        return Math.max(Math.max(leftsubtree,rightsubtree),mix)-1;}

    int height(TreeNode root){
        if(root==null)return 0;



        return 1 + Math.max(height(root.left),height(root.right));


    }
}

