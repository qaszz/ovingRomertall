package no.kristiania.ovingRomertall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Romertall {
    @Test
    void shouldConvert1toI(){
        assertEquals("I", new convertNumbers().toRoman(1));
    }

}
