
package negocio;

import entidade.Animal;
import java.util.List;
import persistencia.PAnimal;

public class NAnimal {
    PAnimal pAnimal;

    //#############################################
    //Construtor
    public NAnimal(PAnimal pAnimal) {
        this.pAnimal = pAnimal;
    }
    
    //#############################################
    //Métodos para validar as informaçoes vinda do banco
    //Validar o incluir e o alterar
    public void salvar(Animal animal) throws Exception{
        if (validarI(animal)) {
            if (animal.getCodigo() == 0) {
                pAnimal.incluir(animal);
            }else{
                pAnimal.alterar(animal);
            }
        }
    }
    
    public void excluir(int codigo){
        pAnimal.excluir(codigo);
    }
    
    public Animal consultar(int codigo){       
        return pAnimal.consultar(codigo);
    }
    
    public List<Animal> list(Animal animal){
        return pAnimal.listar(animal);
    }

    private boolean validarI(Animal animal) throws Exception {
        if (animal.getNomeAnimal() == null) {
            throw new Exception("É necessario preecher o nome do animal");
        }
        
        if (animal.getNomeAnimal().isEmpty()) {
            throw new Exception("É necessario preecher o nome do animal");
        }
        
        if (animal.getPorte() == null) {
            throw new Exception("É necessario informar porte do animal");
        }
        
        if (animal.getPorte().isEmpty()) {
            throw new Exception("É necessario informar porte do animal");
        }
        
        if (animal.getDataNascimento() == null) {
            throw new Exception("É necessario informar a data de nascimento do animal");
        }
        
        if (animal.getDescricao() == null) {
            throw new Exception("É necessario informar a raça do animal");
        }
        
        if (animal.getDescricao().isEmpty()) {
             throw new Exception("É necessario informar a raça do animal");
        }
        return false;
    }
}
