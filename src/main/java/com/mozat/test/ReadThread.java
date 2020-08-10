package com.mozat.test;

import java.util.List;

public class ReadThread implements Runnable{

    private List<Integer> list;

    public ReadThread(List<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        for(Integer el:list){
            System.out.println("ReadThread" +el);
        }
    }
}
