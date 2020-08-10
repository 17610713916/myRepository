package com.mozat.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TestCopyOnArrayList {

    public void test(){
        List<Integer> list= Arrays.asList(new Integer[]{1,2});
        CopyOnWriteArrayList copyList=new CopyOnWriteArrayList(list);

        Executor executor=Executors.newFixedThreadPool(10);

        executor.execute(new ReadThread(copyList));
        executor.execute(new WriteThread(copyList));
        executor.execute(new WriteThread(copyList));
        executor.execute(new WriteThread(copyList));
        executor.execute(new ReadThread(copyList));
        executor.execute(new WriteThread(copyList));
        executor.execute(new ReadThread(copyList));
        executor.execute(new WriteThread(copyList));

        System.out.println("copyListSize"+copyList);
    }


    public static void main(String[] args) {
        new TestCopyOnArrayList().test();
    }

}
