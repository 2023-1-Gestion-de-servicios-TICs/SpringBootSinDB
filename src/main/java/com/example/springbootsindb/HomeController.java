package com.example.springbootsindb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/","/pagina1"})
    public String main(){
        return "pagina1";
    }

    @GetMapping("/pagina2")
    public String pagina2(){
        return "pagina2";
    }
}
