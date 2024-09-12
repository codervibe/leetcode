package com.leetcode.day4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codervibe on 2024/9/12
 * DateTime:2024/09/12 下午12:00
 * Description: 杨辉三角 2
 * Others:给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * 题解 https://leetcode.cn/problems/pascals-triangle-ii/solutions/18428/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-by--28
 */

public class Demo003 {
    // 1 ms 击败 80.09%
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> cur = null;

        for (int i = 0; i <= rowIndex; i++) {
            cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    cur.add(1);
                } else{
                    cur.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre = cur;
        }
        return  cur;
    }
}
