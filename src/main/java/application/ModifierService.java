package application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifierService {
    @Autowired
    Modifier modifier;

    @GetMapping(path = "invert-string/{string}")
    public String invertString(@PathVariable("string") String string){
        return modifier.invert(string);
    }
}
