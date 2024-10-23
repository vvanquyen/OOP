package bai1_2;

public class Main12 {
    public static <Circle> void main(String[] args) {
        // Test Constructors and toString()
    Circle12 c1 = new Circle12();
        System.out.println(c1);
    Circle12 c2 = new Circle12();
    System.out.println(c2);
        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

    }
}
