package app;

public class Queue {
    private Person[] pessoa;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.pessoa = new Person[capacity];
        this.size = 0;
        this.capacity = capacity;
        Log.content += " - Criou uma Queue com a Capcaidade de: " + this.capacity + " Elementos \n";
    }

    public Queue() {
        this.pessoa = new Person[10];
        this.size = 0;
        this.capacity = 10;
        Log.content += " - Criou uma Queue com a Capcaidade de: " + this.capacity + " Elementos \n";
    }

    public int getSize() {
        return size;
    }

    private Boolean isEmpity() {
        return size == 0;
    }

    public Boolean push(Person p) {
        Log.content += " - Adicionando Pessoa: " + p.getNome() + "\n";

        if (this.size >= this.capacity) {
            Log.content += "XXX ERROR: a QUEUE ESTÁ CHEIA. XXX \n";
            return false;
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

    public Boolean pop() {

        if (isEmpity()) {
            Log.content +="Removendo Pessoa... \n";
            Log.content += "ERRO: FILA JÁ ESTÁ VAZIA \n";
            return false;
        }
        Log.content += " - Removendo Pessoa:  " + get().getNome() + "\n";

        for (int i = 0; i < size; i++) {
            this.pessoa[i] = this.pessoa[i + 1];
        }
        this.size--;
        return true;
    }

    public Person get() {
        if (isEmpity()) {
            return null;
        }
        return this.pessoa[0];
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            str += ("Pos: " + (i + 1) + " - Nome: " + this.pessoa[i].getNome()) + " - Tel: " + this.pessoa[i].getTel()
                    + "\n";
        }
        return str;
    }
}
