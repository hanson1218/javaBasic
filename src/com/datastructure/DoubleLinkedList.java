package com.datastructure;

import java.util.LinkedList;

public class DoubleLinkedList<T> {
	private int size;
	private  Node<T> head = new Node<T>(null, null, null);//整个链表其实就只有header一个节点，用于表示一个空的链表
	
	public DoubleLinkedList() {
		head.prev=head.next=head;
	}

	public int getSize() {
		return size;
	}

	/**
	 * 1.6
	 * @param t
	 */
	public void add(T t) {
		addBefore(t, head);
	}
	
	/**
	 * 每次都在末尾添加，新元素的prev是上次head的prev，也就是变化前的末尾元素；新元素的next永远是head
	 * @param t
	 * @param node
	 */
	private void addBefore(T t,Node<T> node){
		Node<T> newNode = new Node<T>(t,node.prev,node);
		newNode.prev.next = newNode;
		newNode.next.prev = newNode;
		size++;
	}

	class Node<T> {
		private T value;
		private Node<T> prev;
		private Node<T> next;

		public Node(T value, Node<T> prev, Node<T> next) {
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		DoubleLinkedList doubleLinkedList = new DoubleLinkedList<Integer>();
		doubleLinkedList.add(1);
		doubleLinkedList.add(2);
		System.out.println(doubleLinkedList.getSize());
		
	}
}
