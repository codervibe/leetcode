package com.leetcode.day4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by codervibe on 2024/9/12
 * DateTime:2024/09/12 上午11:44
 * Description: 杨辉三角
 * Others:给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行
 */

public class Demo002 {
    // 1ms 击败 96.50%
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listInteger = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> integerList =new ArrayList<Integer>();
            for (int j = 0; j <=i; j++) {
                if (j == 0 || j == i) {
                    integerList.add(1);
                }else {
                    integerList.add(listInteger.get(i - 1).get(j - 1) + listInteger.get(i - 1).get(j));
                }
            }
            listInteger.add(integerList);
        }
        return  listInteger;
    }
}
