package app;

public class Queue<T> extends StaticStructure<T> {

    public Queue()
    {
        super();
    }
    public Queue(int capacity)
    {
        super(capacity);
    }

    public  void putOn(T person)
    {
        super.add(person);
    }

    public T getFirst(){
        if (this.isEmpity()) {
            return null;
        }
        return this.people[0];
    }

    public T remove()
    {
        if (this.isEmpity()) {
            return null;
        }
        for (int i = 0; i < this.size -1; i++) {
            this.people[i] = this.people[i+1];
        }
        this.size--;
        return this.people[0];
    }

}