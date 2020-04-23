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

    // public void inserirUltimo(Pessoa p) {
    //     No novoNO = new No(p);
    //     if (this.eVazia()) {
    //         this.prim = novoNO;
    //     } else {
    //         this.ult.setProx(novoNO);
    //     }
    //     this.ult = novoNO;
    //     this.qtdNo++;
    // }// ----------------------------------------------------INSERIR ULTIMO

    public void stackUp(Ticket t) {
        if (isEmpty() == true) {
            Node newNode = new Node(t);
            this.top = newNode;
            this.bot = newNode;
            newNode.setNext(this.top);
            qtdNode++;
            System.out.println(newNode.toString());
        } else {
            Node newNode = new Node(t);
            this.top.setNext(newNode);
            this.top = newNode;
            qtdNode++;
            System.out.println(newNode.toString());

        }

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

}