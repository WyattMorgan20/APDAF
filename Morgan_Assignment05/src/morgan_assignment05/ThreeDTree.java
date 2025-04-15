/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package morgan_assignment05;

/**
 *
 * @author Wyatt Morgan
 */
public class ThreeDTree {

    private Node root;

    public static void main(String[] args) {
        ThreeDTree tree = new ThreeDTree();

        // Question 2: Insert 13 values
        int[][] data = {
            {5,2,2}, {5,2,3}, {5,2,4}, {5,2,5},
            {5,3,1}, {5,3,2}, {5,3,99}, {7,4,3},
            {5,3,87}, {6,4,3}, {1,7,4}, {5,4,3}, {5,4,1}
        };

        for (int[] record : data) {
            tree.insert(record[0], record[1], record[2]);
        }

        System.out.println("3D Tree for 13 records:");
        tree.printTree();
    }
    
    public void insert(int p1, int p2, int p3) {
        root = insert(root, p1, p2, p3, 0, 0);
    }
    
    private Node insert(Node current, int p1, int p2, int p3, int depth, int level) {
        if (current == null) return new Node(p1, p2, p3, depth, level);

        if (p1 < current.p1) {
            current.left = insert(current.left, p1, p2, p3, depth + 1, level);
        }
        else if (p1 > current.p1) {
            current.right = insert(current.right, p1, p2, p3, depth + 1, level);
        }
        else {
            if (p2 < current.p2) {
                current.horizontal = insert(current.horizontal, p1, p2, p3, 0, level + 1);
            }
            else if (p2 > current.p2) {
                current.horizontal = insert(current.horizontal, p1, p2, p3, 0, level + 1);
            }
            else {
                if (p3 < current.p3) {
                    current.horizontal = insert(current.horizontal, p1, p2, p3, 0, level + 1);
                }
                else if (p3 > current.p3) {
                    current.horizontal = insert(current.horizontal, p1, p2, p3, 0, level + 1);
                }
            }
        }
        return current;
    }

    public void printTree() {
        printTree(root);
    }

    private void printTree(Node node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node);
            printTree(node.horizontal);
            printTree(node.right);
        }
    }
    
}
