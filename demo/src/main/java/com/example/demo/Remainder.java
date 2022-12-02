// write a remainder class
package com.example.demo;

import java.text.DecimalFormat;

public class Remainder {

    private int dividend;
    private int divisor;
    DecimalFormat df = new DecimalFormat("#.########");

    public Remainder(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    public String compute() {

        int remainder = dividend % divisor;

        return df.format(remainder);
    }

}
