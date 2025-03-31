import com.opencsv.*;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<String[]> readDataLineByLine(String file) {
        List<String[]> allData = null;
        try (FileReader filereader = new FileReader(file)) {

            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(filereader).withSkipLines(1).withCSVParser(parser).build();
            allData = csvReader.readAll();



        } catch (Exception e) {
            e.printStackTrace();
        }
        return allData;
    }

    public static void main(String[] args) throws ParseException {
        String filePath = new File("").getAbsolutePath();
        filePath = filePath + File.separator + "data.csv";
        System.out.println(filePath);
        List<String[]> data = readDataLineByLine(filePath);
        List<Person> lst = new LinkedList<>();
        for(String[] row : data){
            Person temp = new Person(row);
            System.out.println(temp.toString());
            lst.add(temp);
        }
    }
}