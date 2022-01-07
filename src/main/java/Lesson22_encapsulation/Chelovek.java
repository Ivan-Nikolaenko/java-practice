package Lesson22_encapsulation;

public class Chelovek {
    final String pol;

    Chelovek(String pol) {
        this.pol = pol;
    }

    private String name;
    private int vozrast;
    private int ves;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVozrast() {
        return vozrast;
    }

    public void setVozrast(int i) {
        if (i > 0 && i < 100) {
            vozrast = i;
        } else {
            System.out.println("Введите корректный возраст!");
        }
    }

    public int getVes() {
        return ves;
    }

    public void setVes(int i) {
        if (i > 0) {
            ves = i;
        }
    }


}

class Test {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName("Kolia");
        c.setVozrast(34);
        c.setVes(82);
        System.out.println(
                "Имя : " + c.getName() + "\n" +
                        "Возраст : " + c.getVozrast() + "\n" +
                        "Вес : " + c.getVes()
        );
    }
}
