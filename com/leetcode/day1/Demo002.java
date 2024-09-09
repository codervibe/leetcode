package com.leetcode.day1;

import java.util.*;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 上午7:54
 * Description:
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
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map =new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            map.computeIfAbsent(new String(charArray),k->new ArrayList<>()).add(str);

        }
        return new ArrayList<>(map.values());
    }
//    public List<List<String>> groupAnagrams(String[] strs) {
//
//    }


    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(str);
        System.out.println("list = " + list);
    }
}
