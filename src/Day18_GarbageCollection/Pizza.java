package Day18_GarbageCollection;

//custom method recap task
public class Pizza {
    public char size;
    public int toppings, pepperoniToppings;

    public double calcCost(char size, int toppings, int pepperoniToppings) {
        double totalPrice = 0.00;
        switch (size) {
            case 's':
            case 'S':
                totalPrice = 10 + 2 * (toppings + pepperoniToppings);
                break;
            case 'm':
            case 'M':
                totalPrice = 12 + 2 * (toppings + pepperoniToppings);
                break;
            case 'l':
            case 'L':
                totalPrice = 14 + 2 * (toppings + pepperoniToppings);
                break;
        }
        return totalPrice;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                ", pepperoniToppings=" + pepperoniToppings +
                '}';
    }

    public static void main(String[] args) {
Pizza pizza1 = new Pizza();
        System.out.println(pizza1.calcCost('m', 2,2));

    }
}
