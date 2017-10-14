import javafx.geometry.Point2D;

import java.awt.*;

public class Triangle {

    private double a;
    private double b;
    private double c;

    Point2D one;
    Point2D two;
    Point2D three;

    private void sort() {
        if (a < b) {
            double t = a;
            a = b;
            b = t;
        }

        if (b < c) {
            double t = b;
            b = c;
            c= t;
        }

        if (a < b) {
            double t = a;
            a = b;
            b = t;
        }
    }

    public Triangle(double _a, double _b, double _c) {
        this.a = _a;
        this.b = _b;
        this.c = _c;

        sort();

        one = new Point2D(0.0, 0.0);
        two = new Point2D(this.a, 0.0);

        double x = (b*b - c*c - a*a)/ (-2*a);
        double y = Math.sqrt(c*c - x*x);

        three = new Point2D(x, y);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", one=" + one +
                ", two=" + two +
                ", three=" + three +
                '}';
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(4,5,3);
        System.out.println(t);
    }

    public void draW(Graphics2D g) {
        //int w =
    }
}
