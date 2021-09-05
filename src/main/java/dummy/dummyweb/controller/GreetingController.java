package dummy.dummyweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dummy.dummyweb.model.Greeting;

@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String getGreeting(Model model) {
        model.addAttribute("greeting", new Greeting()); // TODO Remove hardcoded attribute name
        return "greeting"; // TODO Remove hardcoded view name
    }

    @PostMapping
    public String postGreeting(Model model,
            @ModelAttribute Greeting greeting /* Must match with model attribute name by default */) {
        model.addAttribute("greeting", greeting); // TODO Remove hardcoded attribute name
        return "greeting"; // TODO Remove hardcoded view name
    }

}
