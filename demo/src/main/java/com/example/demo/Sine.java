package com.example.demo;

import java.text.DecimalFormat;

public class Sine {
    private double n;
    DecimalFormat df = new DecimalFormat("#.########");

    public Sine(double n) {
        this.n = n;
    }

    public String compute() {
        Cosine cosine = new Cosine(this.n);
        Double cos = Double.parseDouble(cosine.compute());
        Double res = Math.sqrt(1 - Math.pow(cos, 2));
        return df.format(res);
    }
}