import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Adressen {

  public static Collection<Person> readCSV(String filename) throws IOException {
    FileReader reader = new FileReader(filename);
    List<CSVRecord> records =
        CSVFormat.EXCEL
            .withDelimiter(',')
            .parse(reader)
            .getRecords();
    return records.stream().map(r -> new Person(r)).collect(Collectors.toList());

  }

  public static void main(String[] args) throws IOException {
    Collection<Person> personen = readCSV("entries.csv");
    Map<String, Long> collect = personen.stream().map(p -> p.getMail()).sorted().map(m -> m.getTopLevelDomain())
        .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    System.out.println("TLD -> Anzahl");
    for (Map.Entry<String, Long> stats : collect.entrySet()) {
      System.out.println(stats.getKey()+" -> "+stats.getValue());
    }
  }




}
