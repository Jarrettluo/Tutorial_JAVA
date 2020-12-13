package com.company.dataStructure;

import javax.swing.*;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/11 17:13
 * @Version 1.0
 */
public class setDemo4 {

    public static void main(String[] args){
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add(new Book("Think in java", 100));
        ts.add(new Book("Java 核心技术", 90));
        ts.add(new Book("Java 就业教程", 89));
        ts.add(new Book("Think in java", 100));
        ts.add(new Book("Think in java", 100));

        System.out.println(ts);
        System.out.println(ts.size());
    }


}

/***
 * 这个是自定义的比较器，大概是先比较价格，如果价格相等的话，就比较名字。
 */
class MyComparator implements Comparator {

    public int compare(Object o1, Object o2){

        Book b1 = (Book) o1;
        Book b2 = (Book) o2;
        System.out.println(b1 + "Comparator" +b2);
        if (b1.getPrice() > b2.getPrice()){
            return 1;
        }
        if (b1.getPrice() < b2.getPrice()){
            return -1;
        }
        return b1.getName().compareTo(b2.getName());
    }
}

class Book {
    private String name;
    private double price;

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}