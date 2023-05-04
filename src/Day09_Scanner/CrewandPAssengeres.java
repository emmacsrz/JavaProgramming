package Day09_Scanner;

public class CrewandPAssengeres {
    public static void main(String[] args) {
        int number = 50;

        String result1 = (number == 50 || number == 75 || number == 100) ?
                (number == 50) ? "20 crew, 30 passengers"
                        : (number == 75) ? "25 crew, 50 passengers"
                        : "30 crew, 50 passengers"

                : "invalid";
        System.out.println(result1);

        System.out.println("------------------------------------------");
        String result2 = " ";

        switch (number) {
            case 50:  //case block must match with the switch statement above.  IE if switch is assigned to integer, case block must also be integer.
                result2 = "20 crew, 30 passengers";
                break;
            case 75:
                result2 = "25 crew, 50 passengers";
                break;
            case 100:
                result2 = "30 crew, 70 passengers";
                break;
            default:
                result2 = "invalid result";
        }

        System.out.println(result2);

        }
    }
