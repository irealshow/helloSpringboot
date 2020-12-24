package com.ding.learn.test.some;

import java.util.ArrayList;

public class TestSynchronized {
	public static void main(String[] args) {
		final InsertData insertData = new InsertData();
        
        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();
         
         
        new Thread() {
            public void run() {
                insertData.insert(Thread.currentThread());
            };
        }.start();
	}
}


class InsertData {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
     
    public synchronized void  insert(Thread thread){
        for(int i=0;i<5;i++){
//        	try {
//				thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
            System.out.println(thread.getName()+"在插入数据"+i);
            arrayList.add(i);
        }
//        System.out.println(thread.getName() + ":" +arrayList.toString());
    }
}