package com.leetcode.day2;

/**
 * Created by codervibe on 2024/9/10
 * DateTime:2024/09/10 上午7:33
 * Description: 统计上升四元组
 * Others:给你一个长度为 n 下标从 0 开始的整数数组 nums ，它包含 1 到 n 的所有数字，请你返回上升四元组的数目。
 * 如果一个四元组 (i, j, k, l) 满足以下条件，我们称它是上升的：
 */

public class Demo001 {
    //    public long countQuadruplets(int[] nums) {
//        int n = nums.length;
//        int great[][] = new int[n][n + 1];
//        for (int k = n - 2; k >= 2; k--) {
//            great[k] = great[k + 1].clone();
//            for (int x = 1; x < nums[k + 1]; x++) {
//                great[k][x]++;
//            }
//        }
//        long ans = 0;
//        int less[] = new int[n + 1];
//        for (int j = 1; j < n - 2; j++) {
//            for (int x = nums[j - 1] + 1; x <= n; x++) {
//                less[x]++;
//            }
//            for (int k = j + 1; k < n - 1; k++) {
//                if (nums[j] > nums[k]) {
//                    ans += less[nums[k]] * great[k][nums[j]];
//                }
//            }
//        }
//
//        return ans;
//    }
//    public long countQuadruplets(int[] nums) {
////        int n =nums.length;
//        long dp [] =new long[nums.length];
//        dp[1] = (nums[0] < nums[2] && nums[1] > nums[2])?1:0;
//        long ans=0l;
//        for (int i = 3; i < nums.length; i++) {
//            int cnt=0;
//            for (int j = 0; j < i; j++) {
//                if (nums[j] < nums[i]) {
//                    ans += dp[j];
//                    cnt ++;
//                }else{
//                    dp[j] +=cnt;
//                }
//            }
//        }
//        return ans;
//    }
    //54ms
    public long countQuadruplets(int[] nums) {
        int n = nums.length;
        long cnt3[] = new long[n];
        long cnt4 = 0;
        for (int i = 2; i < n; i++) {
            int cnt2 = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i]) {
                    cnt3[j] += cnt2;
                } else {
                    cnt4 += cnt3[j];
                    cnt2++;
                }
            }
        }
        return cnt4;
    }

}
