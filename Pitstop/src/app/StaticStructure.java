package app;

public class StaticStructure<T> {
    protected T[] people;
    protected int size;

    public StaticStructure(int capacity) {
        this.people = (T[]) new Object[capacity];
        this.size = 0;
    }

    public StaticStructure() {
        this(5);
    }

    protected boolean isEmpity() {
        return this.size == 0;
    }

    protected boolean add(T person) {
        this.expands();
        if (this.size < this.people.length) {
            this.people[this.size] = person;
            this.size++;
            return true;
        }

        return false;
    }

    protected boolean add(int pos, T person) {
        if (!(pos >= 0 && pos < this.size)) {
            throw new IllegalArgumentException("Posição Invalida");
        }
        // move everybody
        for (int i = 0; i < this.size; i++) {
            this.people[i + 1] = this.people[i];
        }
        this.people[pos] = person;
        this.size++;
        return true;
    }

    protected void expands() { // ------------AUMENTA O ARRAY
        if (this.size == this.people.length) {
            T[] newLine = (T[]) new Object[this.people.length * 3 / 2];
            for (int i = 0; i < people.length; i++) {
                newLine[i] = this.people[i];
            }
            this.people = newLine;
        }
    }

    public int getSize() // --------------RETRONA O TAMANHO DE USO DO ARRAY EM INT
    {
        return this.size;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size - 1; i++) {
            s.append(this.people[i]);
            s.append(", ");
        }

        if (this.size > 0) {
            s.append(this.people[this.size - 1]);
        }

        s.append("]");

        return s.toString();
    }

}