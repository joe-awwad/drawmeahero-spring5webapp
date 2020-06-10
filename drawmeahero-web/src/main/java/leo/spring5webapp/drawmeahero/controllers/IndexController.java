package leo.spring5webapp.drawmeahero.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "index", "index.html", "index.htm"})
    public String getIndex() {
        return "index";
    }
}
