package com.leetcode.day2;

/**
 * Created by codervibe on 2024/9/10
 * DateTime:2024/09/10 下午9:33
 * Description:
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
