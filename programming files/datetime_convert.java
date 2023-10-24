import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        // Creating date string
        String dateStr = "2022-03-17 10:45:30";

        // Creating DateTimeFormatter object to set date time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Parsing the date string to convert to a LocalDateTime object
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);

        // Creating a String out of the LocalDateTime object
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        // Printing formatted date
        System.out.println(formattedDate);
    }
}
