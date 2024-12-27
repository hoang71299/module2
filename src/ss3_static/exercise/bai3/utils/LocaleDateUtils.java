package ss3_static.exercise.bai3.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocaleDateUtils {
    private static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");


    public static LocalDate from_ddMMyyyy(String date) {
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    public static LocalDate from_yyyyMMdd(String date) {
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }
    public static String to_ddMMyyyy(LocalDate date) {
        return date.format(formatter_ddMMyyyy);
    }

    public static String to_yyyyMMdd(LocalDate date) {
        return date.format(formatter_yyyyMMdd);
    }
}
