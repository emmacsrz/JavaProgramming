package Day31_InheritanceContd.shape_methodOverriding;

public class Square extends Shape{
    private double side;

    public Square(double side){
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    public void draw() {
        super.draw();
        System.out.println("\t*  *  *  *  *  *");
        for (int i = 0; i < 4; i++) {
        System.out.println("\t*              *");
        }
        System.out.println("\t*  *  *  *  *  *");
    }

}
