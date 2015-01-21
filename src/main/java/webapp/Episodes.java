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
    episodes.add(new Episode.Four());
    episodes.add(new Episode.Five());
    episodes.add(new Episode.Six());
    episodes.add(new Episode.Seven());
    episodes.add(new Episode.Eight());
    episodes.add(new Episode.Nine());
    episodes.add(new Episode.Ten());
    episodes.add(new Episode.Eleven());
    episodes.add(new Episode.Twelve());
  }

  public static void appendTo(Model model) {
    model.addAttribute("episodes", episodes);
  }

  public static void appendToByNumber(int number, Model model) {
    int index = number - 1;
    model.addAttribute("episode", episodes.get(index));
  }
}
