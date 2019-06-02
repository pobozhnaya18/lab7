package application;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Collection<Integer> collection = new ArrayList<>();
    private Calculator calculator = new Calculator();
    @Before
    public void setCollection(){
        collection.add(1);
        collection.add(2);
        collection.add(3);
    }
    @org.junit.Test
    public void calculateAverage() {
        assertEquals(2,calculator.calculateAverage(collection),0.01);
    }

    @Test(expected = NoSuchElementException.class)
    public void emptyCollectionTest(){
        calculator.calculateAverage(new ArrayList<>());
    }
}