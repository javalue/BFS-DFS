package com.example.lib;

/**
 * @author tong.xu
 * @date 2020/6/16.
 * description：https://leetcode-cn.com/problems/teemo-attacking/
 */
class Timo {

  public static void main(String[] args) {
    int poisonedDuration = findPoisonedDuration(new int[] { 1, 4 }, 2);
    System.out.println(poisonedDuration);
  }

  public static int findPoisonedDuration(int[] timeSeries, int duration) {

    int sum = 0;

    if (timeSeries.length > 0) {
      for (int i = 0; i < timeSeries.length; i++) {

        if (i == 0) {
          sum += duration;
        } else {
          int detal = timeSeries[i] - timeSeries[i - 1];
          if (detal < duration) {
            sum += detal;
          } else {
            sum += duration;
          }
        }
      }
    }

    return sum;
  }
}