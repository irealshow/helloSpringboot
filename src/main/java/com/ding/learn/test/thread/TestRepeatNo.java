package com.ding.test.thread;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TestRepeatNo {
	
	 /** 订单号生成(NEW) **/
    private static final AtomicInteger SEQ = new AtomicInteger(1000);
    private static final DateTimeFormatter DF_FMT_PREFIX = DateTimeFormatter.ofPattern("yyMMddHHmmssSSS");
    private static ZoneId ZONE_ID = ZoneId.of("Asia/Shanghai");
	
	public static void main(String[] args) {
        final String merchId = "12334";
//        List<String> orderNos = new ArrayList<String>();
        List<String> orderNos = Collections.synchronizedList(new ArrayList<String>());
        IntStream.range(0,1000).parallel().forEach(i->{
//        	orderNos.add(getYYMMDDHHNumber(merchId));
            orderNos.add(generateOrderNo());
        });

        List<String> filterOrderNos = orderNos.stream().distinct().collect(Collectors.toList());

        System.out.println("生成订单数："+orderNos.size());
        System.out.println("过滤重复后订单数："+filterOrderNos.size());
        System.out.println("重复订单数："+(orderNos.size()-filterOrderNos.size()));
    }
	
	
    public static String generateOrderNo(){
        LocalDateTime dataTime = LocalDateTime.now(ZONE_ID);
        if(SEQ.intValue()>9990){
            SEQ.getAndSet(1000);
        }
        return  dataTime.format(DF_FMT_PREFIX)+SEQ.getAndIncrement();
    }




	/**
	    * OD单号生成
	    * 订单号生成规则：OD + yyMMddHHmmssSSS + 5位数(商户ID3位+随机数2位) 22位
	    */
	   public static String getYYMMDDHHNumber(String merchId){
	          StringBuffer orderNo = new StringBuffer(new SimpleDateFormat("yyMMddHHmmssSSS").format(new Date()));
	          if(merchId != null){
	              if(merchId.length()>3){
	                  orderNo.append(merchId.substring(0,3));
	              }else {
	                  orderNo.append(merchId);
	              }
	          }
	          int orderLength = orderNo.toString().length();
	          String randomNum = getRandomByLength(20-orderLength);
	          orderNo.append(randomNum);
	          return orderNo.toString();
	   }


	      /** 生成指定位数的随机数 **/
	      public static String getRandomByLength(int size){
	    	  StringBuffer a = new StringBuffer();
	    	  Random random = new Random();
	    	  for (int i = 0; i < size; i++) {
				a.append(String.valueOf(random.nextInt(10)));
			  }
	    	  return a.toString();
	          /*if(size>8 || size<1){
	              return "";
	          }
	          Random ne = new Random();
	          StringBuffer endNumStr = new StringBuffer("1");
	          StringBuffer staNumStr = new StringBuffer("9");
	          for(int i=1;i<size;i++){
	              endNumStr.append("0");
	              staNumStr.append("0");
	          }
	          int randomNum = ne.nextInt(Integer.valueOf(staNumStr.toString()))+Integer.valueOf(endNumStr.toString());
	          return String.valueOf(randomNum);*/
	      }
}
