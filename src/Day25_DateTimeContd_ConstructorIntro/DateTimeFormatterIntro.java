package Day25_DateTimeContd_ConstructorIntro;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("E MMMM d, y"); //calling .ofpattern method will ask you the pattern of how you would like to format the local date or local time. This is where you put your global symbols.
        //  the "df" variable name just stands for date formatter and is commonly used.

        
        LocalDate today = LocalDate.now();

        System.out.println(today.format(df));



        DateTimeFormatter tf  = DateTimeFormatter.ofPattern("hh:mm a");

        LocalTime time1 = LocalTime.of(17, 30);

        System.out.println( time1.format(tf) ); //07:05


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, MMM/dd/y  hh:mm a");

        LocalDateTime starts = LocalDateTime.now();

        System.out.println(starts.format(dtf));
    }
}
