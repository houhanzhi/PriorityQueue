package com.datastructure.algorithm.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 来自猩猩的攻城狮hhz
 * @date 2020-06-08 21:48
 */
public class PriorityDemo {
    public static void main(String[] args) {
        test1();
        test2();
    }

    /**
     * PriorityQueue优先级规则可以由我们根据具体需求而定制， 方式有2种：
     * 1>添加元素自身实现了Comparable接口，确保元素是可排序的对象
     * 2>如果添加元素没有实现Comparable接口，可以在创建PriorityQueue队列时直接指定比较器。
     */
    private static void test2() {
        // 通过改造器指定排序规则
        PriorityQueue q = new PriorityQueue<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按分数从升序，分数相等的情况下按名字排序
                if(o1.getCore() == o2.getCore())
                    return o1.getName().compareTo(o2.getName());
                return o1.getCore() - o2.getCore();
            }
        });

        //入列
        q.offer(new Student("dafei", 20));
        q.offer(new Student("will", 17));
        q.offer(new Student("setf", 30));
        q.offer(new Student("bunny", 20));

        //出列
        System.out.println(q.poll());  //Student{name='will', score=17}
        System.out.println(q.poll());  //Student{name='bunny', score=20}
        System.out.println(q.poll());  //Student{name='dafei', score=20}
        System.out.println(q.poll());  //Student{name='setf', score=30}

    }

    /**
     * 默认情况下PriorityQueue使用自然排序法，最小元素先出列。
     */
    private static void test1() {
        PriorityQueue<String> q = new PriorityQueue<>();
        //入列
        q.offer("1");
        q.offer("2");
        q.offer("5");
        q.offer("3");
        q.offer("4");

        //出列
        System.out.println(q.poll());  //1
        System.out.println(q.poll());  //2
        System.out.println(q.poll());  //3
        System.out.println(q.poll());  //4
        System.out.println(q.poll());  //5
    }
}

class Student {
    private String name;

    private Integer core;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCore() {
        return core;
    }

    public void setCore(Integer core) {
        this.core = core;
    }

    public Student(String name, Integer core) {
        this.name = name;
        this.core = core;
    }
}
