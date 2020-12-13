package com.company.dataStructure;

import java.util.TreeSet;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/11 16:44
 * @Version 1.0
 */
public class treeSet {

    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add("ccc");
        ts.add("bbb");
        ts.add("ddd");
        ts.add("bbb");

        System.out.println(ts); // [bbb, ccc, ddd]
    }
}
