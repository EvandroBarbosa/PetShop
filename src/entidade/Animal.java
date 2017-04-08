package entidade;

import java.util.Date;

public class Animal extends Raca{
    //######################################################
    //Atributos da classe
    private int codigo;
    private String nomeAnimal;
    private String porte;
    private Date dataNascimento;
    
    //#######################################################
    //Contrutor

    public Animal() {
    }

    public Animal(int codigo, String nomeAnimal, String porte, Date dataNascimento) {
        this.codigo = codigo;
        this.nomeAnimal = nomeAnimal;
        this.porte = porte;
        this.dataNascimento = dataNascimento;
    }
    
    //########################################################
    //Métodos

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
