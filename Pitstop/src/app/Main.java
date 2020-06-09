package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // CRIAR ARRAY DE ROOMS
        Room[] rooms = new Room[5];
        for (int i = 0; i < rooms.length; i++) {
            Room r = new Room(0, i, ("Movies set: " + i));
            rooms[i] = r;
        }
        // CRIAR UMA PILHA DE INGREÇOS
        Stack empiTickets = new Stack();

        for (int i = 0; i < rooms.length; i++) {
            while (rooms[i].getQuantity() < 5) {
                Ticket t = new Ticket(rooms[i]);
                empiTickets.push(t);
                rooms[i].setQuantity(rooms[i].getQuantity() + 1);
            }
        }

        // CRIAR UMA FILA DE PESSOAS
        Queue people = new Queue(15);
        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o Nome:");
            String nome = scan.nextLine();
            System.out.println("Informe o Telefone:");
            String tel = scan.nextLine();
            Person p = new Person(nome, tel);
            people.push(p);
        }
        // TODO: CRIAR UMA PILHA DE INGREÇOS ENTREGUES COM OS DADOS DAS PESSOAS

    }
}

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA QUEUE F:

// OBS: A FILA NO CONTRUTOR DEVE TER UM TAMANHO ESPCEIFICO (capacity)..
// ..SELECIONADO CASO CONTRARIO O TAMANHO PADÃO SERÁ 10
// F.GET() RETORNA O PRIMEIRO ELEMENTO DA FILA.
// F.POP() REMOVE UM ELEMENTO DA FILA.
// F.PUSH(PERSON) ADD UM OBJETO DO TIPO PERSON NA FILA.(REQUER UMA..
// ..PERSON CRIADA PARA ADD NA FILA).
// =================================================================================================

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA STACK Q:
// Q = PRINTA A STACK (CHAMA A TOSTRING).
// Q.PUSH(TICKET) = ADD UM TICKET NA CLASSE STACK OBSERVE QUE INICIALMENTE
// Q.POP() REMOVE UM ITEM DA STACK (não vai dar problema se eu remover
// arquivos de uma stack vazia).
// Q.get() Retorna o Ultimo Nó na Stack.
// =================================================================================================
