package app;
//TODO: Comments all methods

public class List {

    //TODO: Add Log Element and Create a get method and set inside all methods
    protected Node first;
    protected Node last;
    protected int qtdNode;

    public List()
    {
        this.first = null;
        this.last = null;
        this.qtdNode = 0;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getQtdNode() {
        return qtdNode;
    }

    public void setQtdNode(int qtdNode) {
        this.qtdNode = qtdNode;
    }

    //--------------------------------GETTERS AND SETTERS

    protected boolean isEmpty(){return this.first == null;}

    protected void insertLast(Ticket t)
    {
        System.out.println("Entrou");
        Node newNode = new Node(t);
        if (isEmpty()) {
            this.first = newNode;
        }else{
            this.last.setNext(newNode);
        }
        this.last = newNode;
        this.qtdNode++;
    }

    protected boolean removeNode()
    {
        Node current = this.first;
        Node prev = null;
        if (isEmpty()) {
            return false;
        }else{
            while (current != null && current != this.last) {
                prev = current;
                current = current.getNext();
            }
            if (current == this.first) {
                if (this.first == this.last) {
                    this.last = null;
                }
                this.first = this.first.getNext();
            }else{
                if(current == this.last){
                    this.last = prev;
                }
                prev.setNext(current.getNext());
            }
            
        }

        this.qtdNode--;
        return true;
    } 

    protected String printList()
    {
        
        String msg="";
        if (isEmpty()) {
            System.out.println("está vazia");
            return "A Lista está vazia";
        }
        Node current = this.first;
        while (current != null) {
            
            msg+=" - "+ current.getTicket().getMovie();
            current = current.getNext();
        }
        return msg;
    }
  }