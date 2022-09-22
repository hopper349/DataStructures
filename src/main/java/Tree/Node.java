package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Node {
    Node left;
    Node right;
    int data;

    public Node(int value) {
        this.data = value;
        right = null;
        left = null;
    }

    public void traverse(Node root, Node nNode) {

        if (nNode.data <= root.data) {
            if (root.left == null) {
                root.left = nNode;
            } else {
                root = root.left;
                traverse(root, nNode);
            }
        } else {
            if (root.right == null) {
                root.right = nNode;
            } else {
                root = root.right;
                traverse(root, nNode);
            }
        }


    }


    public void insert(int data) {
        Node root = null;
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            traverse(root, newNode);
        }
    }

    public void bfs() {
        Node root = null;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        queue.add(root);

        while (queue.size() > 0) {
            Node node = queue.peek();
            arr.add(node.data);
            queue.remove();

            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }


    }
}
