package Lesson27_abstract;

public class test {
    public static void main(String[] args) {
        Figura f1= new Kvadrat();
        f1.ploshad();
        f1.perimetr();
    }

}

abstract class Figura {
    int kolstoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }

}

class Kvadrat extends Figura {
    int kolstoron = 0;
    int storona1 = 10;

    @Override
    public void perimetr() {
        System.out.println("Perimitr kvadrata = " + 4 * storona1);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pryamougolnik extends Figura {
    int kolstoron = 0;
    int storona1 = 8;
    int storona2 = 5;

    @Override
    public void perimetr() {
        System.out.println("Perimitr pryamougolnika = " + 2 * (storona1 + storona2));
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad pryamougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int kolstoron = 0;
    int radius = 3;

    @Override
    public void perimetr() {
        System.out.println("Perimitr Okrujnost = " + 2 * 3.14 * radius);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad Okrujnost = " + 3.14 * radius * radius);
    }
}




