package Controle;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ClienteControler {
    
    private Cliente cliente = new Cliente();
    private List<Cliente> listaClientes = new ArrayList<>();

    public void salvar() {
       
        listaClientes.add(cliente);
        
        cliente = new Cliente(); 
    }
    
    public void remover(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
