import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datess {

    public static void main(String[] args) {
        
        // Date CurDate = new Date();
        // System.out.println(CurDate);
        // long milliseconds = CurDate.getTime();
        // System.out.println(milliseconds);
        // String dateString = CurDate.toString();
        // System.out.println(dateString);

        // LocalDate: Local Time (Year, Month,Day(YYYY-MM-DD))
        LocalDate DateLocal = LocalDate.now();
        System.out.println(DateLocal);
        LocalDateTime timedateall = LocalDateTime.now();
        LocalTime TimeLocal = LocalTime.now();
        System.out.println(TimeLocal);
        DateTimeFormatter myFormatTime =  DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM:SS");
        String formattString = timedateall.format(myFormatTime);
        System.out.println(formattString);




    }
}