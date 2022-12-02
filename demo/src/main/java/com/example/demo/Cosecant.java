package com.example.demo;

import java.text.DecimalFormat;

public class Cosecant {

    private double n;
    DecimalFormat df = new DecimalFormat("#.######");

    public Cosecant(double n) {
        this.n = n;
    }

    public String compute() {

        Sine sine = new Sine(this.n);
        Double cosecant = 1 / Double.parseDouble(sine.compute());

        return df.format(cosecant);
    }

}