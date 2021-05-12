package plugins;

import spec.Schnittstelle;

public class Plugin1 implements Schnittstelle {
  @Override
  public void execute() {
    System.out.println("Hallo, ich bin Plugin 1");
  }
}
