package Day24_ArrayListContd_DateTimeIntro;


import java.time.LocalDate;

public class LocalDateIntro {
    public static void main(String[] args) {

        System.out.println("------------today's date example: ---------------");
//today's date example:
        LocalDate today = LocalDate.now(); //this variable;s name is "today", will return the localdate object of the current date.
        System.out.println(today);
        //everytime you run the .now method, it will get the present date.  If you want a SPECIFIC immutable date stored to a variable, use the .of method (below)


        System.out.println("------------date example: ---------------");
//birthday example:
        LocalDate myBirthday = LocalDate.of(1993, 6, 14);
        System.out.println(myBirthday); //  all must be provided as numbers, not string.  you will get an invalid date exception if you provide a date that is not valid, such as november 31st (there is only 30 days in november).  The system knows all of these, and leap years. So be careful when checking quizzes and such for trick questions regarding this.

        System.out.println("------------get year method: ---------------");
//getYear method:
        //you take an already assigned local date object, such as the one above, myBirthday;
        System.out.println(myBirthday.getYear());

        System.out.println("------------get month/days/etc methods (See notes): ---------------");
        System.out.println(myBirthday.getMonth());

/*
.getDayOfWeek() -Returns monday, tuesday, wednesday, etc
.getDayOfMonth() -returns days 1-31 based off of month
.getDayOfYear() - returns days 1-365
 */
        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfYear());
        System.out.println("i was bon on a: " + myBirthday.getDayOfWeek());

        //plus  years method:

        System.out.println( today.plusYears(1));  // adds 1 year to today's date, does not CHANGE today's date.
        System.out.println( today.plusYears(1).getDayOfWeek()); // returns what day of the week it will be on todays date 1 year from now.

        LocalDate birthday = LocalDate.of(1993, 6, 14);

        birthday = birthday.minusYears(2).minusDays(2);
        System.out.println(birthday);

        System.out.println( today.getYear() );

        System.out.println(today.getMonth());

        System.out.println(today.getMonthValue());

        System.out.println(today.getDayOfWeek());

        System.out.println(birthday.getDayOfWeek());


        System.out.println(today.getDayOfMonth());

        System.out.println(today.getDayOfYear());

        System.out.println("-------------------------------------------------");

        today =  today.plusYears(1); // 2023-6-16

        System.out.println(today);

        System.out.println("-------------------------------------------------");

        LocalDate graduationDate = LocalDate.of(2025, 6, 4);

        graduationDate = graduationDate.plusYears(2); // 2027-6-4

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusMonths(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusWeeks(7);

        System.out.println(graduationDate);

        graduationDate = graduationDate.plusDays(100);

        System.out.println(graduationDate);

        System.out.println("--------------------------------------------");

        LocalDate yourBirthDay = LocalDate.of(2005, 4, 1);
        LocalDate yourBrotherBirthDay = yourBirthDay.minusYears(2).minusMonths(3);

        System.out.println(yourBirthDay);
        System.out.println(yourBrotherBirthDay);

        System.out.println("--------------------------------------------");

        LocalDate birthday1 = LocalDate.of(1994, 7, 7);
        LocalDate birthday2 = LocalDate.of(1994, 7, 7);

        boolean r1 = birthday1.isEqual(birthday2);

        System.out.println(r1);


        System.out.println("--------------------------------------------");

        LocalDate grad_date = LocalDate.of(2023, 1, 1);

        System.out.println(  grad_date.isBefore(  LocalDate.of(2022, 12, 31) ));
        System.out.println(  grad_date.isAfter(  LocalDate.of(2022, 12, 31) ));

        System.out.println("----------------------------------------------");

        System.out.println(  LocalDate.of(2022, 6, 16).isLeapYear()  );






    }
}
