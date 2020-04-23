package app;

public class Stack {
    private Node top;
    private Node bot;
    private int qtdNode;

    public Stack() {
        this.top = null;
        this.bot = null;
        this.qtdNode = 0;
    }

    public void stackUp(Ticket t) {
        Node newNode = new Node(t);
        if (isEmpty() == true) {
            this.bot = newNode;
        } else {
            this.top.setNext(newNode);
        }
        this.top = newNode;
        qtdNode++;
        // System.out.println(newNode.toString());
    }

    public Boolean unStack() {

        // if (isEmpty()) {
        // System.out.println("-----------------VAZIA");
        // return null;
        // }
        // unstack = top.getTicket();
        // top = top.getNext();
        // qtdNode--;
        // // System.out.println(unstack.toString());
        // return unstack;

        // while ((atual != null) && (!atual.getP().getNome().equals(nome))) {
        //     atual = atual.getProx();
        // }
        if (isEmpty()) {
            System.out.println("Está vazia");
            return false;
        }
        // top = null;

        Node current = bot;
        while ((current != null) && (current != top)) {
            System.out.println("cu " + current);
            current = current.getNext();
        }
        for (int i = 0; i < this.qtdNode; i++) {
            
        }
        System.out.println("cu final " + current);
        System.out.println("tp topzera " + top);
        System.out.println("boto " + bot);

        // this.qtdNode--;
        return true;
    }

    public boolean isEmpty() {
        return (bot == null);
    }

    public Node getTop() {
        return this.top.getNext();
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public Node getBot() {
        return bot;
    }

    public void setBot(Node bot) {
        this.bot = bot;
    }

    public int getQtdNode() {
        return qtdNode;
    }

    public void setQtdNode(int qtdNode) {
        this.qtdNode = qtdNode;
    }

    public void test() {
        Room r = new Room(1, " blt 8");
        Ticket t = new Ticket(r, " PornHub MegaHits");
        for (int i = 0; i < 4; i++) {
            stackUp(t);
            // System.out.println("TESTE: " + t);
        }
        System.out.println("TOpantes "+ top);
        // System.out.println(this.top.getTicket());
        unStack();

    }

    // TODO: Metodo Peek que retorna o elemento que está no final da lista

}