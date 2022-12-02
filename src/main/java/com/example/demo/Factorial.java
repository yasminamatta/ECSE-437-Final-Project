package com.example.demo;

public class Factorial {

    private int n;

    public Factorial(int n) {
        this.n = n;
    }

    public static int compute(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * compute(n - 1);
        }
    }
}
