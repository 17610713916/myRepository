package com.mozat.test;

public class OneToN {
    public static void main(String[] args) {
        OneToN n = new OneToN();
        int a = n.sumNums(9);
        System.out.println(a);
    }

    public int sumNums(int n) {
        return n == 0 ? 0 : n + sumNums(n - 1);
    }
}
