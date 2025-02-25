public class PessoaJuridica extends Cliente {

    private String cnpj;
    private int numFuncionarios;
    private String setor;

    PessoaJuridica(String nome, String endereco, String cnpj, int numFuncionarios, String setor){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void imprimir() {
        System.out.println("==== Dados da conta ====");
        System.out.println("Nome...........: " + this.getNome());
        System.out.println("CNPJ...........: " + this.cnpj);
        System.out.println("Setor..........: " + this.setor);
        System.out.println("Endereco.......: " + this.getEndereco()+"\n");
    }

}