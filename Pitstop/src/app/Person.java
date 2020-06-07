package app;

public class Person {

    private String nome;
    private String tel;

    public Person(String nome, String tel) {
        this.nome = nome;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Person [nome=" + nome + ", tel=" + tel + "]";
    }

   

    

}