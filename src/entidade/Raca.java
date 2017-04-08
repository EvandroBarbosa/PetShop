package entidade;

public class Raca {
    //#################################################
    //Atributos da classe
    private int codigo;
    private String descricao;
    
    //##################################################
    //Construtor

    public Raca() {
    }

    public Raca(String descricao) {
        this.descricao = descricao;
    }
    
    //##################################################
    //Métodos

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
