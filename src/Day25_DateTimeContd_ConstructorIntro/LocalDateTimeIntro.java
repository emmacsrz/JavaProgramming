package Day25_DateTimeContd_ConstructorIntro;

import java.time.LocalDateTime;

public class LocalDateTimeIntro {
    public static void main(String[] args) {

        LocalDateTime starts = LocalDateTime.now(); //returns both todays date AND time automatically. (at the exact time the program is run)

        System.out.println(starts);


        LocalDateTime ends = LocalDateTime.of(2023, 4, 12, 11, 30, 00);
        System.out.println(ends);


        System.out.println(starts.getDayOfWeek());
        System.out.println(ends.getDayOfWeek());
    }
}
