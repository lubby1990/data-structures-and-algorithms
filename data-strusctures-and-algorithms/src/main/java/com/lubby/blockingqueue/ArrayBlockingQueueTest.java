package com.lubby.blockingqueue;

/**
 * 
 * @author liubin
 * @version 创建时间：2015年3月14日 下午10:25:23
 * 
 */
public class ArrayBlockingQueueTest {
	static ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>();

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			new Thread(new Runnable() {
				public void run() {
					try {
						arrayBlockingQueue.put(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}

		for (int j = 0; j < 100; j++) {

			new Thread(new Runnable() {
				public void run() {
					try {
						arrayBlockingQueue.take();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
		}
	}

}
