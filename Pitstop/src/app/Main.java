package app;

public class Main {

    public static void main(String[] args) {

        Stack st = new Stack();
        Room r = new Room(20, 1, "movies");
        Ticket t = new Ticket(r);
        st.push(t);
        System.out.println(st);

    }
}

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA QUEUE F:

// OBS: A FILA NO CONTRUTOR DEVE TER UM TAMANHO ESPCEIFICO (capacity)..
// ..SELECIONADO CASO CONTRARIO O TAMANHO PADÃO SERÁ 10
// F.GETFIRST() RETORNA O PRIMEIRO ELEMENTO DA FILA.
// F.POP() REMOVE UM ELEMENTO DA FILA.
// F.PUSH(PERSON) ADD UM OBJETO DO TIPO PERSON NA FILA.(REQUER UMA..
// ..PERSON CRIADA PARA ADD NA FILA).
// =================================================================================================

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA STACK Q:
// Q = PRINTAR A STACK (CHAMA A TOSTRING).
// Q.PUSH(TICKET) = ADD UM TICKET NA CLASSE STACK OBSERVE QUE INICIALMENTE
// TICKET NÃO REQUER PARAMETROS.
// Q.POP() REMOVE UM ITEM DA STACK (não vai dar problema se eu remover
// arquivos de uma stack vazia).
// Q.getLast() Retorna o Ultimo Nó na Stack.
// =================================================================================================
