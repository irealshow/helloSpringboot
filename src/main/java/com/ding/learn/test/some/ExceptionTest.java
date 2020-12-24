package com.ding.learn.test.some;

public class ExceptionTest {
	/*public static void main(String[] args) throws Exception {
		try {
			for (int i = 0; i < 5; i++) {
				int d = 10/0;
				System.out.println(i);
//				getResult();
			}
//			getResult();
//			System.out.println("dsdsd");
			try {
				throw new Exception("获取luban订单列表返回失败");
			} catch (Exception e) {
				throw new Exception(e);
			}
		} catch (Exception e) {
//			System.out.println("log info......................");
			System.out.println(e.getMessage());
//			throw new Exception("test exception");
//			e.printStackTrace();
			// TODO: handle exception
		}
	}*/
	
	public static void main(String[] args) throws Exception {
//		try {
			System.out.println(getException());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("111");
////			e.printStackTrace();
//		}
	}
	
	private static void getResult() throws Exception{
		// TODO Auto-generated method stub'
		System.out.println("OK");
//		try {
			getException();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////			throw e;
//		}
	}

	private static String getException() throws Exception{
//		int a = 1/0;
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i <= 3; i++) {
				try {
					if(i == 1) {
						int b = 1/0;
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
//					System.out.println(" &&&&&&&&&");
					throw new Exception(e);
				}
			}
			return "test ding";
		}catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("1111");
			throw new Exception("test exception");
		} finally {
			System.out.println("$$$$$$$$$$");
		}
	}
}
