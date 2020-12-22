package com.test.callback;

/**
 * @ClassName TestCallBack
 * @Description TODO
 * @Author bianliang
 * @Date 2020/3/26 09:35
 * @Version 1.0
 */

public class TestCallBack {

    public static void main(String[] args){
        Test a = new Test();

        a.execute(new CallBack() {
            @Override
            public void callBack() {
                System.out.println("执行回调函数");
            }
        });
    }
}
