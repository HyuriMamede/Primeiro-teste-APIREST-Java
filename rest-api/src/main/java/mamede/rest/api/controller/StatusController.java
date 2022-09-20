package mamede.rest.api.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    //método para ver se o servido está on
    public String check(){
        return "online";
    }
}
