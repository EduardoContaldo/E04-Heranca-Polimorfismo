public class PessoaFisica extends Cliente{
    private int idade;
    private String cpf;
    private char sexo;

    PessoaFisica(String nome, String endereco, int idade, String cpf, char sexo){
        super(nome, endereco);
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void imprimir() {
        System.out.println("==== Dados da conta ====");
        System.out.println("Nome...........: " + this.getNome());
        System.out.println("CPF............: " + this.cpf);
        System.out.println("Idade..........: " + this.idade);
        System.out.println("Endereco.......: " + this.getEndereco()+"\n");
    }

}


