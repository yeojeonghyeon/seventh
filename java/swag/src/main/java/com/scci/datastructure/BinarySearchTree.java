package com.scci.datastructure;

public class BinarySearchTree {
	static class Node{
		int key;
		Node left, right;
		public Node(int data) {
			key = data;
			left = right = null;
		}
	}
	public static Node insert(Node root, int key) {
		if ( root == null ) {
			root = new Node(key);
			return root;
		}
		if ( key < root.key ) {
			root.left = insert(root.left, key);
		}else if ( key > root.key ) {
			root.right = insert(root.right, key);
		}
		return root;
	}
	
	public static Node search(Node root, int key) {
		if ( root.key == key ) {
			return root;
		}else if (root.key > key) {
			return search(root.left, key);
		}else if (root.key < key) {
			return search(root.right, key);
		}
		return null;
	}
	
	public static void main(String[] args) {
		Node root = null;
		for(int i=0; i<10; i++) {
			root = insert(root, i);
		}
		Node found = search(root, 5);
		System.out.println(found.key);
	}
}
