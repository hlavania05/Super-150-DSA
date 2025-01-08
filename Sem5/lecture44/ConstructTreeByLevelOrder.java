package Sem5.lecture44;
import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
public class ConstructTreeByLevelOrder {
    private static Node root;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = sc.nextInt();
        Node mynode = new Node(item);
        root = mynode;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(mynode);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if(c1 != -1){
                Node nn = new Node(c1);
                node.left = nn;
                queue.offer(nn);
            }
            if(c2 != -1) {
                Node nn = new Node(c2);
                node.right = nn;
                queue.offer(nn);
            }
        }
        Display(root);
    }
    public static void Display(Node root){
        if(root == null){
            return;
        }
        String s = "<--" + root.val + "-->";
        if(root.left != null){
            s = root.left.val + s;
        }
        else{
            s = "END" + s;
        }
        if(root.right != null){
            s = s + root.right.val;
        }
        else{
            s = s + "END";
        }
        System.out.println(s);
        Display(root.left);
        Display(root.right);
    }
}
