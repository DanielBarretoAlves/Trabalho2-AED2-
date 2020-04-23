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

    public boolean isEmpty() {
        return (bot == null);
    }

    public Node getTop() {
        return top;
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

    public void test(){
        Room r = new Room(1,"blt 8","PornHub MegaHits");
        Ticket t = new Ticket(r);
        stackUp(t);
    }

}