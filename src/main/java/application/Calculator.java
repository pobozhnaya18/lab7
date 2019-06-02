package application;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.NoSuchElementException;

@Component
public class Calculator {
    public double calculateAverage(Collection<Integer> collection) throws NoSuchElementException {
        return collection.stream().reduce((sum, value) -> sum + value).get() / collection.size();
    }
}
