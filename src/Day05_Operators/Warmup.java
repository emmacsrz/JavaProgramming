package Day05_Operators;

public class Warmup {
    public static void main(String[] args) {
        double hourlyRate = 50;
        double weeklyHours = 45;
        double StateTaxRate = 7; //implicit casting, assigning a int to a double
        double federalTaxRate = 24.5;
        double grossPay=hourlyRate* weeklyHours*52;
        double stateTax = grossPay* StateTaxRate / 100;

        System.out.println("");
        System.out.println("Gross pay is " + grossPay + ". ");
    }
}
