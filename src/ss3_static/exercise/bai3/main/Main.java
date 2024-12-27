package ss3_static.exercise.bai3.main;

import ss3_static.exercise.bai3.utils.LocaleDateUtils;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String date = "01/01/2021";
        String date2 = "2022/01/01";

        LocalDate localDate1 = LocaleDateUtils.from_ddMMyyyy(date);
        LocalDate localDate2 = LocaleDateUtils.from_yyyyMMdd(date2);

        System.out.println(localDate1);
        System.out.println( localDate2);


        LocalDate localDate3 = LocalDate.now();

        System.out.println(LocaleDateUtils.to_ddMMyyyy(localDate3));
        System.out.println(LocaleDateUtils.to_yyyyMMdd(localDate3));
    }
}
