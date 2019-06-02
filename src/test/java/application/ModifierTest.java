package application;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModifierTest {
    Modifier modifier = new Modifier();
    String string = "12345";
    String empty = new String();

    @Test
    public void invertString() {
        assertEquals("54321",modifier.invert(string));
    }

    @Test
    public void emptyStringTest(){
        assertEquals("",modifier.invert(empty));
    }
}