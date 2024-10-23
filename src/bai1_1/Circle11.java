package bai1_1;

public class Circle11 {
    private Double radius;
    private String color;
    Circle11(Double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle11(){
        radius = 2.0;
        color = "black";

    }
    public Circle11(double r){
        radius = r;
        color = "black";

    }
    public double getradius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * (radius*radius);
    }
}
