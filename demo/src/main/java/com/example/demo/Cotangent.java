// write cotangent class
package com.example.demo;

import java.text.DecimalFormat;

public class Cotangent {
    private double n;
    static final double PI = 3.14159265359;
    DecimalFormat df = new DecimalFormat("#.#######");

    public Cotangent(int n) {
        this.n = n;
    }

    // create tangent method using taylor series
    public String compute() {
        Cosine cosine = new Cosine(this.n);
        Sine sine = new Sine(this.n);
        Double cotangent = Double.parseDouble(cosine.compute()) / Double.parseDouble(sine.compute());
        return df.format(cotangent);
    }
}