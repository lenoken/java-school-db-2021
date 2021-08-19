package homework.lab4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd%MM%yyyy+hh-mm-ss-a");

    public static LocalDateTime convertStringToDate(String date){
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        return localDateTime;
    }

    public static String convertDateToString(LocalDateTime date) {
        return formatter.format(date);
    }

}
