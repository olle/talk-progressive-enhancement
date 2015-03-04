package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Our main controller (dispatcher) providing a default start for default
 * requests and a set of demo `steps` to show the progress of work.
 */
@Controller
public class WebAppController {

  @RequestMapping(value = "/")
  public String displayDefault(Model model) {
    return "redirect:/v1/episodes/";
  }

  @RequestMapping(value = "/{version}/episodes/")
  public String displayEpisodes(@PathVariable String version, Model model) {
    Episodes.appendTo(model);
    return version + "/episodes";
  }

  @RequestMapping(value = { "/{version}/episodes/{number}", "/{version}/episodes/{number}/" })
  public String displayEpisode(@PathVariable String version, @PathVariable int number, Model model) {
    Episodes.appendToByNumber(number, model);
    return version + "/episode";
  }

}
