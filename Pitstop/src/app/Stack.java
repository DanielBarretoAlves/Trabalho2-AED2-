package app;

public class Stack extends List {

    public Stack() {
        super();
    }

    public void stackUP(Ticket t) {
        super.insertLast(t);
    }

    public void showStack() {
        String stack = super.printList();
        System.out.println(stack);
    }

    public void unstack() {
        super.removeNode();
    }

    public Node getLast() {
        return super.getLast();
    }

    @Override
    public String toString() {
        return "Stack []";
    }

}

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA STACK Q:
// Q = PRINTAR A STACK (CHAMA A TOSTRING).
// Q.STACKTP(TICKET) = ADD UM TICKET NA CLASSE STACK OBSERVE QUE INICIALMENTE
// TICKET NÃO REQUER PARAMETROS.
// Q.UNSTACK() REMOVE UM ITEM DA STACK (não vai dar problema se eu remover
// arquivos de uma stack vazia).
// Q.getLast() Retorna o Ultimo Nó na Stack.
// =================================================================================================