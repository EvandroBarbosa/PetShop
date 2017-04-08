package negocio;

import entidade.Produto;
import java.util.List;
import persistencia.PProduto;

public class NProduto {
    PProduto pProduto;
    
    //###########################################
    //Construtor
    public NProduto(PProduto pProduto) {
        this.pProduto = pProduto;
    }
    
    //###########################################
    //Métodos
    
    public void salvar(Produto produto) throws Exception{
        if (validar(produto)) {
            if (produto.getCodigo() == 0) {
                pProduto.incluir(produto);
            }else{
                pProduto.alterar(produto);
            }
        }
    }
    
    public void excluir(int codigo){
        pProduto.excluir(codigo);
    }
    
    public Produto consultar(int codigo){
        return pProduto.consultar(codigo);
    }
    
    public List<Produto> list(Produto produto){
        return pProduto.listar(produto);
    }

    private boolean validar(Produto produto) throws Exception {
        if (produto.getNomeProduto() == null) {
            throw new Exception("É necessario preencher o nome do produto");
        }
        
        if (produto.getNomeProduto().isEmpty()) {
            throw new Exception("É necessario preencher o nome do produto");
        }
        
        if (produto.getQuantidadeProduto() == 0) {
            throw new Exception("É necessario informar a quantidade de produto");
        }
        
        if (produto.getValorProduto() == 0.0) {
            throw new Exception("É necessario informar o valor dos produtos");
        }
        return false;
        
    }
}
