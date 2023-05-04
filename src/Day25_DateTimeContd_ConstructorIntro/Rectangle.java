package Day25_DateTimeContd_ConstructorIntro;

public class Rectangle {  public double length, width;


//constructor:
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    } //this is instead of using .setInfo method (commented out below)


    /*
    public void setInfo(double length, double width){
        this.length = length;
        this.width = width;
    }
     */


    public double area(){
        return length * width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }



}
