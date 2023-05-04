package Day22_WrapperClass_ArrayListIntro;

public class WrapperClassMethods {
    public static void main(String[] args) {
//parse method:
        String str = "20";
        System.out.println(str + 1);
        //  Integer num1 = Integer.parseInt(str); // unboxing
        int num = Integer.parseInt(str);
        System.out.println(num + 1);
        Integer num2 = Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("------------------------------------------");



//value of method:
        String s = "20.5";  //when calling valueOf, any string can be converted into integer wrapper class variable
        double num3 = Double.parseDouble(s); //conerts the string into double
        Double num4 = Double.valueOf(s);//converts string into double wrapper class

        System.out.println(num3);
        System.out.println(num4);

        System.out.println("------------------------------------------");


//converting to boolean (not very necessary, just for informational purposes):

        String x = "false";
        boolean r1 = Boolean.parseBoolean(x); //converts string to  primitive bolean
        Boolean r2 = Boolean.valueOf(x);//converts string to wrapper class boolean

        System.out.println(r1);
        System.out.println(r2);



        System.out.println("------------------------------------------");



        char ch = '$';

        boolean isDigit =Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialChar = !Character.isLetterOrDigit(ch); // special character

        System.out.println("isDigit = " + isDigit);

        System.out.println("isLetter = " + isLetter);

        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);

        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);

        System.out.println("isSpecialChar = " + isSpecialChar);


        System.out.println("------------------------------------------------");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {

            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }

        }


        System.out.println("sum = " + sum);







    }

}