import java.util.Date;

public class Cliente {

    private String nome;
    private String endereco;
    private Date data;

    Cliente(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        data = new Date();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void imprimir(){
        System.out.println("Cliente inválido");
    }


}