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
        System.out.println(newNode.toString());
    }


    public boolean printStacks()
    {
        if (isEmpty()) {
            return false;
        }
        Node newNode = bot;
        for (int i = 0; i < this.qtdNode-1; i++) {
            System.out.println(newNode.getTicket());
            newNode = newNode.getNext();
        }
        return true;
    }

    public Boolean unStack() {

        if (isEmpty()) {
            System.out.println("Está vazia");
            return false;
        }
        // top = null;

        Node current = bot;
     
        for (int i = 0; i < this.qtdNode -1; i++) {
            // System.out.println(current.getTicket());
            if (i == this.qtdNode-2) {
                break;
            }
            current = current.getNext();
        }

        this.top = current;
        // System.out.println("o do top "+this.top.getTicket());
        this.qtdNode--;
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
        Ticket t1 = new Ticket(r, " f1");
        Ticket t2= new Ticket(r, " p1");
        Ticket t3= new Ticket(r, " q1");
        stackUp(t1);
        stackUp(t2);
        stackUp(t3);
        // for (int i = 0; i < 4; i++) {
        //     stackUp(t);
        //     // System.out.println("TESTE: " + t);
        // }
        // System.out.println("TOpantes "+ top);
        // // System.out.println(this.top.getTicket());
        // unStack();
        

    }

    // TODO: Metodo Peek que retorna o elemento que está no final da lista

}