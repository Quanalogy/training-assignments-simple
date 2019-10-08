package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        }

        BinaryTreeNode<Integer> value = (nodeValue < node.getValue()) ? node.getLeft():node.getRight();

        if (value == null) {
            throw new TreeException("Value not found in tree!");
        } else {
            return 1 + calculateDepth(value, nodeValue);
        }
    }
}