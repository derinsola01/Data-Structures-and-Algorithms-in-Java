package com.derintester.datastructuresinjava.chapterthree;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SinglyLinkedList<E> {
	
	private static final Logger logger = LogManager.getLogger(SinglyLinkedList.class);
	
	private static class Node<E>{
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
		public E getElement() {
			return element;
		}
		public Node<E> getNext() {
			return next;
		}
		public void setNext(Node<E> n) {
			next = n;
		}
			
	}
	
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public SinglyLinkedList() { }
	
	public int size() { return size; }
	
	public boolean isEmpty() { return size == 0; }
	
	public E first() {
		E firstElement = (isEmpty()) ? null : head.getElement();
		return firstElement;
	}
	
	public E last() {
		E lastElement = (isEmpty()) ? null : head.getElement();
		return lastElement;
	}
	
	public void addFirst(E e) {
		head = new Node<E>(e, head);
		if (size == 0) {
			tail = head;
		}
		size++;
	}
	
	public void addLast(E e) {
		Node<E> newest = new Node<E>(e, null);
		if (isEmpty()) {
			head = newest;
		} else {
			tail.setNext(newest);
		}
		tail = newest;
		size++;
	}
	
	public E removeFirst() {
		if (isEmpty()) {
			return null;
		}
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0) {
			return null;
		}
		return answer;
	}

	public static void main(String[] args) {
		logger.debug("Run your test cases here...");
	}

}
