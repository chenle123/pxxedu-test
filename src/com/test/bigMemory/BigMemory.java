package com.test.bigMemory;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName BigMemory
 * @Description TODO
 * @Author bianliang
 * @Date 2020/2/16 14:43
 * @Version 1.0
 */

public class BigMemory {

    public static void main(String[] args){

        Runtime runtime = Runtime.getRuntime();

        System.out.println("内存空间:"+runtime.freeMemory()/1000000);

        List<String> list = new ArrayList<String>(1000000);

        for(int i=0;i<=1000000;i++){
            list.add(new String("test"));
        }

        System.out.println("内存空间:"+runtime.freeMemory()/1000000);

        list = null;
        System.gc();

        System.out.println("内存空间:"+runtime.freeMemory()/1000000);

    }
}
