package aig.hackerrank.interview_preparation_kit.search;

import java.util.Objects;
import java.util.function.Consumer;

public class SwapNodes {

  static class TreeNode {
    final int index;
    final int depth;
    TreeNode left;
    TreeNode right;

    TreeNode(int index, int depth) {
      this.index = index;
      this.depth = depth;
    }

    public int getIndex() {
      return index;
    }

    public int getDepth() {
      return depth;
    }

    public TreeNode getLeft() {
      return left;
    }

    public TreeNode getRight() {
      return right;
    }

    public void swapLeftRight() {
      TreeNode swap = left;
      left = right;
      right = swap;
    }

    public void setLeft(TreeNode left) {
      this.left = left;
    }

    public void setRight(TreeNode right) {
      this.right = right;
    }
  }

  private final TreeNode root;
  private final int nodesCount;

  public SwapNodes(int[][] indexes) {
    root = buildTree(indexes);
    nodesCount = indexes.length;
  }

  int[][] swapNodes(int[] queries) {
    int[][] answers = new int[queries.length][];
    for (int i = 0; i < queries.length; i++) {

      final int k = queries[i];
      traversing(
          root,
          treeNode -> {
            if (treeNode.getDepth() % k == 0) {
              treeNode.swapLeftRight();
            }
          });
      final int[] answer = new int[nodesCount];
      final int[] idx = new int[1];
      traversing(root, treeNode -> answer[idx[0]++] = treeNode.getIndex());
      answers[i] = answer;
    }

    return answers;
  }

  private TreeNode buildTree(int[][] indexes) {
    TreeNode[] tree = new TreeNode[indexes.length + 1];
    tree[1] = new TreeNode(1, 1);
    for (int i = 0; i < indexes.length; i++) {
      int leftIndex = indexes[i][0];
      int rightIndex = indexes[i][1];

      TreeNode parent = tree[i + 1];

      if (leftIndex != -1) {
        TreeNode left = new TreeNode(leftIndex, parent.getDepth() + 1);
        parent.setLeft(left);
        tree[leftIndex] = left;
      }

      if (rightIndex != -1) {
        TreeNode right = new TreeNode(rightIndex, parent.getDepth() + 1);
        parent.setRight(right);
        tree[rightIndex] = right;
      }
    }
    return tree[1];
  }

  private void traversing(TreeNode node, Consumer<TreeNode> c) {
    TreeNode left = node.getLeft();
    TreeNode right = node.getRight();
    if (Objects.nonNull(left)) {
      traversing(left, c);
    }
    c.accept(node);
    if (Objects.nonNull(right)) {
      traversing(right, c);
    }
  }
}
