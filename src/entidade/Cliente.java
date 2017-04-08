
package entidade;

public class Cliente {
    //#########################################################
    //Os atributos da classe
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    
    //##########################################################
    //Construtor
    public Cliente() {
    }
    public Cliente(int codigo, String nome, String cpf, String telefone, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
        
    //##########################################################
    //Os métodos

    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }   
}
