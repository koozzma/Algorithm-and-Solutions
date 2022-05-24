public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(5);
        System.out.println(tree.containsNode(2));
        tree.delete(1);
        System.out.println(tree.getSize());
    }
}
