package entidade;

public class Higiene {
    //###############################################
    //Atributos da classe
    private int codigo;
    private float valorBanho;
    private float valorTosa;
    private float valorBanhoTosa;
    
    //###############################################
    //Construtor

    public Higiene() {
    }

    public Higiene(int codigo, float valorBanho, float valorTosa, float valorBanhoTosa) {
        this.codigo = codigo;
        this.valorBanho = valorBanho;
        this.valorTosa = valorTosa;
        this.valorBanhoTosa = valorBanhoTosa;
    }
    
    //###############################################
    //Métodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getValorBanho() {
        return valorBanho;
    }

    public void setValorBanho(float valorBanho) {
        this.valorBanho = valorBanho;
    }

    public float getValorTosa() {
        return valorTosa;
    }

    public void setValorTosa(float valorTosa) {
        this.valorTosa = valorTosa;
    }

    public float getValorBanhoTosa() {
        return valorBanhoTosa;
    }

    public void setValorBanhoTosa(float valorBanhoTosa) {
        this.valorBanhoTosa = valorBanhoTosa;
    }
    
}
