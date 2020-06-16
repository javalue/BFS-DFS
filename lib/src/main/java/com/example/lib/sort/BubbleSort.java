package com.example.lib.sort;

/**
 * @author tong.xu
 * @date 2020/5/15.
 * description：
 */
public class BubbleSort {

  /**
   * 冒泡算法，两两比较，把较大值沉到数组尾部
   * 从小到大
   */
  public static void bubbleSort(int[] arrays) {
    if (arrays.length <= 1) {
      return;
    }
    for (int i = 0; i < arrays.length - 1; i++) {
      //如果一次交换遍历中都没有一次交互，说明都是有序的了，直接跳出
      boolean flag = false;
      for (int j = 0; j < arrays.length - 1 - i; j++) {
        if (arrays[j + 1] < arrays[j]) {
          int temp = arrays[j];
          arrays[j] = arrays[j + 1];
          arrays[j + 1] = temp;
          flag = true;
        }
      }
      if (!flag) {
        break;
      }
    }
  }
}
