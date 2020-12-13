package com.company.dataStructure;


import java.util.Objects;
import java.util.TreeSet;

/**
 * 元素需要实现Comparable 接口，覆盖compareto方法
 * @Author Jarrett Luo
 * @Date 2020/12/11 16:52
 * @Version 1.0
 */
public class setDemo3 {

    public static void main(String[] args){
        TreeSet ts = new TreeSet();
        ts.add(new Person("aa", 20, "男"));
        ts.add(new Person("bb", 18, "女"));
        ts.add(new Person("cc", 17, "男"));
        ts.add(new Person("dd", 18, "女"));
        ts.add(new Person("ee", 15, "女"));
        ts.add(new Person("ee", 15, "女"));

        System.out.println(ts);
        System.out.println(ts.size());
    }

    static class Person implements Comparable {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public boolean equals(Object o) {
            System.err.println(this+"equals:" + o);
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return getAge() == person.getAge() &&
                    Objects.equals(getName(), person.getName()) &&
                    Objects.equals(getGender(), person.getGender());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge(), getGender());
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Object obj) {
            Person p = (Person) obj;
            System.out.println(this + "compareTo" + p);
            if (this.age > p.age){
                return 1;
            }
            if (this.age < p.age){
                return -1;
            }
            return this.name.compareTo(p.name);
        }
    }
}
