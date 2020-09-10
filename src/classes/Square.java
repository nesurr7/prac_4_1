package classes;

public class Square extends Rectangle {
    double side;

    Square() {
    }

    Square(double side) {
        super(side, side);
        this.side=side;
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side=side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length=side;
        this.width=side;
    }

    @Override
    public void setLength(double length) {
        this.side = side;
        this.length=side;
        this.width=side;
    }

    @Override
    public void setWidth(double width) {
        this.side = side;
        this.length=side;
        this.width=side;
    }

    @Override
    public String toString() {
        return "Параметры квадрата:" +
                "\nДлина стороны:" + side +
                "\nЦвет:" + color +
                "\nЗаполнен:" + filled +
                "\n________________";}
    }

