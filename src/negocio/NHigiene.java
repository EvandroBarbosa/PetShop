package negocio;

import entidade.Higiene;
import java.util.List;
import persistencia.PHigiene;

public class NHigiene {
    PHigiene pHigiene;
    
    //#########################################################
    //Construtor
    public NHigiene(PHigiene pHigiene) {
        this.pHigiene = pHigiene;
    }
    
    //#########################################################
    //Métodos de validação
    public void salvar(Higiene higiene) throws Exception{
        if (validar(higiene)) {
            if (higiene.getCodigo() == 0) {
                pHigiene.incluir(higiene);
            }else{
                pHigiene.alterar(higiene);
            }
        }
    }
    
    public void excluir(int codigo){
        pHigiene.excluir(codigo);
    }
    
    public Higiene consultar(int codigo){
        return pHigiene.consultar(codigo);
    }
    
    public List<Higiene> list(Higiene higiene){
        return pHigiene.listar(higiene);
    }
    
    private boolean validar(Higiene higiene) throws Exception {
        if (higiene.getValorBanho() == 0) {
            throw new Exception("É necessario informar um valor");
        }
        
        if (higiene.getValorTosa() == 0) {
            throw new Exception("É necessario informar um valor");
        }
        
        if (higiene.getValorBanho() == 0) {
            throw new Exception("É necessario informar um valor");
        }
        return false;
        
    }
}
