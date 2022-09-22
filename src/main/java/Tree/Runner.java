package Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Runner {

    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(10);
        b.insert(20);
        b.insert(9);
        b.insert(7);
        b.insert(8);
        System.out.println(b.lookUp(21));
        b.breadthFirstSearch();
        Queue<Node> queue = new LinkedList<>();
        queue.add(b.root);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> brr = new ArrayList<>();
        ArrayList<Integer> crr = new ArrayList<>();
        ArrayList<Integer> drr = new ArrayList<>();
        System.out.println(b.breadthFirstSearchRecursive(queue, arr));

        System.out.println(b.dfsInOrder(b.root,brr));
        System.out.println(b.dfsPreOrder(b.root,crr));
        System.out.println(b.dfsPostOrder(b.root,drr));
    }



}
