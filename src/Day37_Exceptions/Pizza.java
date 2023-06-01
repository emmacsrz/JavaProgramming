package Day37_Exceptions;

public class Pizza{
    private char size;
        private int numberOfCheeseTopping, numberOfPepperoniTopping;

        public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
            setSize(size);
            setNumberOfCheeseTopping(numberOfCheeseTopping);
            setNumberOfPepperoniTopping(numberOfPepperoniTopping);
        }

        public char getSize() {
            return size;
        }

        public void setSize(char size) {
            this.size = size;
        }

        public int getNumberOfCheeseTopping() {
            return numberOfCheeseTopping;
        }

        public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
            this.numberOfCheeseTopping = numberOfCheeseTopping;
        }

        public int getNumberOfPepperoniTopping() {
            return numberOfPepperoniTopping;
        }

        public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
            this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        }

        public double calcCost(){
            double totalPrice = 0;

            switch (size){
                case 'S':
                case 's':
                    totalPrice = 10 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                    break;

                case 'M':
                case 'm':
                    totalPrice = 12 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                    break;

                case 'L':
                case 'l':
                    totalPrice = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
                    break;

                default:
                    System.err.println("Invalid size: "+size);

            }

            return totalPrice;
        }

        @Override
        public String toString() {
            return "Pizza{" +
                    "size=" + size +
                    ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                    ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                    ", total price=" + calcCost() +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {

            if( !(obj instanceof Pizza )){ // if the specified object is not pizza
                System.err.println("Invalid object: "+obj);
                System.exit(1);
            }

            Pizza pizza = (Pizza)obj;

            if(size ==   pizza.getSize()   ) {
                if (numberOfPepperoniTopping == pizza.getNumberOfPepperoniTopping()) {
                    return true;
                }
            }
            return false;
                       /*
            The code begins with the "@Override" annotation, which indicates that this method overrides a method from a superclass or interface.
The method is named "equals" and takes an "Object" as a parameter. This means it can compare any object to a Pizza object.
Inside the method, it first checks if the provided object is not an instance of the Pizza class. This means it's not a Pizza object. If it's not a Pizza object, an error message is printed, and the program exits.
If the object is a Pizza, it is casted (converted) to a Pizza object and assigned to a variable called "pizza".
The method then compares the size of the current Pizza object (the one calling the method) with the size of the "pizza" object. If they are equal, it proceeds to the next step.
Next, it compares the number of pepperoni toppings of the current Pizza object with the number of pepperoni toppings of the "pizza" object. If they are equal, it returns "true" to indicate that the two Pizza objects are equal in terms of size and number of pepperoni toppings.
If any of the previous conditions fail, the method returns "false" to indicate that the two Pizza objects are not equal.
             */
        }





}
