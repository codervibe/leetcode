package com.leetcode.day1;

/**
 * Created by codervibe on 2024/9/9
 * DateTime:2024/09/09 下午4:58
 * Description: 链表 合并 零之间的 节点
 * Others:
 * 给你一个链表的头节点 head ，该链表包含由 0 分隔开的一连串整数。链表的 开端 和 末尾 的节点都满足 Node.val == 0 。
 * 对于每两个相邻的 0 ，请你将它们之间的所有节点合并成一个节点，其值是所有已合并节点的值之和。然后将所有 0 移除，修改后的链表不应该含有任何 0 。
 * 返回修改后链表的头节点 head 。
 */


public class Demo007 {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public ListNode mergeNodes(ListNode head) {
            ListNode dummy =new ListNode();
            ListNode tail = dummy;
            int total = 0;
            for (ListNode cur = head.next; cur !=null ; cur = cur.next) {
                if (cur.val ==0) {
                    ListNode node =new ListNode(total);
                    tail.next =node;
                    tail = tail.next;
                    total = 0;

                }else {
                   total +=cur.val;
                }
            }
            return  dummy.next;
        }
    }
}
