package com.test.date.data;

/**
 * @ClassName DataTest
 * @Description TODO
 * @Author bianliang
 * @Date 2020/2/9 20:14
 * @Version 1.0
 */

public class DataTest {

    public static void main(String[] args){


        Person person = Person.builder().name("张三").build();
        System.out.println(person);

        Integer i1 =1;

        long m1 =1;

        int m3 = (int) m1;
        int m2 =1;

        Integer m4 = 1;

        if(i1==m1){
            System.out.println("两个整型数值相等");
        }

        if(i1.equals(m3)){
            System.out.println("m1相等");
        }
        if(i1.equals(m2)){
            System.out.println("m2相等");
        }

        int k = 10;
        int m =3;

        int k1 = (int) Math.ceil((double)k/m);

        System.out.println(k1);
        System.out.println(Math.ceil(3.1));
        int i = 1;
        long j = 1;

        if(i==j){
            System.out.println("两数相等");
        }else{
            System.out.println("两数不想等");
        }
    }
}
