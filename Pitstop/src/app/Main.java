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
       Stack s = new Stack();
       Room room = new Room(15, "BLS6");
       Ticket t1 = new Ticket(room, "m1");
       Ticket t2 = new Ticket(room, "m2");
       Ticket t3 = new Ticket(room, "m3");
       s.insertLast(t1);
       s.insertLast(t2);
       s.insertLast(t3);
       System.out.println(s.stackUP());
    }
}
