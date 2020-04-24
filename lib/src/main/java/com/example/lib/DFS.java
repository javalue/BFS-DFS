package com.example.lib;

import java.util.Stack;

/**
 * @author tong.xu
 * @date 2020/4/24.
 * description：
 */
public class DFS {

  //       0
  //    1      2
  //  3   4  5   6
  //7              8

  private static TreeNode root = new TreeNode(0);
  private static TreeNode A1 = new TreeNode(1);
  private static TreeNode A2 = new TreeNode(2);
  private static TreeNode A3 = new TreeNode(3);
  private static TreeNode A4 = new TreeNode(4);
  private static TreeNode A5 = new TreeNode(5);
  private static TreeNode A6 = new TreeNode(6);
  private static TreeNode A7 = new TreeNode(7);
  private static TreeNode A8 = new TreeNode(8);

  public static void main(String[] args) {

    root.left = A1;
    root.right = A2;

    A1.left = A3;
    A1.right = A4;

    A2.left = A5;
    A2.right = A6;

    A3.left = A7;
    A6.right = A8;

    //dfs(root);

    dfsStack(root);
  }

  /**
   * 递归
   */
  private static void dfs(TreeNode node) {
    if (node == null) {
      return;
    }

    System.out.print(" - " + node.value);

    dfs(node.left);
    dfs(node.right);
  }

  /**
   * 用栈处理dfs
   * @param root
   */
  private static void dfsStack(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);

    while (!stack.empty()) {
      TreeNode node = stack.peek();
      System.out.print(" - " + node.value);
      stack.pop();

      if (node.right != null) {
        stack.push(node.right);
      }
      if (node.left != null) {
        stack.push(node.left);
      }
    }
  }
}