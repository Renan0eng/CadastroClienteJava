package Controle;

import entidades.Estado;
import facade.EstadoFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EstadoControler {
    
    private Estado estado = new Estado();
    
    @EJB
    private EstadoFacade estadoFacade;

    public void salvar() {      
        estadoFacade.salvar(estado);        
        estado = new Estado(); 
    }
    
    public void remover(Estado estado) {
        estadoFacade.remover(estado);
    }
    
    public String editar(Estado estado) {
        this.estado = estado;
        return "index";
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Estado> getListaEstados() {
        return estadoFacade.listaTodos();
    }
    
    public void novo(){
         this.estado = new Estado();
    }
    
}
