package com.techlab.Adapter;

import java.util.*;

public class QueueAdapter<T> implements IQueue<T>, Iterable<T> {
	private LinkedList<T> queue;
	
	final int Top = 0;

	public QueueAdapter() {
		this.queue = new LinkedList<T>();
	}

	@Override
	public void enqueue(T item) {
		queue.add(item);
	}

	@Override
	public T dequeue() {
		T temp = queue.get(Top);
		queue.remove(Top);
		return temp;

	}

	@Override
	public int count() {
		return queue.size();

	}

	@Override
	public Iterator<T> iterator() {
		return queue.iterator();
	}

}
