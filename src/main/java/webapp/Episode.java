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
    private final String title = "I'm Alright";
    private final String description = "As everyone grieves Koko's death, Loggins lashes out at McDonald and \"smooth music\" as a whole, causing a rift between the two. Sleazy entertainment executive Gene Balboa, who is producing the movie Caddyshack demands that the movie's director, Harold Ramis, obtain Loggins' talents to write the movie's theme song. Ramis takes advantage of an angry and confused Loggins and gets him to write and record the hard rock song \"I'm Alright\", much to McDonald's dismay. Featured songs: \"Time Out of Mind\" by Steely Dan; \"How do the Fools Survive\" by The Doobie Brothers; \"Any Way You Want It\" by Journey; \"I'm Alright\" by Kenny Loggins.";
  }

  public static final class Four extends Episode {
    private final int number = 4;
    private final String title = "Rosanna";
    private final String description = "Steve Porcaro (Steve Agee), the keyboard player of the band Toto, is asked by his girlfriend, Rosanna Arquette, to write a song about her, and she wants him to have Michael McDonald sing on the track. Discouraged by McDonald's disdain for his band, Porcaro devises a three-step plan to make it happen. Featured songs: Hold The Line and Rosanna by Toto; Ride Like The Wind by Christopher Cross; \"Don't Fight It\" by Kenny Loggins and Steve Perry";
  }

  public static final class Five extends Episode {
    private final int number = 5;
    private final String title = "Believe in It";
    private final String description = "Toto has been commissioned to write a smooth song for Michael Jackson's Thriller, but Jackson rejects the band, believing after working with Eddie Van Halen on \"Beat It\" that such material is in his past. Fearing that Jackson will destroy \"smooth music\" for a decade, Porcaro turns to McDonald, Loggins, Skunk Baxter, Cross, and Vincent Price (James Adomian), to summon up Koko's ghost for help writing \"Human Nature.\" Featured songs - \"Believe in It\" by Michael McDonald; \"Beat it\" by Michael Jackson; \"Thriller\" by Rod Temperton, performed by Michael Jackson; \"I Gotta Try\" by Kenny Loggins and Michael McDonald (both versions); \"Human Nature\" by Steve Porcaro and John Bettis, performed by Michael Jackson.";
  }

  public static final class Six extends Episode {
    private final int number = 6;
    private final String title = "The Seed Drill";
    private final String description = "\"Hollywood\" Steve's father demands that Steve stop wasting his time on Yacht Rock, and relates a historic tale of the agriculturist Jethro Tull, the plot of which is similar to episode one.";
  }

  public static final class Seven extends Episode {
    private final int number = 7;
    private final String title = "I Keep Forgettin'";
    private final String description = "McDonald and Loggins make a bet about the popularity of McDonald's new song, \"I Keep Forgettin' (Every Time You're Near)\". Ten years later, Long Beach-based rappers Warren G and Nate Dogg struggle with finding a sound within the gangsta rap world. After the two accidentally hit McDonald with their car and then take him back to their house, a solution is found to everyone's problems. Featured songs - \"I Keep Forgettin' (Every Time You're Near)\" by Michael McDonald; \"Swear Your Love\" by Kenny Loggins; \"Let Me Ride\" by Dr. Dre; \"Who Am I? (What's My Name?)\" by Snoop Dogg; \"Regulate\" by Warren G ft Nate Dogg;";
  }

  public static final class Eight extends Episode {
    private final int number = 8;
    private final String title = "Gino (the Manager)";
    private final String description = "\"Hollywood\" Steve returns to the very beginning, where Doobie Brothers producer Ted Templeman (Dan Harmon) explains his dream about the origin of \"the smoothest rock [he's] ever heard\" to Skunk Baxter over lunch. Baxter suggests seeing Koko about it, and Templeman starts seeing his dream become real as he meets a young McDonald, then a background singer for Steely Dan, being talked into joining the Doobie Brothers by Steely Dan and Koko, Loggins showing signs of his imminent break from Messina and solo stardom, and an effeminate Hall and Oates with a very familiar looking manager named Gino, who tries to bully McDonald and Loggins into employing him as a manager. When they refuse, he plots revenge.";
  }

  public static final class Nine extends Episode {
    private final int number = 9;
    private final String title = "Runnin' with the Devil";
    private final String description = "Van Halen puts a curse on Ted Templeman to force him to produce their hard rock song. In a subplot, Loggins loses his car keys and has everyone in the studio helping him look. Comedian Drew Carey makes a cameo appearance along with fellow \"Whose line\" star, Jeff Davis who plays David Lee Roth in this episode.";
  }

  public static final class Ten extends Episode {
    private final int number = 10;
    private final String title = "FM";
    private final String description = "Steely Dan and the Eagles settle a long-time, childish feud with a hit song.";
  }

  public static final class Eleven extends Episode {
    private final int number = 11;
    private final String title = "Footloose";
    private final String description = "Jimmy Buffett is convinced by Kevin Bacon (Jason Lee) and Gene Balboa to trick Loggins into making yet another movie song. He is subsequently kidnapped by Buffett and psychotic \"Parrot Heads\", and it's up to McDonald and James Ingram (Wyatt Cenac) to rescue him.";
  }

  public static final class Twelve extends Episode {
    private final int number = 12;
    private final String title = "Danger Zone";
    private final String description = "As the mid '80s approach, McDonald feels that with the death of Yacht Rock, he has become the irrelevant joke he always feared he would become. Loggins, on the other hand, has grown to love doing movie soundtracks and his career is still in high gear. Extraterrestrial/composer Giorgio Moroder is sent to Earth to seek Loggins' assistance in fighting a black hole that will destroy Moroder's planet. Fearing for his friend's life, McDonald tries to rescue him, and in the process, finds his relevance. By the end of the episode the loose ends of the past 11 episodes are tied together (including the revelation that all of Yacht Rock had been a plan by Koko - to lead to the song Sweet Freedom), but left with a cliff hanger ending as to who murdered Koko.";
  }
}
