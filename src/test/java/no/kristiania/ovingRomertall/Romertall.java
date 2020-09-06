package no.kristiania.ovingRomertall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Romertall {
    @Test
    void shouldConvert1toI(){
        assertEquals("I", new convertNumbers().toRoman(1));
    }
    @Test
    void shouldConvert2toII(){
        assertEquals("II", new convertNumbers().toRoman(2));
    }
     @Test
    void shouldConvert4toIV(){
        assertEquals("IV", new convertNumbers().toRoman(4));
    }
    @Test
    void shouldConvert7toVII(){
        assertEquals("VII", new convertNumbers().toRoman(7));
    }
    @Test
    void shouldConvert14toXIV(){
        assertEquals("XIV", new convertNumbers().toRoman(14));
    }

    @Test
    void shouldConvert37toXXXVII(){
        assertEquals("XXXVII", new convertNumbers().toRoman(37));
    }
    @Test
    void shouldConvert70toVXX(){
        assertEquals("LXX", new convertNumbers().toRoman(70));
    }
    @Test
    void shouldConvert73toVXX(){
        assertEquals("LXXIII", new convertNumbers().toRoman(73));
    }


}
