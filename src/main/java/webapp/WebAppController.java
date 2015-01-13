package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class WebAppController {

    @RequestMapping(value = "/")
    public String displayIndexPage(Model model) {

        model.addAttribute("no-server", "");

        return "index";
    }
}
