package webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

  /**
   * The most simple view possible, used as a starting point. We take care to
   * ensure that the request maps semantically to a view of `episodes`.
   */
  @RequestMapping(value = "/v1/episodes/")
  public String displayFirst(Model model) {
    Episodes.appendTo(model);
    return "v1";
  }

}
