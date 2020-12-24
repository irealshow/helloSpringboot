package com.ding.learn.test.some;

import com.ding.test.impl.IOpenDoor;

public class ThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			}
		}).start();
		/*new Thread(()-> {
			System.out.println(Thread.currentThread().getName());
		}).start();
		new Thread(()-> {
			System.out.println(Thread.currentThread().getName());
		}).start();*/
		MyThread myThread = new MyThread();
		myThread.run();
		
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();

		Runnable runnable = new Runnable() {
			@Override
			public void run() {

			}
		};

		IOpenDoor door = (n) -> {
			System.out.println("2323");
			return;
		};

		new IOpenDoor() {
			@Override
			public void close(String name) {
				System.out.println("2323");
			}
		};
	}
	
}

class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("AAA"+Thread.currentThread().getName());
	}
	
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("BBB"+Thread.currentThread().getName());
	}
	
}

class mydoor implements IOpenDoor {

	@Override
	public void close(String name) {
	}
}