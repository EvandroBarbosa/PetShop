package negocio;

import entidade.Item;
import java.util.List;
import persistencia.PItem;

public class NItem {
    PItem pItem;
    
    //######################################################
    //Construtor
    public NItem(PItem pItem) {
        this.pItem = pItem;
    }
    
    //######################################################
    //Métodos de validação
    public void salvar(Item item) throws Exception{
        if (validar(item)) {
            if (item.getCodigo() == 0) {
               pItem.incluir(item);
            }else{
                pItem.alterar(item);
            }
        }
    }
    
    public void excluir(int codigo){
        pItem.excluir(codigo);
    }
    
    public Item consultar(int codigo){
        return pItem.consultar(codigo);
    }
    
    public List<Item> list(Item item){
        return pItem.listar(item);
    }

    private boolean validar(Item item) throws Exception {
        if (item.getPrecoItem() == 0) {
            throw new Exception("É necessario informar um valor para item");
        }
        
        if (item.getQtdItem() == 0) {
            throw new Exception("É necessario infomar a quantidade de item");
        }
        
        if (item.getTotalPeco() == 0) {
            throw new Exception("É necessario informar o preço total dos item");
        }
        return false;
       
    }
}
