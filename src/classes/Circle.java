package classes;

public class Circle extends Shape {
    double radius;

    /////////
    Circle() {
        radius = -1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Окружность с параметрами:"+
                "\nРадиус:"+radius+
                "\nЗаполнена:"+filled+
                "\nЦвет:"+color+
                "\n_____________";

    }
}
