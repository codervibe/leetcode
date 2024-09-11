package com.leetcode.day2;

/**
 * Created by codervibe on 2024/9/10
 * DateTime:2024/09/10 下午9:33
 * Description: 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 *
 * Others:
 */

public class Demo004 {
    public int searchInsert(int[] nums, int target) {
        int numLen =nums.length;
        int left = 0,right = numLen - 1,ans=numLen;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
