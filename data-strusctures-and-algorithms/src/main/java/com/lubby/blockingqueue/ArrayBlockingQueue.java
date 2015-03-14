package com.lubby.blockingqueue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @author liubin
 * @version 创建时间：2015年3月14日 下午10:10:01
 * 
 */
public class ArrayBlockingQueue<E> {
	private Object[] item;
	private int size = 5;
	private int length;
	private int putIndex;
	private int takeIndex;
	private Lock lock = new ReentrantLock();
	private Condition notFull = lock.newCondition();
	private Condition notEmpty = lock.newCondition();

	public ArrayBlockingQueue() {
		item = new Object[size];
	}

	public ArrayBlockingQueue(int size) {
		this.size = size;
		item = new Object[size];
	}

	public void put(E e) throws InterruptedException {
		lock.lock();
		try {
			if (length == size ) {
				System.out.println("queue is full.waiting....");
				notFull.await();
			}
			
			item[putIndex] = e;
			
			if (putIndex == size -1) {
				putIndex = 0;
			} else {
				putIndex++;
			}
			
			System.out.println("queue add successful...");
			length++;
			notEmpty.signal();
			
		} finally {
			lock.unlock();
		}

	}

	public E take() throws InterruptedException {
		lock.lock();
		try {
			if (length == 0) {
				System.out.println("queue is empty.waiting..");
				notEmpty.await();
			}

			E result = (E) item[takeIndex];
			
			
			if(takeIndex == size -1){
				takeIndex = 0;
			}else{
				takeIndex ++;
			}
			
//			System.out.println("queue take successful...");
			length --;
			notFull.signal();
			
			return result;
		} finally {
			lock.unlock();
		}
	}

}
