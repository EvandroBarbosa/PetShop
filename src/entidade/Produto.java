package entidade;

public class Produto {
    //##########################################
    //Atributos da classe
    private int codigo;
    private float valorProduto;
    private String nomeProduto;
    private int quantidadeProduto;
    
    //##########################################
    //Construtor

    public Produto() {
    }

    public Produto(int codigo, float valorProduto, String nomeProduto, int quantidadeProduto) {
        this.codigo = codigo;
        this.valorProduto = valorProduto;
        this.nomeProduto = nomeProduto;
        this.quantidadeProduto = quantidadeProduto;
    }
    
    //##########################################
    //Métodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
    
}
