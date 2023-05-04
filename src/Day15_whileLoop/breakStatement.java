package Day15_whileLoop;

public class breakStatement {
    public static void main(String[] args) {

        for (int i =0 ; i <10 ; i++) {
            if (i == 6) {//this will terminate the loop when the i is equal to 6. This will limit it to 6 cycles.
                break;
            }/////////

            System.out.println(i);
        }

for (char x = 'A'; x <='Z'; x++){
    System.out.println(x);
    if (x=='J'){
        break;
    }
}

for (;;){
    System.out.println("hello");
    break; //break statement exits this loop without any conditions or iterator in order to get the loop to print just one "helo" statment
}





    }
}
