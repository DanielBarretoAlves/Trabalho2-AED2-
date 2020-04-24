package app;

import java.util.Scanner;

public class Main {
    static void enjoyQueue(int size, Queue<Person> fila) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            System.out.println("Informe o nome da pessoa:");
            String nome = scan.next();
            System.out.println("Informe seu telefone (SOMENTE NUMEROS)");
            int num = scan.nextInt();
            Person person = new Person(nome, num);
            fila.putOn(person);
        }
    }

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        Scanner scan = new Scanner(System.in);
        Queue q = new Queue<>();
        enjoyQueue(3, q);
        System.out.println(q);
        System.out.println("------------------------------------------");
        q.remove();
        System.out.println(q);
        System.out.println("------------------------------------------");
        System.out.println("Primeiro Da Fila: "+q.getFirst());
    }
}
