public class Triangle
        extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
    }

    public Triangle(double side1, double side2,double side3) {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public Triangle(double side1, double side2,double side3,
            String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getter1() {
        return side1;
    }

    public void setter1(double side1) {
        this.side1 = side1;
    }

    public double getter2() {
        return side2;
    }

    public void setter2(double side2) {
        this.side2 = side2;
    }

    public double getter3() {
        return side3;
    }

    public void setter3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double area=(Math. sqrt(3)/4)*(side1*side1);
        return area;
    }

    public String toString() {
        return "Triangle: sides = " + side1 + " " + side2 + " " + side3;
    }
}

