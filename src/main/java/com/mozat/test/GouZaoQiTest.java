package com.mozat.test;

public class GouZaoQiTest {

    public int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  GouZaoQiTest(String name ){
        System.out.println("我的名字是："+name);
    }

    public static void main(String[] args) {
        GouZaoQiTest gzq=new GouZaoQiTest("haowenquan");
        gzq.setAge(1);
        System.out.println(gzq.getAge());
        System.out.println(gzq.age);

    }

}
