/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morgan_assignment05;

import java.util.*;

/**
 *
 * @author Wyatt Morgan
 */
public class randomRecursiveThreeDTree {
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

    public void insert(int p1, int p2, int p3) {
        root = insertRecursive(root, new Node(p1, p2, p3), 1);
    }

    private Node insertRecursive(Node current, Node newNode, int level) {
        if (current == null) return newNode;

        if (level == 1) {
            if (newNode.p1 < current.p1) current.left = insertRecursive(current.left, newNode, 1);
            
            else if (newNode.p1 > current.p1) current.right = insertRecursive(current.right, newNode, 1);
            
            else current.horizontal = insertRecursive(current.horizontal, newNode, 2);
        }
        else if (level == 2) {
            if (newNode.p2 < current.p2) current.left = insertRecursive(current.left, newNode, 2);
            
            else if (newNode.p2 > current.p2) current.right = insertRecursive(current.right, newNode, 2);
            
            else current.horizontal = insertRecursive(current.horizontal, newNode, 3);
        }
        else {
            if (newNode.p3 < current.p3) current.left = insertRecursive(current.left, newNode, 3);
            
            else if (newNode.p3 > current.p3) current.right = insertRecursive(current.right, newNode, 3);
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

    // making my random numbers
    public static int[][] generatePhoneRecords(int count) {
        Random rand = new Random();
        int[][] records = new int[count][3];

        for (int i = 0; i < count; i++) {
            int p1 = rand.nextInt(900) + 100; // area code 100-999
            int p2 = rand.nextInt(900) + 100; // exchange code 100-999
            int p3 = rand.nextInt(10000);     // line number 0-9999
            records[i][0] = p1;
            records[i][1] = p2;
            records[i][2] = p3;
        }

        return records;
    }

    public static void runExperiment(int count) {
        System.out.println("\n--- Experiment: Inserting and Traversing " + count + " records ---");
        randomRecursiveThreeDTree tree = new randomRecursiveThreeDTree();

        int[][] phoneRecords = generatePhoneRecords(count);

        long insertStart = System.nanoTime();
        for (int[] rec : phoneRecords) {
            tree.insert(rec[0], rec[1], rec[2]);
        }
        long insertEnd = System.nanoTime();

        long traverseStart = System.nanoTime();
        tree.traverse();
        long traverseEnd = System.nanoTime();

        System.out.println("Insert time: " + (insertEnd - insertStart) / 1_000_000.0 + " ms");
        System.out.println("Traverse time: " + (traverseEnd - traverseStart) / 1_000_000.0 + " ms");
    }

    public static void main(String[] args) {
        runExperiment(10);
        runExperiment(100);
        runExperiment(500);
    }
}
