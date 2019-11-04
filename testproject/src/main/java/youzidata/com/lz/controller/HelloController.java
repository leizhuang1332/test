package youzidata.com.lz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("helloworld")
    public String helloWorld(){
        return "hello 哈哈哈 3.0 完美自动部署";
    }
}
