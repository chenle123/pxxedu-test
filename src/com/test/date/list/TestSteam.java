package com.test.date.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestSteam
 * @Description TODO
 * @Author bianliang
 * @Date 2020/1/1 17:42
 * @Version 1.0
 */

public class TestSteam {

    public static void main(String[] args){
        List list =  new ArrayList();

        list.stream().forEach(value->{
            System.out.println("ceshi1");
        });
    }
}
