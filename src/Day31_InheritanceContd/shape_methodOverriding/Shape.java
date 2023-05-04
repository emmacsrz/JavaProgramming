package Day31_InheritanceContd.shape_methodOverriding;

public class Shape {
    private String name;

    //the following constructor allows each child class to use this default constructor b/c you are using the getsimplename Method.
    public Shape(){
        setName(getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("drawing a "+getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';

    }
}
