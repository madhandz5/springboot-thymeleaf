package ryan.jpathymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class MainController {

    @GetMapping(value = "/")
    public String index(Model model) {

        String serverTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:MM:ss"));
        model.addAttribute("serverTime", serverTime);
        return "index";
    }
}
