package com.linkedlist;

public class Node <Type extends Comparable<Type>> {
	private Type item;
	private Node<Type> next;
	
	Node(Type item) {
		super();
		this.item = item;
	}

	public Type getItem() {
		return item;
	}

	public void setItem(Type item) {
		this.item = item;
	}

	public Node<Type> getNext() {
		return next;
	}

	public void setNext(Node<Type> next) {
		this.next = next;
	}
	
}
