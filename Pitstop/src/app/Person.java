package app;

public class Person<T> {
    private String nome;
    private int tel;
    private Ticket ticket;

    public Person(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
    }
    public Person(String nome, int tel, Ticket ticket){
        this.nome = nome;
        this.tel = tel;
        this.ticket = ticket;
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

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void showData()
    {
        System.out.println(getNome());
        System.out.println(getTel());
        System.out.println(ticket.showTicket());//TODO CRIAR ESSE METODO E RETORNAR UM STRING
    }

    @Override
    public String toString() {
        return "Person [nome=" + nome + ", tel=" + tel + "]";
    }

    

}