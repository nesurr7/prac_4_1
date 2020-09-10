package classes;

public class TestShapes {

    public static void main(String[] argc) {
        Circle obj1 = new Circle();
        Circle obj2 = new Circle(5);
        Circle obj3 = new Circle(5, "Зелёный", true);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        Rectangle obj4 = new Rectangle();
        Rectangle obj5 = new Rectangle(15,12);
        Rectangle obj6 = new Rectangle(20,30,"Фиолетовый",true);
        System.out.println(obj4.toString());
        System.out.println(obj5.toString());
        System.out.println(obj6.toString());
        Square obj7 = new Square();
        Square obj8 = new Square(5);
        Square obj9 = new Square(5,"Желтый",true);
        System.out.println(obj7.toString());
        System.out.println(obj8.toString());
        System.out.println(obj9.toString());
    }
}
