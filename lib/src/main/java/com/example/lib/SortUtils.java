package com.example.lib;

import com.example.lib.sort.BubbleSort;
import com.example.lib.sort.QuickSort;

/**
 * @author tong.xu
 * @date 2020/5/15.
 * description：
 */
public class SortUtils {

  public static void main(String[] args) {
    int[] arrays = new int[] { 2, 1, 3, 4, 7, 9, 0, 6, 1 };
    int[] arrays2 = new int[] { 2, 1, 3, 4, 7, 9, 0, 6, 1 };


    BubbleSort.bubbleSort(arrays);

    QuickSort.quickSort(arrays2, 0, arrays2.length - 1);

    for (int a : arrays2) {
      System.out.print(a + "-");
    }
  }
}
