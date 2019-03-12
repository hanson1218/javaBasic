package com.datastructure;

/**
 * 单向链表
 * @author LiHuaSheng
 *
 */
public class SingleLinkedList {
	private Node head;
	private Node current;

	/**
	 * 向链表加入数据
	 * 
	 * @param data
	 */
	public void add(int data) {
		if (head == null) {// 如果头结点为空，说明这个链表还没有创建，那就把新的结点赋给头结点
			head = new Node(data);
			current = head;
		} else {
			// 创建新的结点，放在当前节点的后面（把新的结点合链表进行关联）
			current.nextNode = new Node(data);
			//把链表的当前索引向后移动一位
			current = current.nextNode;//此步操作完成之后，current结点指向新添加的那个结点
		}
	}

	public void print(Node node) {
		if (node == null) {
			return;
		}
		current = node;
		while (current != null) {
			System.out.println(current.data);
			current = current.nextNode;
		}
	}

	class Node {		//注：内部类访问的特点是：内部类可以直接访问外部类的成员，包括私有；外部类要访问内部类的成员，必须先创建对象。
		int data;
		Node nextNode;

		public Node(int data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		SingleLinkedList linkedList = new SingleLinkedList();
		for (int i = 0; i < 10; i++) {
			linkedList.add(i);
		}
		linkedList.print(linkedList.head);// 从head节点开始遍历输出
	}
}
