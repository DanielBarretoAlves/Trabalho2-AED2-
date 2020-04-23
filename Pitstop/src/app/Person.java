package app;

public class Person<T> {
    private String nome;
    private int tel;    

    public Person(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
    }

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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }


    
}