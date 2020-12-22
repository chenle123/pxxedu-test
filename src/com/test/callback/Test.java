package com.test.callback;

/**
 * @ClassName Test
 * @Description TODO
 * @Author bianliang
 * @Date 2020/3/26 09:37
 * @Version 1.0
 */

public class Test {

    public void execute(CallBack callBack){
        System.out.println("do something before...");

        callBack.callBack();

        System.out.println("do something after...");
    }
}
