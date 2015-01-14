package webapp;

/**
 * Data type for episode entries. This is an experiment with types as containers
 * for declared concrete data. Instead of instance creation we implement final,
 * non extensible episode types.
 */
@SuppressWarnings("unused")
public abstract class Episode {

  public static final class One extends Episode {
    private final int number = 1;
    private final String title = "What a Fool Believes";
    private final String description = "In the pilot episode, Kenny Loggins, under the guidance of Koko Goldstein, reaches out to a struggling Michael McDonald, who's having trouble writing a smooth hit for his band the Doobie Brothers. Featured songs - \"Sailing the Wind\" by Loggins and Messina; \"Whenever I Call You Friend\" by Kenny Loggins; \"What a Fool Believes\" by the Doobie Brothers; also featured as incidental music (played at the outset of the episode) is \"Breezin'\" by George Benson.";
  }

  public static final class Two extends Episode {
    private final int number = 2;
    private final String title = "Keep the Fire";
    private final String description = "Loggins and McDonald pair up against the duo Hall & Oates for a songwriting competition. Koko is accidentally impaled by his lucky harpoon during the ensuing melee, but is at peace before his death by hearing the smoothest song ever sung, \"Sailing\", by a young Christopher Cross. Featured songs - \"Portable Radio\" by Hall and Oates; \"This is It,\" \"Keep the Fire\" by Kenny Loggins; \"Sailing\" by Christopher Cross.";
  }

  public static final class Three extends Episode {
    private final int number = 3;
    private final String title = "";
    private final String description = "";
  }
}
