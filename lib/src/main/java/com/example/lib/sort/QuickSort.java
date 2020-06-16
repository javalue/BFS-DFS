package com.example.lib.sort;

/**
 * @author tong.xu
 * @date 2020/5/15.
 * description：
 */
public class QuickSort {

  /**
   * 快速排序
   */
  public static void quickSort(int[] a, int start, int end) {
    if (start >= end) {
      return;
    }

    int left = start;
    int rigjt = end;
    int pivotKey = a[left];

    while (left < rigjt) {
      //当右边的数大于基准数时，略过，继续向左查找
      //不满足条件时跳出循环，此时的j对应的元素是小于基准元素的
      while (a[rigjt] > pivotKey && left < rigjt) {
        rigjt--;
      }
      //将右边小于等于基准元素的数填入右边相应位置
      a[left] = a[rigjt];
      //当左边的数小于等于基准数时，略过，继续向右查找
      //(重复的基准元素集合到左区间)
      //不满足条件时跳出循环，此时的i对应的元素是大于等于基准元素的
      while (a[left] <= pivotKey && left < rigjt) {
        left++;
      }
      //将左边大于基准元素的数填入左边相应位置
      a[rigjt] = a[left];
    }
    //将基准元素填入相应位置
    a[left] = pivotKey;

    quickSort(a, start, left - 1);
    quickSort(a, left + 1, end);
  }
}
