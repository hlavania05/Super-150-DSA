package HashMap_Assignment_9;

import java.util.*;
import java.io.*;
public class Top_View {
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        Binary_Tree bt=new Binary_Tree(arr);
//        bt.display();
//        bt.topview();

    }
}


class Binary_Tree
{
    private class Node
    {
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
        }
    }
    class Pair{
        Node node;
        int line;
        Pair(Node root, int line){
            node = root;
            this.line = line;
        }
    }

    Node root;

    Binary_Tree(String[] arr)
    {
        Queue<Node> queue=new LinkedList<Node>();
        construct(arr,0,queue);
    }

    public void topview()
    {
        verticalTraversalTop(this.root);
    }

    private void verticalTraversalTop(Node root) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                Pair pair = q.poll();
                int line = pair.line;
                Node node = pair.node;
                if(!map.containsKey(line)){
                    map.put(line, node.data);
                }
                if(node.left != null){
                    q.offer(new Pair(node.left, line - 1));
                }
                if(node.right != null){
                    q.offer(new Pair(node.right, line + 1));
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(map.values());
        for(int item : ans){
            if(item != -1){
                System.out.print(item + " ");
            }
        }

    }


    private void construct(String[] arr,int ind,Queue<Node> queue)
    {
        if(ind>=arr.length)
            return;
        if(queue.size()==0)
        {
            Node nn=new Node(Integer.parseInt(arr[ind]));
            this.root=nn;
            queue.add(nn);
        }
        else
        {
            Node parent=queue.peek();
            if(parent.data!=-1){
                if(parent.left==null)
                {
                    parent.left=new Node(Integer.parseInt(arr[ind]));
                    queue.add(parent.left);
                }
                else
                {
                    if(parent.right==null)
                    {
                        parent.right=new Node(Integer.parseInt(arr[ind]));
                        queue.add(parent.right);
                        queue.poll();
                    }
                }
            }
            else
            {
                queue.poll();
                ind--;
            }
        }
        construct(arr,ind+1,queue);
    }

    public void display()
    {
        display_tree(this.root);
    }

    private void display_tree(Node root)
    {
        if(root==null)
            return;
        String str=root.data+"";
        if(root.left!=null)
        {
            str=root.left.data+" <= "+str;
        }
        else
        {
            str="END <= "+str;
        }

        if(root.right!=null)
        {
            str=str+" => "+root.right.data;
        }
        else
        {
            str=str+" => END";
        }
        System.out.println(str);
        display_tree(root.left);
        display_tree(root.right);

    }


}
