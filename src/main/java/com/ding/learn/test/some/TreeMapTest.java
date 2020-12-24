package com.ding.learn.test.some;

public class TreeMapTest {
    /*public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>(
                *//*new Comparator<String>() {
                    public int compare(String obj1, String obj2) {
                        // 降序排序
                        return obj2.compareTo(obj1);
                    }
                }*//*
                );
        map.put("b", "ccccc");
        map.put("d", "aaaaa");
        map.put("c", "bbbbb");
        map.put("a", "ddddd");

        System.out.println(map);
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            System.out.println(key + ":" + map.get(key));
        }
    }*/

    public static void main(String[] args) {
        /*Myrun myrun = new Myrun();
        for (int i=0;i<3;i++) {
            Thread thread = new Thread(myrun);
            thread.run();
        }*/
        testRepeat(4);
    }

    public static void testRepeat(int i) {
        if(i<=2) {
//            return;
            System.out.println("+++");
        } else {
            i--;
            testRepeat(i);
        }
        System.out.println(i+"========");
    }

    static class Myrun implements Runnable {
        private int taskCount = 0;
        private final int tid = taskCount++;
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+":"+tid);
        }
    }

}
