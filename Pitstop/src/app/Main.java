package app;

import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Log.content += "------------------------------------------- \n";
        Log.content += "           Inicio da execução \n";
        Log.content += "------------------------------------------- \n";
        Log.content += "------------------------------------------- \n";
        Log.content += "           Bem Vindo ao Pitstop \n";
        Log.content += "------------------------------------------- \n";

        // CRIAR ARRAY DE ROOMS
        Room[] rooms = new Room[5];
        Log.content += " - Criou um ARRAY de Rooms com " + rooms.length + " espaços ! \n";
        for (int i = 0; i < rooms.length; i++) {
            Room r = new Room(0, i, ("Combos de Filmes: " + i));
            Log.content += " - Add um Room no ARRAY rooms \n";
            rooms[i] = r;
        }
        // CRIAR UMA PILHA DE INGREÇOS
        Stack empiTickets = new Stack();
        Log.content += "---------------------------------------- \n";
        Log.content += "Adcionando TICKETS ao stack... \n";

        for (int i = 0; i < rooms.length; i++) {
            while (rooms[i].getQuantity() < 5) {
                Ticket t = new Ticket(rooms[i]);
                empiTickets.push(t);
                rooms[i].setQuantity(rooms[i].getQuantity() + 1);
            }
        }
        Log.content += "Tickets Add Com Sucesso! \n";
        Log.content += "*********************************\n";

        // TODO: Need Checkup
        Log.content += empiTickets + " \n";
        Log.content += "*********************************\n";

        // CRIAR UMA FILA DE PESSOAS
        Queue people = new Queue(15);
        Log.content += "------------------------------------- \n";
        Log.content += "Adcionando Pessoas a QUEUE \n";
        for (int i = 0; i < 10; i++) {
            Person p = new Person("pessoa " + i, "(27)111-111");
            Log.content += " - Pessoa: " + p.getNome() + " Adicionada a QUEUE\n";
            people.push(p);
        }
        Log.content += "Pessoas Adcionadas com Sucesso!  \n";
        Log.content += people;

        // Criar um stack com os dados dos cliente armazenados
        Stack clients = new Stack();
        int qtt = people.getSize();
        for (int i = 0; i < qtt; i++) {
            Ticket t = empiTickets.get().getTicket();
            t.setuData(people.get());
            empiTickets.pop();
            people.pop();
            clients.push(t);
        }
        Log.content += "\n############################################# \n";
        Log.content += "Dados dos Usuários que pegaram o ingresso \n";
        Log.content += "############################################# \n";
        Log.content += clients + "\n";
        Log.content += "########################### \n";

        Log.content += "------------------------------------------- \n";
        Log.content += "           Fim da Execução \n";
        Log.content += "------------------------------------------- \n";

        try {
            FileWriter myWriter = new FileWriter("log.txt");
            myWriter.write(Log.content);
            myWriter.close();
            System.out.println("Log Criado com Sucesso!");
        } catch (IOException e) {
            System.out.println("Deu Erro na hora de criar o Log");
            e.printStackTrace();
        }
        // System.out.println(Log.content);
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
