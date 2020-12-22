package com.test.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ThreadTest
 * @Description TODO
 * @Author bianliang
 * @Date 2020/2/14 23:38
 * @Version 1.0
 */

public class ThreadTest {

    static void testList(List list2){
        System.out.println(list2);
        list2.clear();
    }

    public static void main(String[] args){


         List<String> list = new ArrayList<String>(){{
                add("1");
                add("2");
        }};

         List list1 = list;
//         list1 = null;
//         System.out.print(list);
         System.out.println(list1);
//         testList(list);

         System.out.println(list);

        new Thread(()->{

            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("线程一输出");
                }
            });

            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程二输出");
                }
            });

            t2.start();
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Thread t3 = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程三输出");
                }
            });

            t3.start();

        }).start();

        System.out.println("开始进行线程测试");
    }
}
