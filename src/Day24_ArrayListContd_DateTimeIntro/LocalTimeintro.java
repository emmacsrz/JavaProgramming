package Day24_ArrayListContd_DateTimeIntro;
import java.time.LocalTime;

public class LocalTimeintro {
    public static void main(String[] args) {

        LocalTime starting_time = LocalTime.of(10, 30); //everytime you use this .of method you will get military time.

        System.out.println(starting_time);

        LocalTime right_now = LocalTime.now();

        System.out.println(right_now);

        System.out.println("------------------------------------------------");

        LocalTime time1 = LocalTime.of(23, 59, 59);

        System.out.println(time1);

        time1 = time1.plusHours(1);

        System.out.println(time1);

        time1 = time1.plusMinutes(45);

        System.out.println(time1);


    }
}
