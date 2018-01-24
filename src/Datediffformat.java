import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class Datediffformat {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("MM/dd/yyyy").format(today));
    }
}
