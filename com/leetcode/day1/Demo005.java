package com.leetcode.day1;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 下午3:38
 * Description: 盛水 最多的容器
 * Others:给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 返回容器可以储存的最大水量。
 * 说明：你不能倾斜容器。
 */

public class Demo005 {
    //5ms
//    public int maxArea(int[] height) {
//        int max = 0;
//        int left = 0;
//        int right = height.length - 1;
//        while (left < right) {
//            int area = Math.min(height[left], height[right]) * (right - left) ;
//            max = Math.max(max, area);
//            if (height[left] <= height[right]) {
//                ++left;
//            } else {
//
//                --right;
//            }
//        }
//        return max;
//    }
    // 2ms
    public int maxArea(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int leftVal = height[left],rightVal=height[right];
            res = Math.max(res, Math.min(rightVal, leftVal) * (right - left));
            if (height[left] < height[right]) {
                while (left < right && height[left] <= leftVal) left++;
            } else {
                while (left < right && height[right] <= rightVal) right--;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = new Demo005().maxArea(height);
        System.out.println(maxArea);
    }
}
