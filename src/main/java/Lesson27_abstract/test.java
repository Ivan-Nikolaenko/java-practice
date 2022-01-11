package Lesson27_abstract;

public class test {

}

abstract class Figura {
    int kolsoron;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }

}

class Kvadrat extends Figura {
    int storona1 = 10;
    @Override
    public void perimetr() {
        System.out.println("Perimitr kvadrata = " + 4 * storona1);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad kvadrata = "+storona1*storona1);
    }
}

class Pryamougolnik extends Figura {

}

class Okrujnost extends Figura {

}


