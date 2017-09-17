package ${package}.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/secured")
    @Secured("ROLE_USER")
    public ModelAndView securedIndex(Principal principal) {
        String userId = null;
        if (principal != null) {
            userId = principal.getName();
        }

        return new ModelAndView("secured/index", "userId", userId);
    }
}
