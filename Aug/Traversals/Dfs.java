public class Dfs{
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printInorder(tree.root);
        System.out.println();
    }

    public static class Node{
        int key;
        Node left,right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }

    public static class BinaryTree{
        Node root;

        BinaryTree(){
            root = null;
        }

        public void printPreorder(Node node){
            if(node==null){
                return;
            }
            /**First print data of node */
            System.out.print(node.key + " ");

            /**Recur on left subtree */
            printPreorder(node.left);

            /**Recur on right subtree */
            printPreorder(node.right);
        }

        public void printInorder(Node node){
            if(node==null){
                return;
            }
            /**First recur on left subtree */
            printInorder(node.left);

            /**then print data of node */
            System.out.print(node.key + " ");

            /**now recur on right subtree */
            printInorder(node.right);
        }

        public void printPostorder(Node node){
            if(node==null){
                return;
            }
            /**First recur on the left subtree */
            printInorder(node.left);

            /**now recur on the right subtree */
            printInorder(node.right);

            /**Print data of node */
            System.out.print(node.key + " ");
        }
    }
}