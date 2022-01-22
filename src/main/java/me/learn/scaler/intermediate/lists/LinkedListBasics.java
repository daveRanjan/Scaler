package me.learn.scaler.intermediate.lists;

import utils.ToStringUtils;

public class LinkedListBasics {

    public static void main(String[] args) {
        LinkedListBasics linkedListBasics = new LinkedListBasics();
//        ToStringUtils.toString(linkedListBasics.solve(new int[][]{{0,1,-1},{1,2,-1}, {2,3,1}}));
//        ToStringUtils.toString(linkedListBasics.solve(new int[][]{{0,1,-1},{1,2,-1}, {2,3,1}, {0,4,-1}, {3,1,-1}, {3,2,-1}}));
        ToStringUtils.toString(linkedListBasics.solve(new int[][]{{0,1,-1},{0,1,-1},{0,1,-1}}));
    }


    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        public String toString(){
            if(this.next != null){
                return String.valueOf(this.val)+"-->"+this.next.toString();
            }else return String.valueOf(this.val)+"-->NULL";
        }
    }
    ListNode node = null;
    ListNode lastNode = null;
    public ListNode solve(int[][] A) {
        int N = A.length;
        int M = A[0].length;
        for (int i = 0; i < N; i++) {
            switch (A[i][0]){
                case 0: addAtFirst(A[i][1]);break;
                case 1: addAtLast(A[i][1]);break;
                case 2: addAtIndex(A[i][1], A[i][2]);break;
                case 3: deleteAtIndex(A[i][1]);break;
            }
        }

        return node;
    }

    public void addAtFirst(int x) {
        if(node == null){
            node = new ListNode(x);
        }else {
            ListNode ln = new ListNode(x);
            ln.next = node;
            node = ln;
        }
    }

    public void addAtLast(int x) {
        if(lastNode != null){
            lastNode.next = new ListNode(x);
            lastNode = lastNode.next;
            return;
        }

        ListNode temp = node;
        while (node.next != null){
            temp = node.next;
        }
        temp.next = new ListNode(x);
        lastNode = temp.next;
    }

    public void addAtIndex(int x, int pos) {
        ListNode temp = node;
        int i = 0;
        while (i < pos-1){
            temp = node.next;
            i++;
        }

        ListNode dangled = temp.next;
        temp.next = new ListNode(x);
        temp.next.next = dangled;
    }

    public void deleteAtIndex(int pos) {
        ListNode temp = node;
        int i = 0;
        while (i < pos-1){
            temp = node.next;
            i++;
        }

        if(temp.next != null){
            if(temp.next.next!= null){
                temp.next = temp.next.next;
            }else {
                temp.next = null;
            }
        }
    }
}
