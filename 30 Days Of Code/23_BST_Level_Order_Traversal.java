import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

static void levelOrder(Node root){
    Queue<Node> queue = new LinkedList<>(); // LinkedList implements Queue
    queue.add(root);
    while (!queue.isEmpty()) {
        Node node = queue.poll();
        System.out.print(node.data + " ");
        if (node.left != null) {
            queue.add(node.left);
        }
        if(node.right != null) {
            queue.add(node.right);
        }
    }
}

public static Node insert(Node root,int data){