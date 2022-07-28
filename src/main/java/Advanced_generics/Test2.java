package Advanced_generics;

    public class Test2 {
    public static void main(String[] args) {
        Infoo<String> infoo1 = new Infoo<>("Privet!");
        System.out.println(infoo1);
    }
}

    class Infoo<T> {
    private T value;

    public Infoo(T value) {
        this.value = value;
    }
    public String toString(){
        return "{{"+value+"}}";
    }
}
