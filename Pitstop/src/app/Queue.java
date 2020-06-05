package app;

public class Queue {
    private Person[] pessoa;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.pessoa = new Person[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    public Queue() {
        this.pessoa = new Person[10];
        this.size = 0;
        this.capacity = 10;
    }

    public int getSize() {
        return size;
    }

    private Boolean isEmpity() {
        return size == 0;
    }

    public Boolean addElement(Person p) {

        if (this.size >= this.capacity) {
            return false;
            // POSSO DOCUMENTAR CRIANDO UM METODO QUE FALA PQ DE ESSE ERRO
        }
        if (isEmpity()) {
            this.pessoa[0] = p;
            this.size++;
            return true;
        }

        this.pessoa[this.size] = p;
        this.size++;
        return true;
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.println("Pos: " + (i + 1) + " - " + this.pessoa[i].getNome());
        }
    }


    public Boolean remove(){

        if (isEmpity()) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            this.pessoa[i] = this.pessoa[i+1];
        }
        this.size--;
        return true;
    }

    public Person getFirst()
    {
        if (isEmpity()) {
            return null;
        }
        return this.pessoa[0];
    }
}

// =================================================================================================
// MANUAL DE INSTRUÇÃO DA QUEUE F:
// OBS: A FILA NO CONTRUTOR DEVE TER UM TAMANHO ESPCEIFICO (capacity) SELECIONADO CASO..
// ..CONTRARIO O TAMANHO PADÃO SERÁ 10
// F GETSIZE() RETONA O TAMANHO DA FILA EM INT
// F.GETFIRST() RETORNA O PRIMEIRO ELEMENTO DA FILA.
// F.REMOVE() REMOVE UM ELEMENTO DA FILA.
// F.PUTON(PERSON) ADD UM OBJETO DO TIPO PERSON NA FILA.(REQUER UMA PERSON
// CRIADA PARA ADD NA FILA).
// =================================================================================================