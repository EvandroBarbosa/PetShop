package entidade;

public class Item {
    //###########################################
    //Atributos
    private int codigo;
    private int qtdItem;
    private float precoItem;
    private float totalPeco;
    
    //##########################################
    //Construtor

    public Item() {
    }

    public Item(int codigo, int qtdItem, float precoItem, float totalPeco) {
        this.codigo = codigo;
        this.qtdItem = qtdItem;
        this.precoItem = precoItem;
        this.totalPeco = totalPeco;
    }
    
    //############################################
    //Método

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        this.precoItem = precoItem;
    }

    public float getTotalPeco() {
        return totalPeco;
    }

    public void setTotalPeco(float totalPeco) {
        this.totalPeco = totalPeco;
    }
    
}
