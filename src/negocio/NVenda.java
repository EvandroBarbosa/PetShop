package negocio;

import entidade.Venda;
import java.util.List;
import persistencia.PVenda;

public class NVenda {
    PVenda pVenda;
    
    //###################################################
    //Construtor
    public NVenda(PVenda pVenda) {
        this.pVenda = pVenda;
    }
    
    //####################################################
    //Métodos 
    public void salvar(Venda venda) throws Exception{
        if (validar(venda)) {
            if (venda.getCodigo() == 0) {
               pVenda.incluir(venda);
            }else{
                pVenda.alterar(venda);
            }
        }
    }
    
    public void exvluir(int codigo){
        pVenda.excluir(codigo);
    }
    
    public Venda consultar(int codigo){
        return pVenda.consultar(codigo);
    }
    
    public List<Venda> list(Venda venda){
        return pVenda.listar(venda);
    }

    private boolean validar(Venda venda) throws Exception {
        
        if (venda.getDataVenda() == null) {
            throw new Exception("É necessario informar a data");
        }
        
        if (venda.getValorVenda() == 0) {
            throw new Exception("É necessario informar o valor da venda");
        }
        return false;
        
    }
}
