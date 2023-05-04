package Day15_whileLoop;

public class removingDuplicates {
    public static void main(String[] args) {


        String str ="aabbbcccc";
        String result = ""; //abv

        //BELOW: you do not need to add -1 to the .length bc you are using exclusive i<str.length().  That means that the extra number the .length method ads is EXCLUDED.
for (int i =0; i< str.length();  i++){
   char each = str.charAt(i);
    if (!result.contains(""+ each)){ //if string result DOES NOT contain character of string str YET, it will add a new one to the result variable. it will not add the same character twice in a row. it will NOT add a character if the character is already contained.
        result+=each;
    }
}
        System.out.println(result);






    }
}
