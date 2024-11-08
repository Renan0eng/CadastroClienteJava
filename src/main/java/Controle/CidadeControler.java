package Controle;

import entidades.Cidade;
import facade.CidadeFacade;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CidadeControler {
    
    private Cidade cidade = new Cidade();
    
    @EJB
    private CidadeFacade cidadeFacade;

    public void salvar() {      
        cidadeFacade.salvar(cidade);        
        cidade = new Cidade(); 
    }
    
    public void remover(Cidade cidade) {
        cidadeFacade.remover(cidade);
    }
    
    public String editar(Cidade cidade) {
        this.cidade = cidade;
        return "index";
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Cidade> getListaCidades() {
        return cidadeFacade.listaTodos();
    }
    
    public void novo(){
         this.cidade = new Cidade();
    }
    
}
