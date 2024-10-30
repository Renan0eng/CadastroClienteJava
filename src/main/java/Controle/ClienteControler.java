package Controle;

import entidades.Cliente;
import facade.ClienteFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClienteControler {
    
    private Cliente cliente = new Cliente();
    
    @EJB
    private ClienteFacade clienteFacade;

    public void salvar() {      
        clienteFacade.salvar(cliente);        
        cliente = new Cliente(); 
    }
    
    public void remover(Cliente cliente) {
        clienteFacade.remover(cliente);
    }
    
    public String editar(Cliente cliente) {
        this.cliente = cliente;
        return "index";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaClientes() {
        return clienteFacade.listaTodos();
    }
    
}
