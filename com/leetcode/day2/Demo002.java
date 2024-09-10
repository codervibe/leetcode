package com.leetcode.day2;

/**
 * Created by codervibe on 2024/9/10
 * DateTime:2024/09/10 上午11:57
 * Description: 移除元素
 * Others:给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
 * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
 * 返回 k。
 */

public class Demo002 {
//        public int removeElement(int[] nums, int val) {
//        int k=0;
//        int numLen = nums.length;
//        for (int i = 0; i < numLen; i++) {
//            if (nums[i] !=val ){
//                nums[k] = nums[i];
//                k++;
//            }
//        }
//        return k;
//    }
    public int removeElement(int[] nums, int val) {

        int numLen = nums.length;
        int tmp;
        for (int i = 0; i < numLen; ) {
            if (nums[i] == val) {
                tmp = nums[i];

                nums[i] = nums[numLen - 1];
                nums[numLen - 1] = tmp;
                numLen--;
            } else {
                i++;
            }
        }
        return numLen;

    }
}
