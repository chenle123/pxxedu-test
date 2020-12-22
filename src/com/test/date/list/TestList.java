package com.test.date.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName TestList
 * @Description TODO
 * @Author bianliang
 * @Date 2019/12/29 16:57
 * @Version 1.0
 */

public class TestList {

    public static void main(String[] args){

        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);

        List list2 = new ArrayList();
        list2.add(2);
        list2.add(3);

        list2.removeAll(list1);

//        list1.stream().filter(num->!list2.contains(num)).collect(Collectors.toList());
//        list2.stream().filter(num->!list1.contains(num)).collect(Collectors.toList());

        System.out.println("");

    }
}
