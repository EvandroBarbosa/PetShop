package entidade;

public class TipoProduto {
    //#############################################
    //Atributos
    private int codigo;
    private String descricao;
    
    //#############################################
    //Construtor

    public TipoProduto() {
    }

    public TipoProduto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    
    //##############################################
    //Métodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
