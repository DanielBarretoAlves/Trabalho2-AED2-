package app;

import java.util.Scanner;

import javax.management.Query;

public class Main {
    // static void enjoyQueue(int size, Queue<Person> fila) {
    //     Scanner scan = new Scanner(System.in);
    //     for (int i = 0; i < size; i++) {
    //         System.out.println("Informe o nome da pessoa:");
    //         String nome = scan.next();
    //         System.out.println("Informe seu telefone (SOMENTE NUMEROS)");
    //         int num = scan.nextInt();
    //         Person person = new Person(nome, num);
    //         fila.putOn(person);
    //     }
    // }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack();
        Room r1 = new Room(20, 1, "abc do amor");
        Room r2 = new Room(20, 2, "abc do amor");
        // Person p = new Person<>("Daniel");
        // Room r = new Room(20, 5, "sou foda");
        // Ticket ta = new Ticket(r);
        // ta.setuData(p);
        // st.stackUP(ta);

        for (int i = 1; i < 20; i++) {
            Ticket t = new Ticket(r1);
            st.stackUP(t);
            r1.setQuantity(r1.getQuantity() + 1);
        }
        for (int i = 1; i < 20; i++) {
            Ticket t = new Ticket(r2);
            st.stackUP(t);
            r2.setQuantity(r2.getQuantity() + 1);
        }
        System.out.println(st.getLast().getTicket().getRoom().getRoomNumber());
        System.out.println("=====================================================================================");

        Person p1 = new Person("Daniel");
        Person p2 = new Person("Bread");
        Person p3 = new Person("Graci");
        Person p4 = new Person("Celly");
        Person p5 = new Person("Lo");

        Queue q = new Queue(5);
        q.addElement(p1);
        q.addElement(p2);
        q.addElement(p3);
        q.addElement(p4);
        q.show();
        System.out.println("Ingresso para o Primeiro: " + q.getFirst().getNome());
        st.getLast().getTicket().setuData(q.getFirst());
        q.remove();
        st.showStack();
        System.out.println("---------------------------------------------------");
        q.show();
        st.getLast().getTicket().setuData(q.getFirst());
        q.remove();
        st.showStack();

    }
}

// TODO: ADD AS ROOMS NO TICKET - UM LOOP I DE UM A 10 N POSIÇÃO 1 DE I TEM UM
// LOOP J DE UM A 10 ONDE TODAS AS ROOMS NESSE J TEM O ENDEREÇO COM O VALOR DE I

// TODO: O GET NOME ESTÁ NA CLASSE LIST DEVE SER ADAPATADO PARA RECEBER O NUMERO
// DA SALA ESTÁ COMENTADO WARNING!

// OBS: CADA ROOM VAI PEDIR FILME[Uma String com 5 Filmes +=] E NUMERO DE
// PESSOAS PERMITIDOS, OS FILMES VOU
// FAZER UMA METODO QUE SETTA TODOS EM UM ARRAY DAI É SÓ DA SORT NELES QUE
// ENTREGA NORMAL

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA QUEUE F:
// F PRINTAR FILA.
// F.GETFIRST() RETORNA O PRIMEIRO ELEMENTO DA FILA.
// F.REMOVE() REMOVE UM ELEMENTO DA FILA.
// F.PUTON(PERSON) ADD UM OBJETO DO TIPO PERSON NA FILA.(REQUER UMA PERSON
// CRIADA PARA ADD NA FILA).
// =================================================================================================

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA STACK Q:
// Q = PRINTAR A STACK (CHAMA A TOSTRING).
// Q.STACKTP(TICKET) = ADD UM TICKET NA CLASSE STACK OBSERVE QUE INICIALMENTE
// TICKET NÃO REQUER PARAMETROS.
// Q.UNSTACK() REMOVE UM ITEM DA STACK (não vai dar problema se eu remover
// arquivos de uma stack vazia).
// Q.getLast() Retorna o Ultimo Nó na Stack.
// =================================================================================================

// TODO: VOU TER QUE PEGAR MINHA FILA E PEGAR MINHA PILHA PRECISO DE UM METODO
// QUE RETORNA O PRIMEIRO DA FILA E UM METODO QUE RETORNA O ULTIMO DA PILHA
// FAZER AS INTERAÇÕES NECESSARIAS ENTRE ELES, ARAMAZENAR O NECESSARIO E DEPOIS
// DESPACHALOS
