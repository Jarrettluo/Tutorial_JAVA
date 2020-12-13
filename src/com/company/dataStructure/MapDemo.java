package com.company.dataStructure;

import java.util.*;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/13 11:41
 * @Version 1.0
 */
public class MapDemo {

    static int hashMapW = 0;
    static int hashMapR = 0;
    static int linkMapW = 0;
    static int linkMapR = 0;
    static int treeMapW = 0;
    static int treeMapR = 0;
    static int hashTableW = 0;
    static int hashTableR = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MapDemo mp = new MapDemo();
            mp.test(100 * 10000);
            System.out.println();
        }
        System.out.println("hashMapW = " + hashMapW / 10);
        System.out.println("hashMapW = " + hashMapR / 10);
        System.out.println("hashMapW = " + linkMapW / 10);
        System.out.println("hashMapW = " + linkMapR / 10);
        System.out.println("hashMapW = " + treeMapW / 10);
        System.out.println("hashMapW = " + treeMapR / 10);
        System.out.println("hashMapW = " + hashTableW / 10);
        System.out.println("hashMapW = " + hashTableR / 10);

    }

    public void test(int size) {
        int index;
        Random random = new Random();
        String[] key = new String[size];
        // HashMap 插入
        Map<String, String> map = new HashMap<String, String>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        long end = System.currentTimeMillis();
        hashTableW += (end - start);
        System.out.println("HsahMap插入耗时 = " + (end - start) + "ms");

        // HashMap读取
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        hashMapR += (end - start);
        System.out.println("HashMap读取用时：" + (end - start) + "ms");

        // HashMap 读取方式最快的方式
        start = System.currentTimeMillis();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            // System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        end = System.currentTimeMillis();
        System.out.println((end - start));


        //LinkedHashMap 插入
        map = new LinkedHashMap<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        linkMapW += (end - start);
        System.out.println("LinkedMap插入耗时：" + (end - start) + "ms");

        // LinkedHashMap读取
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        linkMapR += (end - start);
        System.out.println("LinkedHashMap读取耗时：" + (end - start) + "ms");

        // TreeMap 插入
        key = new String[size];
        map = new TreeMap<String, String>();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        treeMapW += (end - start);
        System.out.println("TreeMap插入耗时：" + (end - start) + "ms");

        // TreeMap 读取
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            index = random.nextInt(size);
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        treeMapR += (end - start);
        System.out.println("TreeMap读取耗时" + (end - start) + "ms");

        // HashTable 插入
        key = new String[size];
        map = new Hashtable<String, String>();
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            key[i] = UUID.randomUUID().toString();
            map.put(key[i], UUID.randomUUID().toString());
        }
        end = System.currentTimeMillis();
        hashTableW += (end - start);
        System.out.println("HashTable写入耗时：" + (end - start) + "ms");

        // HashTable 读取
        start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            index = random.nextInt();
            map.get(key[index]);
        }
        end = System.currentTimeMillis();
        hashMapR += (end - start);
        System.out.println("HashTable读取耗时：" + (end - start) + "ms");


    }

}
