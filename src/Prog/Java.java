/*Solution of 1st Problem*/

package Prog;


import java.util.*; 

class Java

{ 
	
 
static class Node 
{ 
	int data; 
	Node left, right; 
}; 


static Node newNode(int data) 
{ 
	Node temp = new Node(); 
	temp.data = data; 
	temp.left = temp.right = null; 
	return temp; 
} 


static void printLeafNodes(Node root) 
{ 
	
	if (root == null) 
		return; 

	 
	if (root.left == null && root.right == null) 
	{ 
		System.out.print( root.data +" "); 
		return; 
	} 

	
	if (root.right != null) 
		printLeafNodes(root.right); 

	if (root.left != null) 
		printLeafNodes(root.left); 
} 


public static void main(String args[]) 
{ 
	Node root = newNode(8); 
	root.right = newNode(10); 
	root.left = newNode(3); 
	root.left.left = newNode(14); 
	root.left.right = newNode(6); 
	root.left.left = newNode(1); 
	root.right.right.left = newNode(13); 
	root.left.right.right = newNode(7); 
	root.left.right.left = newNode(4); 


	printLeafNodes(root); 
} 
} 


