package kej.spring.movienote;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/default")
    public String layout() {
        return "layout/default-layout";
    }

}
