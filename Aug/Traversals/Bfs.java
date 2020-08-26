import java.util.Queue;
import java.util.LinkedList;

public class Bfs{
    public static class Node{
        int data;
        Node left,right;

        public Node(int item){
            this.data = item;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree{

        Node root;

        /* Given a binary tree. 
        Print its nodes in level order 
        using array for implementing queue  */
        public void printLevelOrder(){
            Queue<Node> queue = new LinkedList<Node>();
            queue.add(root);

            while(!queue.isEmpty()){
                Node tempNode = queue.poll();
                System.out.print(tempNode.data + " ");

                /*Enqueue left child */
                if(tempNode.left!=null){
                    queue.add(tempNode.left);
                }

                /*Enqueue right child */
                if(tempNode.right!=null){
                    queue.add(tempNode.right);
                }
            }
        }
        
    }

    public static void main(String args[]){
        /* creating a binary tree and entering  
        the nodes */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree.printLevelOrder();
        System.out.println();
    }
}