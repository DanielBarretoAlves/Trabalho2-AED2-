package app;

public class Main {

    public static void main(String[] args) {
        //Array de Rooms

        Room[] rooms = new Room[5];
        for (int i = 0; i < rooms.length; i++) {
            Room r = new Room(5, i, ("Movies set: " + i));
            rooms[i] = r;
        }
        // TODO: CRIAR UMA PILHA DE INGREÇOS
        // TODO: CRIAR UMA FILA DE PESSOAS
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
