package com.example.demo;

import java.text.DecimalFormat;

public class Secant {

    private double n;
    DecimalFormat df = new DecimalFormat("#.######");

    public Secant(double n) {
        this.n = n;
    }

    public String compute() {

        Cosine cos = new Cosine(this.n);
        Double secant = 1 / Double.parseDouble(cos.compute());

        return df.format(secant);
    }

}