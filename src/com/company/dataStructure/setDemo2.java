package com.company.dataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @Author Jarrett Luo
 * @Date 2020/12/11 16:25
 * @Version 1.0
 */
public class setDemo2 {

    public static void main(String[] args){
        HashSet hs = new HashSet();
        hs.add(new Person("jack", 20));
        hs.add(new Person("rose", 20));
        hs.add(new Person("hmm", 20));
        hs.add(new Person("lilei", 20));
        hs.add(new Person("jack", 20));

        Iterator it = hs.iterator();
        while (it.hasNext()){
            Object next = it.next();
            System.out.print(next);
        }
    }



    static class Person {

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return getAge() == person.getAge() &&
                    Objects.equals(getName(), person.getName());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
