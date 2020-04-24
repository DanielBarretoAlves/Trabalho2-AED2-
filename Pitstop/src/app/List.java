package app;

public class List {

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

  }