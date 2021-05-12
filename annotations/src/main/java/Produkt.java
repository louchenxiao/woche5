public class Produkt {

  private final String bezeichnung;
  private final int preis;

  public Produkt(String bezeichnung, int preis) {
    this.bezeichnung = bezeichnung;
    this.preis = preis;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public int getPreis() {
    return preis;
  }
}
