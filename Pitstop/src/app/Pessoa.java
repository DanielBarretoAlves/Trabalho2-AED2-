public class Pessoa {
    private String nome;
    private int idade;
    private String tel;
    private String log;
    private Ticket t;

    public Pessoa(String nome, int idade, String tel, Ticket t) {
        this.nome = nome;
        this.idade = idade;
        this.tel = tel;
        this.t = t;
    }

    public Pessoa(String nome, int idade, String tel) {
        this.nome = nome;
        this.idade = idade;
        this.tel = tel;
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getLog() {
        return log;
    }

}