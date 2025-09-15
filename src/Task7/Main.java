package Task7;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape square = new Square(4);

        System.out.println("Площа кола: " + circle.area());
        System.out.println("Площа прямокутника: " + rectangle.area());
        System.out.println("Площа квадрата: " + square.area());
    }
}

