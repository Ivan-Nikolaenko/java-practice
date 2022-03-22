package Advanced_NestedClasses.inner_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;

    @Override
    public String toString() {
        return "MyCar{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public class Engine {
        private int horsePower;

        @Override
        public String toString() {
            return "My Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }

        public Engine(int horsePower) {
            System.out.println(doorCount);
            this.horsePower = horsePower;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Car car = new Car("black", 4);
        Car.Engine engine = car.new Engine(150);
        car.setEngine(engine);
        System.out.println(engine);
        System.out.println(car);
    }
}