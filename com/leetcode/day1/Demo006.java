package com.leetcode.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 下午4:11
 * Description: 三数之和
 * Others:给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */

public class Demo006 {
    public List<List<Integer>> threeSum(int[] nums) {
        int numLen = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> answer = new ArrayList<>();
        // 枚举 a
        for (int first = 0; first < numLen; ++first) {
            // 需要和上一次枚举的数字不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            int third =numLen -1;
            int target = -nums[first];
            for (int second = first + 1; second < numLen; ++second) {
                // 需要和上一次枚举的数字不相同
                if (second > first + 1 && nums[second] == nums[second -1] ) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second]  + nums[third] > target ) {
                 --third;
                }
                // 如果指针重合，随着 b 后续的增加 就不会为满足 a + b + c = 0
                // 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list= new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    answer.add(list);

                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List<List<Integer>> lists = new Demo006().threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println("list = " + list);
        }

    }
}
