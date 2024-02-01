package com.example.demojar.demo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonneTest {
    
    @Test
    public void testHello() {
        Personne personne = new Personne();
        assertEquals("Personne", personne.hello());
    }
}
