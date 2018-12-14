package guru.springframework.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/idex", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}