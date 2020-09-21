package leetcode_class.T06_list;

/**
 * Created by 清风
 * 2020/9/21 17:09
 * 中等
 * 面试题 02.05. 链表求和
 * 给定两个用链表表示的整数，每个节点包含一个数位。
 * 这些数位是反向存放的，也就是个位排在链表首部。
 * 编写函数对这两个整数求和，并用链表形式返回结果。

 * 示例：
 *
 * 输入：(7 -> 1 -> 6) + (5 -> 9 -> 2)，即617 + 295
 * 输出：2 -> 1 -> 9，即912
 *
 * 进阶：假设这些数位是正向存放的，请再做一遍。
 *
 * 示例：
 *
 * 输入：(6 -> 1 -> 7) + (2 -> 9 -> 5)，即617 + 295
 * 输出：9 -> 1 -> 2，即912
 */
public class SM_0205_addTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode p1 = l1, p2 = l2, result = new ListNode(0);
        ListNode p = result;
        int carr = 0;

        while(p1 != null || p2 != null || carr > 0)
        {
            int sum = carr;
            sum += p1 == null ? 0 : p1.val;
            sum += p2 == null ? 0 : p2.val;

            p.next = new ListNode(sum % 10);
            p = p.next;

            carr = sum / 10;

            if(p1 != null)
                p1 = p1.next;
            if(p2 != null)
                p2 = p2.next;
        }

        return result.next;

    }
}
