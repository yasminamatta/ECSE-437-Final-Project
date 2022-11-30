// write a cosine class
package com.example.demo;

import java.text.DecimalFormat;

public class Cosine {
    private double n;
    static final double PI = 3.14159265359;
    DecimalFormat df = new DecimalFormat("#.########");

    public Cosine(double n) {
        this.n = n;
    }

    public String compute() {
        double x = this.n * (PI / 180.0);

        double res = 1;
        double sign = 1, fact = 1,
                pow = 1;
        for (int i = 1; i < 100; i++) {
            sign = sign * -1;
            fact = fact * (2 * i - 1) *
                    (2 * i);
            pow = pow * x * x;
            res = res + sign * pow / fact;
        }

        return df.format(res);
    }
}
