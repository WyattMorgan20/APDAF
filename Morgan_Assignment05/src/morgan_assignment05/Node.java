/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morgan_assignment05;

/**
 *
 * @author Wyatt Morgan
 */
public class Node {
    int p1, p2, p3;
    Node left, right, horizontal;
    int depth, level;

    Node(int p1, int p2, int p3, int depth, int level) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.depth = depth;
        this.level = level;
        this.left = this.right = this.horizontal = null;
    }

    @Override
    public String toString() {
        return "(" + p1 + "," + p2 + "," + p3 + ") [" + depth + "," + level + "]";
    }
}
