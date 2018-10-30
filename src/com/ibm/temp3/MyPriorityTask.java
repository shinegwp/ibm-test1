package com.ibm.temp3;

import java.util.concurrent.TimeUnit;

public class MyPriorityTask implements Runnable, Comparable<MyPriorityTask> {
	private int priority;
	private String name;
	public MyPriorityTask(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	public void run() {
		System.out.printf("MyPriorityTask: %s Priority :%d\n", name, priority);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public int compareTo(MyPriorityTask o) {
		if (this.getPriority() < o.getPriority()) {
			return 1;
		}
		if (this.getPriority() > o.getPriority()) {
			return -1;
		}
		System.out.println("wojinxing比较运算了");
		return 0;
	}
	public int getPriority() {
		return priority;
	}
}
