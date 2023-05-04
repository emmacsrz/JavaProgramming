package Day15_whileLoop;

public class removeDuplicates2 {
    public static void main(String[] args) {

        String str = "xyzxyzxyz";
        String result ="";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains(""+str.charAt(i) )) {
                continue;
            }
            result += str.charAt(i);
        }//loop end


        System.out.println(result);

for (int i = 0; i <51; i+=2){ //retrieves only even numbers
    System.out.println(i);
}

        for (int i = 50; i <101 ; i++) {
            if (i%2!=0){
                continue;
            }

        }

    }
}
