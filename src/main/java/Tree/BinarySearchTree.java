package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BinarySearchTree {

    Node root = null;

    public void insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
        } else {
            traverse(root, node);
        }
    }

    public void traverse(Node root, Node n) {
        if (n.data <= root.data) {
            if (root.left == null) {
                root.left = n;
            } else {
                root = root.left;
                traverse(root, n);
            }
        } else {
            if (root.right == null) {
                root.right = n;
            } else {
                root = root.right;
                traverse(root, n);
            }
        }
    }

    public boolean lookUp(int value) {
        if (this.root == null) {
            return false;
        } else {
            Node current = this.root;
            while (current != null) {
                if (current.data == value) {
                    return true;
                } else {
                    if (current.data > value) {
                        current = current.left;
                    } else {
                        current = current.right;
                    }
                }
            }
        }
        return false;
    }

    public boolean remove(int value) {
        if (this.root == null) {
            System.out.println("Doesn't Exist");
            return false;
        } else {
            Node currentNode = this.root;
            Node parentNode = null;
            while (currentNode != null) {
                if (currentNode.data > value) {
                    parentNode = currentNode;
                    currentNode = currentNode.left;

                } else if (currentNode.data < value) {
                    parentNode = currentNode;
                    currentNode = currentNode.right;
                } else if (currentNode.data == value) {
                    //No right child
                    if (currentNode.right == null) {
                        if (parentNode == null) {
                            this.root = currentNode.left;
                        } else {
                            if (parentNode.data > currentNode.data) {
                                parentNode.left = currentNode.left;
                            } else if (parentNode.data < currentNode.data) {
                                parentNode.right = currentNode.left;
                            }
                        }
                    }
                    //right child does not have left child
                    if (currentNode.right.left == null) {
                        if (parentNode == null) {
                            this.root = currentNode.right;
                        } else {
                            if (parentNode.data > currentNode.data) {
                                parentNode.left = currentNode;
                            } else if (parentNode.data < currentNode.data) {
                                parentNode.right = currentNode;
                            }
                        }
                    }
                    //right child has a left child
                    else {
                        Node leftmostChild = currentNode.right.left;
                        Node leftmostParent = currentNode.right;
                        while (leftmostChild.left != null) {
                            leftmostParent = leftmostChild;
                            leftmostChild = leftmostChild.left;
                        }

                        leftmostParent.left = leftmostChild.right;
                        leftmostChild.left = currentNode.left;
                        leftmostChild.right = currentNode.right;

                        if (parentNode == null) {
                            this.root = leftmostChild;
                        } else {
                            if (parentNode.data < value) {
                                parentNode.left = leftmostChild;
                            } else if (parentNode.data > value) {
                                parentNode.right = leftmostChild;
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    public void breadthFirstSearch() {
        Node currentNode = this.root;
        ArrayList<Integer> seq = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(currentNode);

        while (queue.size() > 0) {
            Node node = queue.peek();
            seq.add(node.data);
            System.out.println(node.data);
            queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        System.out.println(seq);
    }


    public ArrayList<Integer> breadthFirstSearchRecursive(Queue<Node> queue, ArrayList<Integer> arr) {
        if(queue.size()==0){
            return arr;
        }
        else{
            Node currentNode = queue.peek();
            arr.add(currentNode.data);
            queue.remove();
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
            return breadthFirstSearchRecursive(queue,arr);
        }
    }

    public ArrayList<Integer>  dfsInOrder(Node node, ArrayList<Integer> arr){
        if(node.left!=null){
            dfsInOrder(node.left,arr);
        }
        arr.add(node.data);
        if(node.right!=null){
            dfsInOrder(node.right,arr);
        }
        return arr;
    }

    public ArrayList<Integer>  dfsPreOrder(Node node, ArrayList<Integer> arr){
        arr.add(node.data);
        if(node.left!=null){
            dfsPreOrder(node.left,arr);
        }
        if(node.right!=null){
            dfsPreOrder(node.right,arr);
        }
        return arr;
    }

    public ArrayList<Integer>  dfsPostOrder(Node node, ArrayList<Integer> arr){
        if(node.left!=null){
            dfsPostOrder(node.left,arr);
        }
        if(node.right!=null){
            dfsPostOrder(node.right,arr);
        }
        arr.add(node.data);
        return arr;
    }



}
