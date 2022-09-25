package DataStructure.java.com;


import java.util.Scanner;

public class BinarySearchT {

     static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }

    public static Node insert(Node root,int val){
         if(root==null){
             root= new Node(val);
             return root;
         }
         if(root.data>val){
             root.left= insert(root.left,val);
         }
         else {
             root.right= insert(root.right,val);
         }
         return root;
    }
    public static void inorder(Node root){
         if(root==null){
             return;
         }
         inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static  boolean search(Node root,int key){
         if(root==null){
             return false;
         }
         if(root.data>key){
             return search(root.left,key);
         }
         else if(root.data==key){
             return true;
         }else {
             return search(root.right,key);
         }
    }
    public  static Node delete(Node root ,int val){
         if(root.data>val){
             root.left= delete(root.left,val);
         }else if(root.data<val){
             root.right= delete(root.right,val);
         }
         else {
             if(root.left==null&&root.right==null){
                 return null;
             }
             if(root.left==null){
                 return root.right;
             }else if(root.right==null){
                 return root.left;
             }
             Node Is = inorderSuccessor(root.right);
             root.data = Is.data;
             root.right= delete(root.right, Is.data);
         }
         return root;
    }
    public static Node inorderSuccessor(Node root){
         while(root.left!=null){
             root = root.left;
         }
         return root;
    }

    public static void main(String[] args) {
        System.out.println("Binary search tree inorder traversal");
         int[] values ={5,1,3,4,2,7,12,14};
         Node root = null;
        for (int value : values) {
            root = insert(root, value);
        }
         inorder(root);
        System.out.println();
        System.out.println("After delete node");
        delete(root,4);
        inorder(root);
        System.out.println("\n");
        System.out.println("Enter key for search");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        if(search(root,key)){
            System.out.println("key is found in tree");
        }else {
            System.out.println("key is not found");
        }


    }
}
