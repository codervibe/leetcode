package com.leetcode.day3;

import java.util.Arrays;

/**
 * Created by codervibe on 2024/9/12
 * DateTime:2024/09/12 上午10:51
 * Description: 求出最多标记下标
 * Others:给你一个下标从 0 开始的整数数组 nums 。
 * 一开始，所有下标都没有被标记。你可以执行以下操作任意次：
 * 选择两个 互不相同且未标记 的下标 i 和 j ，满足 2 * nums[i] <= nums[j] ，标记下标 i 和 j 。
 * 请你执行上述操作任意次，返回 nums 中最多可以标记的下标数目。
 */

public class Demo002 {
    // 33ms 击败15.27%
//    public int maxNumOfMarkedIndices(int[] nums) {
//        int numsLen = nums.length;
//        Arrays.sort(nums);
//        int l = 0, r = numsLen / 2;
//        while (l < r) {
//            int m = l + r + 1 >> 1;
//            if (check(nums,m)){
//                l = m;
//            }else{
//                r = m - 1;
//            }
//        }
//        return  l * 2;
//    }
//    public boolean check(int nums[],int m){
//        int numsLen = nums.length;
//        for (int i = 0; i < m; i++) {
//            if (nums[i] * 2 > nums[numsLen - m + i]) {
//                return false;
//            }
//        }
//        return true;
//    }
    //28ms
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = n - 1,j =n/2-1;
        int ans = 0;
        for (; j>=0 ; j--) {
            if (2 * nums[j] <= nums[i]) {
                ans++;
                i--;
            }
        }
        return ans * 2;
    }
}
