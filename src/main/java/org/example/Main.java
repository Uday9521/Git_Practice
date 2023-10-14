package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, -1, 10, -1, -1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2,1,3));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 0));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 5));

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(list1);
//        list.add(list2);
//        list.add(list3);
        TreeNode node = new TreeNode(10);
        node.left = new TreeNode(15);
        node.right = new TreeNode(20);

//        System.out.println(sol.isSymmetric(node.right));
//        System.out.println(3*1000000000 - Integer.MAX_VALUE);



/*        List<Integer> list = new ArrayList<>(Arrays.asList(1, 4, 3, 2,5));
        ListNode head = null, curr = null;
        for (Integer ele : list) {
            ListNode n = new ListNode(ele);
            if (head == null) {
                head = n;
                curr = n;
            } else {
                curr.next = n;
                curr = n;
            }
        }
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1));
        ListNode head2 = null;
        curr = null;
        for (Integer ele : list2) {
            ListNode n = new ListNode(ele);
            if (head2 == null) {
                head2 = n;
                curr = n;
            } else {
                curr.next = n;
                curr = n;
            }
        }
        sol.partition(head,10);*/
//        System.out.println(sol.solve(new ArrayList<>(Arrays.asList(2, 5, -1, 7, -3, -1, -2)),4));

//        System.out.println(sol.solve(new ArrayList<>(Arrays.asList(994390,986616,976849,979707,950477,968402,992171,937674,933065,960863,980981,937319,951236,959547,991052,991799,992213,941294,978103,997198,960759,988476,963517,980366,921767,979757,977912,983761,981869,947454,930202,999086,973538,999798,996446,944001,974217,951595,942688,975075,970973,970130,897109,927660,862233,997130,986068,954098,978175,889682,988973,996036,969675,985751,977724,881538,988613,924230,906475,915565,986952,975702,994316,964011,986848,983699,949076,989673,981788,929094,988310,926471,994763,999736,980762,973560,996622,934475,998365,966255,998697,998700,911868,983245,996382,996992,953142,994104,987303,853837,960626,904203,998063,977596,977868,996012,996298))));

//                System.out.println(sol.solve("abcabc"));

    }

}
