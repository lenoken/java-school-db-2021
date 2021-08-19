package homework.lab4;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        String dateString = "19%08%2021+11-14-14-PM";
        LocalDateTime localDateTime = DateUtils.convertStringToDate(dateString);
        System.out.println(localDateTime);
        System.out.println(DateUtils.convertDateToString(localDateTime));
    }
}
