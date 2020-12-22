package com.ding.test.thread;

import java.util.concurrent.*;

/**
 * 测试方法的超时时间
 */
public class FutureTest {
	
	public static void main(String[] args) {
		try {
			functionTimeoutTest2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("1211");
			e.printStackTrace();
		}
	}
	
	
    public static  void functionTimeoutTest2() throws  Exception{
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        Future<String> future=executorService.submit(()->
            {
                Thread.sleep(4000);
                return "success";
            }
        );

        try{
            String result=future.get(3,TimeUnit.SECONDS);
            //String result=future.get(50,TimeUnit.SECONDS);
            System.out.println("result:"+result);
        }
        catch (TimeoutException e){
            System.out.println("超时了!");
        }
    }
}
