package app;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        // Queue<Integer> fila = new Queue()<>(3);
        Queue<Person> fila = new Queue<>(3);
        Person daniel = new Person("Daniel");
        fila.putOn(daniel);
        // fila.putOn(1);
        // fila.putOn(2);
        // fila.putOn(3);
        // fila.putOn(7);
        // fila.putOn(9);
        System.out.println(fila);
    }
}



