package com.test.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ExecutorsTest
 * @Description TODO
 * @Author bianliang
 * @Date 2020/2/15 20:22
 * @Version 1.0
 */

public class ExecutorsTest {

    public static  void listClear(List<String> list){
         list = null;
         System.out.println(list);
    }

    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                List<String> list = new ArrayList<String>(){{

                    add("1");
                    add("2");
                    add("3");
                }};
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程一执行");
                listClear(list);
//                list = null;
                System.out.println(list);
//                throw new IllegalArgumentException("参数异常");


            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程二执行");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程三执行");
            }
        });

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.execute(t3);

        executorService.shutdown();
    }
}
