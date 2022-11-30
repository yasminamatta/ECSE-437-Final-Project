package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.DecimalFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UnitTests {

    @Test
    @DisplayName("Cosine Testing")
    void testCosine() {
        Cosine cosine = new Cosine(30);
        DecimalFormat df = new DecimalFormat("#.########");
        assertEquals(df.format(Math.cos(Math.toRadians(30))), cosine.compute());
    }
    
}
