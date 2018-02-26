


abstract class Shape{
    private String name = "";

    Shape(String name){
        this.name = name;
    }

    public String getShapeName(){
        return name;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

}


class Circle extends Shape {
    private double radius;
    public final double PI = 3.141;
    
    Circle(){
        super("Circle");
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return PI*2*radius;
    }

}


class Tester{
    public static void main(String args[]){
        Circle c1 = new Circle();
        System.out.println("Shape Name: " + c1.getShapeName());
        c1.setRadius(10);
        System.out.println("Perimeter: "+ c1.getPerimeter() + " m");
        System.out.println("Area: "+ c1.getArea() + " sq m");
    }
}