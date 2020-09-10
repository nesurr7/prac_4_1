package classes;

public class Rectangle extends Shape {
    double width;
    double length;

    Rectangle() {
        width = -1;
        length = -1;
    }

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Параметры прямоугольника" +
                "\nШирина:" + width +
                "\nДлина:" + length +
                "\nЦвет:" + color +
                "\nЗаполнен:" + filled+
                "\n________________";
    }
}
