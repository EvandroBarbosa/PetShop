package negocio;

import entidade.TipoProduto;
import java.util.List;
import persistencia.PTipoProduto;

public class NTipoProduto {
    PTipoProduto pTipoProduto;
    
    //#####################################################
    //Construtor
    public NTipoProduto(PTipoProduto pTipoProduto) {
        this.pTipoProduto = pTipoProduto;
    }
    
    //#####################################################
    //Métodos
    public void salvar(TipoProduto tipoProduto) throws Exception{
        if (validar(tipoProduto)) {
            if (tipoProduto.getCodigo() == 0) {
                pTipoProduto.incluir(tipoProduto);
            }else{
                pTipoProduto.alterar(tipoProduto);
            }
        }
    }
    
    public void excluir(int codigo){
        pTipoProduto.excluir(codigo);
    }
    
    public TipoProduto consultar(int codigo){
      return pTipoProduto.consultar(codigo);
    }
    
    public List<TipoProduto> list(TipoProduto tipoProduto){
        return pTipoProduto.listar(tipoProduto);
    }

    private boolean validar(TipoProduto tipoProduto) throws Exception {
        
        if (tipoProduto.getDescricao() == null) {
            throw new Exception("É necessario preencher o tipo de produto");
        }
        
        if (tipoProduto.getDescricao().isEmpty()) {
            throw new Exception("É necessario preencher o tipo de produto");
        }
        return false;
       
    }
}
