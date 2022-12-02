// write a tangent class
package com.example.demo;

import java.text.DecimalFormat;

public class Tangent {
    private double n;
    static final double PI = 3.14159265359;
    DecimalFormat df = new DecimalFormat("#.#######");

    public Tangent(int n) {
        this.n = n;
    }

    // create tangent method using taylor series
    public String compute() {
        Cosine cosine = new Cosine(this.n);
        Sine sine = new Sine(this.n);
        Double tangent = Double.parseDouble(sine.compute()) / Double.parseDouble(cosine.compute());
        return df.format(tangent);
    }

}