package application;

import java.util.Scanner;
import spec.Schnittstelle;

public class Runner {

  private Scanner in = new Scanner(System.in);

  public void run() throws Exception {

    String line = "";
    do {
      System.out.println("Welches Plugin soll benutzt werden?");
      line = in.nextLine();
    } while (runPlugin(line));
  }


  // ACHTUNG! Das ist keine adäquate Fehlerbehandlung!
  private boolean runPlugin(String line) throws Exception {
    if (line.isBlank()) {
      return false;
    }
    Class<Schnittstelle> c = (Class<Schnittstelle>) Class.forName(line);
    Schnittstelle plugin = c.getDeclaredConstructor().newInstance();
    plugin.execute();
    return true;
  }

  public static void main(String[] args) throws Exception {
    new Runner().run();
  }
}
