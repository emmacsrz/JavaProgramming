package Day08_Ternaries_SwitchStatements;

public class Elevator {
    public static void main(String[] args) {


        int floorNumber = 3;

        String floor = " ";


        if (floorNumber >= 1 && floorNumber <= 3) {

            if (floorNumber == 1) {
                floor = "Lobby, Verizon, Starbucks";
            } else if (floorNumber == 2) {
                floor = "Floor 2: Cydeo, Nasa, Intelsat";
            } else if (floorNumber == 3) {
                floor = "floor 3: Lyft, BofA, Steak House";
            }

        } else {
            floor = "invalid floor";
        }


        System.out.println(floor);

    }
}
