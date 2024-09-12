package com.leetcode.day4;


import java.util.Arrays;

/**
 * Created by codervibe on 2024/9/12
 * DateTime:2024/09/12 上午11:34
 * Description: 将有序数组转为二叉树
 * Others:给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵
 * 平衡二叉搜索树。
 */

public class Demo001 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length==0) {
                return null;
            }
            int mid = nums.length/2;
            TreeNode treeNode =new TreeNode(nums[mid]);
            treeNode.left = sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
            treeNode.right = sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,nums.length));
            return treeNode;
        }

    }
