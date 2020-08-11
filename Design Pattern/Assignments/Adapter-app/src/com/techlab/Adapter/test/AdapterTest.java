package com.techlab.Adapter.test;

import com.techlab.Adapter.*;

public class AdapterTest {

	public static void main(String[] args) {
		IQueue<Integer> q = new QueueAdapter<Integer>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);

		System.out.println("Count::"+q.count());// 3

		System.out.println("Deleted The Top::"+q.dequeue());
		System.out.println("Deleted The Top::"+q.dequeue());
		System.out.println("Count::"+q.count());// 1

		q.enqueue(20);
		q.enqueue(30);

		System.out.println("Elements::");
		for (int e : q) {
			System.out.println(e);
		}
		
		IQueue<String> q1 = new QueueAdapter<String>();
		q1.enqueue("ABC");
		q1.enqueue("PQR");
		q1.enqueue("XYZ");

		System.out.println("Count::"+q.count());// 3

		System.out.println("Deleted The Top::"+q1.dequeue());
		System.out.println("Deleted The Top::"+q1.dequeue());
		System.out.println("Count::"+q.count());// 1

		q1.enqueue("ABC");
		q1.enqueue("PQR");

		System.out.println("Elements::");
		for (String e : q1) {
			System.out.println(e);
		}
	}
}
