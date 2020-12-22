package com.test.TestInterface;

/**
 * @ClassName Instantiate
 * @Description TODO
 * @Author bianliang
 * @Date 2020/4/10 16:35
 * @Version 1.0
 */

public class Instantiate {

    public static void main(String[] args){

        TestInterface test = new TestInterface() {
            @Override
            public void print() {
                System.out.println("测试匿名内部类");
            }
        };


        test.print();
    }
}
