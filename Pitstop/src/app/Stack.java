package app;

public class Stack extends List {

    public Stack() {
        super();
    }

    public void push(Ticket t) {
        super.insertLast(t);
    }

    public void pop() {
        super.removeNode();
    }

    public Node getLast() {
        return super.getLast();
    }

    @Override
    public String toString() {
        return super.printList();
    }

}

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA STACK Q:
// Q = PRINTAR A STACK (CHAMA A TOSTRING).
// Q.PUSH(TICKET) = ADD UM TICKET NA CLASSE STACK OBSERVE QUE INICIALMENTE
// TICKET NÃO REQUER PARAMETROS.
// Q.POP() REMOVE UM ITEM DA STACK (não vai dar problema se eu remover
// arquivos de uma stack vazia).
// Q.getLast() Retorna o Ultimo Nó na Stack.
// =================================================================================================