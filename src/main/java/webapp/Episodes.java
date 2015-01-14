package webapp;

import java.util.LinkedList;
import java.util.List;

import org.springframework.ui.Model;

/**
 * Collection of episode data entries that may be appended to a model.
 */
public class Episodes {

  private static final List<Episode> episodes = new LinkedList<>();

  static {
    episodes.add(new Episode.One());
    episodes.add(new Episode.Two());
    episodes.add(new Episode.Three());
  }

  public static void appendTo(Model model) {
    model.addAttribute("episodes", episodes);
  }
}
