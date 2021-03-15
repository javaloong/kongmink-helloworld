package demo.helloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloworldController {

    @GetMapping("/helloworld")
    public ResponseEntity<Object> helloworld(){
        return ResponseEntity.ok("Hello World!!!");
    }
}
