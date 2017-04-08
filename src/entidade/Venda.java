package entidade;

import java.util.Date;

public class Venda {
    //###############################################
    //Atributos da classe
    private int codigo;
    private Date dataVenda;
    private float valorVenda;
    private String descrição;
    
    //###############################################
    //Construtor

    public Venda() {
    }

    public Venda(int codigo, Date dataVenda, float valorVenda, String descrição) {
        this.codigo = codigo;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
        this.descrição = descrição;
    }
    
    //#################################################
    //Métodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
}
