package com.DSA.linkedlist;

//TODO 10/march/2020 430,445,138,86,25,21,23,1669 clone a linked lsit usign random pointer




public class LinkedList {
    private Node head;
    private Node tail;
    private int size;


public int getHead(){
        return head.val;
}
public boolean search(int n){
    Node temp=head;
    while(temp!=null){
        if(temp.val ==n)return true;
    }
    return false;
}
    public int get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;

    }
//Recursive Insert without using tail or anything, although i will be updating the tail
    public void insertRec(int val,int index){
        if(index>size){
            System.out.println("Size of Linked list is "+ size+"\nAdd at "+size+" first");
            return;
        }
       head = insertRec(val,index,head);

    }
    public Node insertRec(int val,int index,Node node){

        if(index==0){
            size++;
            Node temp=new Node(val,node);
            return temp;
        }
        node.next=insertRec(val,index-1,node.next);
        return node;
    }


    public void insert(int val,int index){
       if(index>size){
           System.out.println("Size of Linked list is "+ size+"\nAdd at "+size+" first");
           return;
       }
        if(index==0){insertatHead(val);
        return;}
        if(index==size){insertAttail(val);
        return;}
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
    }
    public void insertatHead(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null)tail=node;
        size++;
    }
    public void insertAttail(int val){
        Node node =new Node(val);
        tail.next=node;
        tail=node;

        if(head==null)head=node;

        size++;
    }
public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
    System.out.println("null");
}
    public void deleteDuplicates(){
        deleteDuplicates(head);
    }
public void deleteDuplicates(Node head){
        if(head.next==null){
            tail=head;
            return;}
        if(head.val ==head.next.val){
            head.next=head.next.next;
            size--;
            deleteDuplicates(head);
        }else
        deleteDuplicates(head.next);
}

public int deletehead(){
        int val=head.val;
        head=head.next;
        if(head==null)tail=null;
        size--;
        return val;
}
public Node getNode(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;

}
public int deleteTail(){

        if(size<=1)return deletehead();
        Node temp=getNode(size-2);
        int val=temp.next.val;

        temp.next=null;
        tail=temp;
        return val;
}
public int delete(int index){
    if(index>=size){
        System.out.println("Size of Linked list is "
                + size+"\nCannot delete at Index "
                +index+"\nAdd at "+size+" first");
        return -1;
    }
        if(index==0)return deletehead();
        if(index==size-1)return deleteTail();

        Node temp=getNode(index-1);
        int val=temp.next.val;
        temp.next=temp.next.next;
        return val;

}public boolean findCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)return true;
        }
        return false;
    }
    public int lengthOfCycle(){
       if(!findCycle())
        return -1;
        Node slow=head;
        Node fast=head;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast)break;
        }int count=0;
       while (slow!=fast){
           count++;
           slow=slow.next;
       }
       return count;
    }




public Node find(int val){
        Node temp=head;
        while (temp!=null){
            if(temp.val ==val)return temp;

            temp=temp.next;
        }
        return null;
}



   private class Node{
    private int val;
    private Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }


}


}
