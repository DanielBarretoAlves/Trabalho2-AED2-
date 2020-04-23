package app;

public class Person<T> {
    String nome;

    public Person(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Person [nome=" + nome + "]";
    }
    
}