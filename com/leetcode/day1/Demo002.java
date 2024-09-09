package com.leetcode.day1;

import java.util.*;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 上午7:54
 * Description:49. 字母异位词分组 中等
    给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
    字母异位词 是由重新排列源单词的所有字母得到的一个新单词。
 * Others:
 */

public class Demo002 {
    // 第一种 8ms
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map =new HashMap<>();
//        for (String str : strs) {
//            char[] charArray = str.toCharArray();
//            Arrays.sort(charArray);
//            String key = new String(charArray);
//            List<String> list = map.getOrDefault(key,new ArrayList<String>());
//            list.add(str);
//            map.put(key,list);
//        }
//        return new ArrayList<List<String>>(map.values());
//    }

    // 第二种 7ms
//    public static List<List<String>> groupAnagrams(String[] strs) {
//        Map<String,List<String>> map =new HashMap<>();
//        for (String str : strs) {
//            char[] charArray = str.toCharArray();
//            Arrays.sort(charArray);
//            map.computeIfAbsent(new String(charArray),k->new ArrayList<>()).add(str);
//
//        }
//        return new ArrayList<>(map.values());
//    }
    // 1ms
    public  List<List<String>>  groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String str : strs) {
            String sortStr = encode(str);
            List<String> curList = map.getOrDefault(sortStr, new ArrayList<>());
            curList.add(str);
            map.put(sortStr,curList);

        }
        return new ArrayList<>(map.values());
    }
    private String encode(String str){
        char [] count = new char[26];
        for (char c : str.toCharArray()) {
            int idx = c - 'a';
            count[idx] ++;
        }
        return new String(count);
    }


    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> list = new Demo002().groupAnagrams(str);
        System.out.println("list = " + list);
    }
}
