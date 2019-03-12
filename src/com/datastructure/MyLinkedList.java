package com.datastructure;



/**
 * 1.8双向链表
 * @author LiHuaSheng
 *
 */
public class MyLinkedList<E> {
	private int size;
	private Node<E> first;
	private Node<E> last;
	
	public boolean add(E e) {
        linkLast(e);
        return true;
    }
	
	 void linkLast(E e) {
	        final Node<E> l = last;
	        final Node<E> newNode = new Node<>(l, e, null);
	        last = newNode;
	        if (l == null)
	            first = newNode;
	        else
	            l.next = newNode;
	        size++;
	    }
	
	
	 private static class Node<E> {
	        E item;
	        Node<E> next;
	        Node<E> prev;

	        Node(Node<E> prev, E element, Node<E> next) {
	            this.item = element;
	            this.next = next;
	            this.prev = prev;
	        }
	    }
}
