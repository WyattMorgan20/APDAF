/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morgan_assignment05;

import java.util.*;

/**
 *
 * 
 * @author Wyatt Morgan
 */
public class recursiveThreeDTree {

    static class Node {
        int p1, p2, p3;
        Node left, right, horizontal;

        Node(int p1, int p2, int p3) {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }

        @Override
        public String toString() {
            return "(" + p1 + "," + p2 + "," + p3 + ")";
        }
    }
    
    Node root;
    
    public static void main(String[] args) {
        recursiveThreeDTree tree = new recursiveThreeDTree();

        int[][] records = {
                {5, 2, 2}, {5, 2, 3}, {5, 2, 4}, {5, 2, 5},
                {5, 3, 1}, {5, 3, 2}, {5, 3, 99}, {7, 4, 3},
                {5, 3, 87}, {6, 4, 3}, {1, 7, 4}, {5, 4, 3}, {5, 4, 1}
        };

        for (int[] record : records) {
            tree.insert(record[0], record[1], record[2]);
        }

        tree.traverse();
    }
    
    public void insert(int p1, int p2, int p3) {
        root = insertRecursive(root, new Node(p1, p2, p3), 1);
    }

    private Node insertRecursive(Node current, Node newNode, int level) {
        if (current == null) return newNode;

        if (level == 1) {
            if (newNode.p1 < current.p1) {
                current.left = insertRecursive(current.left, newNode, 1);
            }
            else if (newNode.p1 > current.p1) {
                current.right = insertRecursive(current.right, newNode, 1);
            }
            else {
                current.horizontal = insertRecursive(current.horizontal, newNode, 2);
            }
        }
        else if (level == 2) {
            if (newNode.p2 < current.p2) {
                current.left = insertRecursive(current.left, newNode, 2);
            }
            else if (newNode.p2 > current.p2) {
                current.right = insertRecursive(current.right, newNode, 2);
            }
            else {
                current.horizontal = insertRecursive(current.horizontal, newNode, 3);
            }
        }
        else {
            if (newNode.p3 < current.p3) {
                current.left = insertRecursive(current.left, newNode, 3);
            }
            else if (newNode.p3 > current.p3) {
                current.right = insertRecursive(current.right, newNode, 3);
            }
            else {
                // do nothing
            }
        }
        return current;
    }

    public void traverse() {
        System.out.println("Traversing 3D Tree:");
        traverseRecursive(root);
    }

    private void traverseRecursive(Node node) {
        if (node == null) return;

        traverseRecursive(node.left);

        Node temp = node;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.horizontal;
        }

        traverseRecursive(node.right);
    }

    
} 