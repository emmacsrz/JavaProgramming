package Day16_WhileLoopContd_DoWhileLoop_NestedLoop;
//write a program that will reverse the domain name of the email

import java.util.Scanner;

public class ReverseitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter your email: ");
        String email = input.next();
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println(reverseit(domain));


    }
    public static String reverseit(String domain){
        String reversed = "";
for (int i = domain.length()-1; i >=0  ; i--){
    reversed += domain.charAt(i);
}
        return reversed;
    }



}
