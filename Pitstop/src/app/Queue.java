package app;
//TODO: Create Log Atributte
public class Queue<T> extends StaticStructure<T> {

    public Queue() {
        super();
    }

    public Queue(int capacity) {
        super(capacity);
    }

    //TODO: Concatenae Log dentro de todos os Metodos
    public void putOn(T person)// --------------ADD UMA PESSOA NA FILA
    {
        super.add(person);
    }

    public T getFirst() { // ----------------------RETORNA QUEM ENTROU PRIMEIRO NA FILA
        if (this.isEmpity()) {
            return null;
        }
        return this.people[0];
    }

    public T remove() // -------------------------QUEM CHEGOU PRIMEIRO SIA DA FILA
    {
        if (this.isEmpity()) {
            return null;
        }
        for (int i = 0; i < this.size - 1; i++) {
            this.people[i] = this.people[i + 1];
        }
        this.size--;
        return this.people[0];
    }

    //TODO: First person on the queue have to get their Ticket personTicket()
}