package classes;

public abstract class Shape {

    //Свойства
    String color;
    boolean filled;
    ///////////
    //Конструкторы
    Shape(){
        color="undefined";
        filled=false;
    }
    ////////////
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //////
    //Геттеры

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    //Сеттеры

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double  getArea();
    public abstract double getPerimeter();
    public abstract String toString();

}
