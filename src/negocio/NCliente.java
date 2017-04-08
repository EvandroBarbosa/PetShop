package negocio;

import entidade.Cliente;
import java.util.List;
import persistencia.PCliente;

public class NCliente {
    PCliente pCliente;
    
    //########################################################
    //Construtor
    public NCliente(PCliente pCliente) {
        this.pCliente = pCliente;
    }
    
    //########################################################
    //Métodos de validação
    public void salvar(Cliente cliente) throws Exception{
        if (validar(cliente)) {
            if (cliente.getCodigo()== 0) {
                pCliente.incluir(cliente);
            }else{
                pCliente.alterar(cliente);
            }
        }
    }
    
    public Cliente consultar(int codigo){
        return pCliente.consultar(codigo);
    }
    
    public void excluir(int codigo){
        pCliente.excluir(codigo);
    }
    
    public List<Cliente> list(Cliente cliente){
        return pCliente.listar(cliente);
    }

    private boolean validar(Cliente cliente) throws Exception {
        if (cliente.getNome() == null) {
            throw  new Exception("É necessario preencher o nome");
        }
        
        if (cliente.getNome().isEmpty()) {
            throw  new Exception("É necessario preencher o nome");
        }
        
        if (cliente.getCpf() == null) {
            throw new Exception("É necessario preencher o CPF");
        }
        
        if (cliente.getCpf().isEmpty()) {
            throw new Exception("É necessario preencher o CPF");
        }
        
        if (cliente.getTelefone() == null) {
            throw new Exception("É necessario preencher o telefone");
        }
        
        if (cliente.getTelefone().isEmpty()) {
            throw new Exception("É necessario preencher o telefone");
        }
        
        if (cliente.getEndereco() == null) {
            throw new Exception("É necessario preencher o endereço");
        }
        
        if (cliente.getEndereco().isEmpty()) {
            throw new Exception("É necessario preencher o endereço");
        }
        return false;
    }
}
