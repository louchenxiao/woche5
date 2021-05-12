import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.reflect.Method;
import java.util.List;

public class Customer {

  private final String name;
  private final Long id;
  private final List<Produkt> warenkorb;

  public Customer(String name, Long id, List<Produkt> warenkorb) {
    this.name = name;
    this.id = id;
    this.warenkorb = warenkorb;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "name='" + name + '\'' +
        ", id=" + id +
        '}';
  }

  private int warenkorbWert() {
    return warenkorb.stream().mapToInt(produkt -> produkt.getPreis()).sum();
  }

  public static void main(String[] args) {
    Customer jens = new Customer("Jens", 1L, List.of());
    System.out.println(jens);

  }

}
