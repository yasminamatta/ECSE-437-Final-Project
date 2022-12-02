package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.DecimalFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;

import com.google.common.math.BigIntegerMath;

@SpringBootTest
public class UnitTests {

    @Test
    @DisplayName("Cosine Testing")
    void testCosine() {
        Cosine cosine = new Cosine(30);
        DecimalFormat df = new DecimalFormat("#.########");
        assertEquals(df.format(Math.cos(Math.toRadians(30))), cosine.compute());
    }

    @Test
    @DisplayName("Sine Testing")
    void testSine() {
        Sine sine = new Sine(37);
        DecimalFormat df = new DecimalFormat("#.########");
        assertEquals(df.format(Math.sin(Math.toRadians(37))), sine.compute());
    }

    @Test
    @DisplayName("Factorial Testing")
    void testFactorial() {
        assertEquals(BigIntegerMath.factorial(11).intValue(), Factorial.compute(11));
    }

}