package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CalculatorService {
    @Autowired
    Calculator calculator;

    @GetMapping(path = "calculate-average",
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public double asd(@RequestBody List<Integer> list){
        return calculator.calculateAverage(list);
    }
}
