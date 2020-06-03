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
        System.out.println("Hello Java");
        Scanner scan = new Scanner(System.in);
        Stack st = new Stack();
        Ticket t = new Ticket();
        st.stackUP(t);
        System.out.println(st);
         
    }
}


// TODO: ADD AS ROOMS NO TICKET -  UM LOOP I DE UM A 10  N POSIÇÃO 1 DE I TEM UM LOOP J DE UM A 10 ONDE TODAS AS ROOMS NESSE J TEM O ENDEREÇO COM O VALOR DE I

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA QUEUE F:
// F PRINTAR FILA.
// F.GETFIRST() RETORNA O PRIMEIRO ELEMENTO DA FILA.
// F.REMOVE() REMOVE UM ELEMENTO DA FILA.
// F.PUTON(PERSON) ADD UM OBJETO DO TIPO PERSON NA FILA.(REQUER UMA PERSON CRIADA PARA ADD NA FILA).
// =================================================================================================



// =================================================================================================
// MANUAL DE INSTRUÇÃO DA STACK Q:
// Q = PRINTAR A STACK (CHAMA A TOSTRING).
// Q.STACKTP(TICKET) = ADD UM TICKET NA CLASSE STACK OBSERVE QUE INICIALMENTE TICKET NÃO REQUER PARAMETROS.
// Q.UNSTACK() REMOVE UM ITEM DA STACK (não vai dar problema se eu remover arquivos de uma stack vazia).
// =================================================================================================


// TODO: VOU TER QUE PEGAR MINHA FILA E PEGAR MINHA PILHA PRECISO DE UM METODO QUE RETORNA O PRIMEIRO DA FILA E UM METODO QUE RETORNA O ULTIMO DA PILHA FAZER AS INTERAÇÕES NECESSARIAS ENTRE ELES,  ARAMAZENAR O NECESSARIO E DEPOIS DESPACHALOS

