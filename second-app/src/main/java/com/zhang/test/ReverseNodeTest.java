package com.zhang.test;

public class ReverseNodeTest {
    public static void main(String[] args) {
        MyNode node = ready();

        MyNode newNode = reverseNode(node);

        System.out.println(newNode);
    }

    public static MyNode reverseNode(MyNode node) {
        if (node == null || node.next == null) {
            return node;
        } else {
            MyNode headNode = reverseNode(node.next);
            node.next.next = node;
            node.next = null;
            return headNode;
        }

    }

    public static MyNode ready() {
        MyNode node1 = new MyNode();
        node1.value = 1;
        MyNode node2 = new MyNode();
        node2.value = 2;
        MyNode node3 = new MyNode();
        node3.value = 3;
        MyNode node4 = new MyNode();
        node4.value = 4;
        MyNode node5 = new MyNode();
        node5.value = 5;
        MyNode node6 = new MyNode();
        node6.value = 6;
        MyNode node7 = new MyNode();
        node7.value = 7;
        MyNode node8 = new MyNode();
        node8.value = 8;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        return node1;
    }
}
