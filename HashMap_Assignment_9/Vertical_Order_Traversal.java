package HashMap_Assignment_9;

import java.util.*;

public class Vertical_Order_Traversal {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    static Scanner sca_nner = new Scanner(System.in);
    static Node build_tree() {
        int data = sca_nner.nextInt();
        Node root = new Node(data);

        Queue<Node> queu = new LinkedList<>();
        queu.add(root);

        while (!queu.isEmpty()) {
            Node temp = queu.poll();
            int left = sca_nner.nextInt();
            int righ = sca_nner.nextInt();

            if (left != -1) {
                temp.left = new Node(left);
                queu.add(temp.left);
            }
            if (righ != -1) {
                temp.right = new Node(righ);
                queu.add(temp.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        int leve = sca_nner.nextInt();
        Node root = build_tree();

        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Vertical_Order(root, map, 0);

        for(int item : map.keySet()){
            for(int value : map.get(item)){
                System.out.print(value + " ");
            }
        }
    }
    static void Vertical_Order(Node root, Map<Integer, ArrayList<Integer>> map, int dist) {
        if (root == null)
            return;

        if(!map.containsKey(dist)) {
            map.put(dist, new ArrayList<>());
        }
        map.get(dist).add(root.data);

        Vertical_Order(root.left, map, dist - 1);
        Vertical_Order(root.right, map, dist + 1);
    }
}