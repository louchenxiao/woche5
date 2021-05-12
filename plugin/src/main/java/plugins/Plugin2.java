package plugins;

import spec.Schnittstelle;

public class Plugin2 implements Schnittstelle {


  @Override
  public void execute() {
    System.out.println("Hi, I am a second plugin.");
  }
}
