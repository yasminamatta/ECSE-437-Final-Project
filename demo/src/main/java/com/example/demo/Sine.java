package com.example.demo;

import java.text.DecimalFormat;
import com.example.demo.Cosine;

public class Sine {
    private double n;
    // static final double PI = 3.14159265359;
    DecimalFormat df = new DecimalFormat("#.########");

    public Sine(double n) {
        this.n = n;
    }

    public String compute() {
        // double x = this.n * (PI / 180.0);

        // double res = x;
        // double sign = 1, fact = 1,
        // pow = 1;
        // for (int i = 1; i < 5; i++) {
        // sign = sign * -1;
        // fact = fact * (2 * i) *
        // (2 * i + 1);
        // pow = pow * x * x;
        // res = res + sign * pow / fact;
        // }
        Cosine cosine = new Cosine(this.n);
        Double cos = Double.parseDouble(cosine.compute());
        Double res = Math.sqrt(1 - Math.pow(cos, 2));
        return df.format(res);
    }
}