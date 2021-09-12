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

	public static int getHeight(Node root){
        return(recursiveGetHeight(root, 0));
    }
    
    public static int recursiveGetHeight(Node node, int height) {
        int leftHeight = 0;
        int rightHeight = 0;
        
        if (node.left == null && node.right == null) {
            return height;
        }
        if (node.left != null) {
            leftHeight = recursiveGetHeight(node.left, height + 1);
        }
        if (node.right != null) {
            rightHeight = recursiveGetHeight(node.right, height + 1);
        }
        
        
        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }

    public static Node insert(Node root,int data){