/**
 *
 * @author
 */
public class TestTriangle {
    public static void main(String[] args) {
        Shape s = new Shape();
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Triangle t = new Triangle(1.0,1.0,1.0);

        System.out.println(s);
        System.out.println(c);
        System.out.println(r);
        System.out.println(t);
    }
}

