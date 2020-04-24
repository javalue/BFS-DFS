package com.example.lib;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author tong.xu
 * @date 2020/4/24.
 * description：
 */
public class BFS {

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

  /**
   * 记录每个节点在第几层上
   */
  static HashMap<TreeNode, Integer> levelsMap = new HashMap<>();

  public static void main(String[] args) {

    root.left = A1;
    root.right = A2;

    A1.left = A3;
    A1.right = A4;

    A2.left = A5;
    A2.right = A6;

    A3.left = A7;
    A6.right = A8;

    bfsQueue(root);
  }

  private static void bfsQueue(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();

    queue.offer(root);
    levelsMap.put(root, 0);

    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      int level = levelsMap.get(node);
      System.out.println(node.value + "- level:" + level);

      if (node.left != null) {
        queue.offer(node.left);
        levelsMap.put(node.left, level + 1);
      }

      if (node.right != null) {
        queue.offer(node.right);
        levelsMap.put(node.right, level + 1);
      }
    }
  }
}
