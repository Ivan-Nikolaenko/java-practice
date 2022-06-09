package lesson30_equalsToString;

public class Test1 {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V4");
        Car c2 = new Car("red", "V4");
        Car c3 = new Car("black", "V8");

        System.out.println(c3.toString());

    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return (color.equals(((Car) obj).color) && engine.equals(((Car) obj).engine));
        } else return false;
    }

    @Override
    public String toString() {
        return "Mashina cveta " + color + " i s motorom " + engine;
    }
}
