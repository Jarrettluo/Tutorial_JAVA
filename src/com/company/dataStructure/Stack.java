package com.company.dataStructure;

import javax.xml.soap.Node;
import java.io.Serializable;
import java.util.Stack;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/13 15:27
 * @Version 1.0
 */
public class LinkedStack<T> implements Stack<T>, Serializable {

    private static final long serialVersionUID = 191182930265828353L;

    private Node<T> top;
    private int size;

    public LinkedStack(){
        this.top = new Node<>();
    }


    // 测试
    public static void main(String[] args) {
        LinkedStack<String> sl = new LinkedStack<>();
        sl.push("A");
        sl.push("B");
        sl.push("C");
        int length = sl.size();
        for (int i = 0; i < length; i++) {
            System.out.println("sl.pop->" + sl.pop());
        }
    }
}
