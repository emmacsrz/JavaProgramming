package Day27_AccessModifiers;

public class StaticBlock {
public StaticBlock(){
    System.out.println("constructor");
}


    public static void main(String[] args) {

        System.out.println("main method");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }


    static{
        System.out.println("static block");

    }
}
