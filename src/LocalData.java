import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalData {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("y MMMM");

        System.out.println(today.format(df));//add to project
    }

    //dont forget to work on hashmap profit changes

}
