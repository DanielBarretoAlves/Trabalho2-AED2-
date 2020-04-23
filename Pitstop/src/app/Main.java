package app;

import java.util.Scanner;

public class Main {
    static void enjoyQueue(int size, Queue<Person> fila) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Informe o nome da pessoa:");
            String nome = scan.nextLine();
            System.out.println("Informe seu telefone (SOMENTE NUMEROS)");
            int num = scan.nextInt();
            Person person = new Person(nome, num);
            fila.putOn(person);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Scanner scan = new Scanner(System.in);
        // Queue<Integer> fila = new Queue()<>(3);
        Queue<Person> fila = new Queue<>(3);
        System.out.println("Informe a quantidade de pessoas");
        int size = scan.nextInt();
        enjoyQueue(size, fila);

        // fila.putOn(1);
        // fila.putOn(2);
        // fila.putOn(3);
        // fila.putOn(7);
        // fila.putOn(9);
        System.out.println(fila);
    }
}
