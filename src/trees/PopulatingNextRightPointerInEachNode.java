package com.DSA.trees;
//leetcode Questions

public class PopulatingNextRightPointerInEachNode extends BinaryTree{


    PopulatingNextRightPointerInEachNode(int root) {
        super(root);
    }


//116. Populating Next Right Pointers in Each Node
//public TreeNode connect() {
//    if(root==null)return root;
//    root.next=null;
//    Queue<TreeNode> q=new ArrayDeque<>();
//
//    q.add(root);
//    while(!q.isEmpty()){
//       TreeNode ptr=q.peek();
//
//        int len=q.size();
//        for(int i=0;i<len;i++){
//
//
//
//            if(q.peek().right!=null)
//                q.add(q.peek().right);
//            if(q.peek().left!=null)
//                q.add(q.peek().left);
//
//           ptr.next= q.remove();
//           ptr=ptr.next;
//        }
//    ptr.next=null;
//    }
//
//    return root;
//}


}
