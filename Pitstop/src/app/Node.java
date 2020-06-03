package app;

public class Node {
    private Pessoa p;
    private Node nextNode;

    public Node(Pessoa p) {
        this.p = p;
        this.nextNode = null;

    }

    public Pessoa getP() {
        return p;
    }

    public void setP(Pessoa p) {
        this.p = p;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    
    

   
    


    
}