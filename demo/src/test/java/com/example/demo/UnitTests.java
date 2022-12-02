package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.DecimalFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
    @DisplayName("Tangent Testing")
    void testTangent() {
        Tangent tangent = new Tangent(10);
        DecimalFormat df = new DecimalFormat("#.#######");
        assertEquals(df.format(Math.tan(Math.toRadians(10))), tangent.compute());
    }

    @Test
    @DisplayName("Cotangent Testing")
    void testCotangent() {
        Cotangent cotangent = new Cotangent(20);
        DecimalFormat df = new DecimalFormat("#.#######");
        assertEquals(df.format(1 / Math.tan(Math.toRadians(20))), cotangent.compute());
    }

    @Test
    @DisplayName("Factorial Testing")
    void testFactorial() {
        assertEquals(BigIntegerMath.factorial(11).intValue(), Factorial.compute(11));
    }

    @Test
    @DisplayName("Cosecant Testing")
    void testCosecant() {
        Cosecant cosecant = new Cosecant(20);
        DecimalFormat df = new DecimalFormat("#.######");
        assertEquals(df.format(1 / Math.sin(Math.toRadians(20))), cosecant.compute());
    }
}
