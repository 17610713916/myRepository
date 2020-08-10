package com.mozat.test;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class JstackDie {

    public static Executor executor= Executors.newFixedThreadPool(10);
    public static Object lock=new Object();

    public static void main(String[] args) {
        Task task1=new Task();
        Task task2=new Task();
        executor.execute(task1);
        executor.execute(task2);
        System.out.println("---------------");
    }


    static class Task implements Runnable{
        @Override
        public void run(){
            synchronized (lock){
                try {
                    lock.wait();
                    calculate();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }
        }

        public void calculate(){
            int i=0;
            while (true){
                i++;

            }
        }

    }



}
