package application;

import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Modifier {
    public String invert(String string){
        StringBuilder stringBuilder = new StringBuilder();

        IntStream.range(0,string.length()).forEach(index->stringBuilder.append(string.charAt(string.length()-index-1)));
        return stringBuilder.toString();
    }
}
