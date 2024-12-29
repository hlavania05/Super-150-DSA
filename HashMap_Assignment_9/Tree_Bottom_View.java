package HashMap_Assignment_9;

import java.util.*;

class Node_ {
    int dta;
    Node_ left, right;
    public Node_(int DTA) {
        this.dta = DTA;
        left = null;
        right = null;
    }
}

public class BottomView_of_BinaryTree {

public static void main(String[] args) {
    Scanner scnner = new Scanner(System.in);
    String[] ip = scnner.nextLine().split(" ");

    Node_ ROT = build_Tree(ip);

    List<Integer> btm_vw = BottomView(ROT);
    for (int val : btm_vw) {
        System.out.print(val + " ");
    }
}

private static Node_ build_Tree(String[] ip) {
    if (ip.length == 0 || ip[0].equals("-1")) {
        return null;
    }

    Node_ ROT = new Node_(Integer.parseInt(ip[0]));
    Queue<Node_> qu = new LinkedList<>();
    qu.add(ROT);
    int num = 1;

    while (!qu.isEmpty() && num < ip.length) {
        Node_ curr_NOD = qu.poll();

        if (!ip[num].equals("-1")) {
            curr_NOD.left = new Node_(Integer.parseInt(ip[num]));
            qu.add(curr_NOD.left);
        }
        num++;

        if (num < ip.length && !ip[num].equals("-1")) {
            curr_NOD.right = new Node_(Integer.parseInt(ip[num]));
            qu.add(curr_NOD.right);
        }
        num++;
    }

    return ROT;
}

private static List<Integer> BottomView(Node_ ROT) {
    List<Integer> ans = new ArrayList<>();
    if (ROT == null) {
        return ans;
    }

    TreeMap<Integer, Integer> map = new TreeMap<>();
    Queue<Pair> qu = new LinkedList<>();
    qu.add(new Pair(ROT, 0));

    while (!qu.isEmpty()) {
        Pair pair = qu.poll();
        Node_ curr_node = pair.NODE;
        int line = pair.hori_dist;

        map.put(line, curr_node.dta);

        if (curr_node.left != null) {
            qu.add(new Pair(curr_node.left, line - 1));
        }

        if (curr_node.right != null) {
            qu.add(new Pair(curr_node.right, line + 1));
        }
    }

    ans.addAll(map.values());
    return ans;
}

static class Pair {
    Node_ NODE;
    int hori_dist;
    public Pair(Node_ NODE, int hori_dist) {
        this.NODE = NODE;
        this.hori_dist = hori_dist;
    }
}
}
