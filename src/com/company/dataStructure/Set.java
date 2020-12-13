package com.company.dataStructure;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/11 13:44
 * @Version 1.0
 */
public class Set {
    public static void main(String[] args){
        //Set 集合存和取的顺序不一致。
        HashSet hs = new HashSet();
        hs.add("世界军事");
        hs.add("兵器知识");
        hs.add("舰船知识");
        hs.add("汉和防务");
        System.out.println(hs);
        // [舰船知识, 世界军事, 兵器知识, 汉和防务]
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 尝试往hs中添加元素
        Boolean add = hs.add("世界军事");
        System.out.println(add); // false 由于元素重复，所以返回空值。

    }
}
