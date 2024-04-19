
import java.util.ArrayList;
import java.util.List;
import uts.poo.crud.cliente.respositories.entities.Cliente;
import uts.poo.crud.cliente.services.ClienteService;
import uts.poo.crud.cliente.views.ViewMain;


public class UtsPooCrudCliente {
    
    
    
    public static void main(String[] args) {
        
        load();
        listaClientes();
        ViewMain vmain=new ViewMain();
        vmain.setVisible(true);
        vmain.loadJTableCliente();
    
        
        
    }
    
    public static void listaClientes(){
        List<Cliente> listClient=ClienteService.findAll();
        for(Cliente c: listClient){
            System.out.println("nombres: "+c.getNombre() +" "+c.getApellido());
        }
    }
    
    public static void load(){
      
        Cliente c1=new Cliente(1,"camilo","rodriguez","crodrigr@xx","2555555","xxxxxx");
        Cliente c2=new Cliente(2,"juan","rodriguez","crodrigr@xx","2555555","xxxxxx");
        Cliente c3=new Cliente(3,"pedro","rodriguez","crodrigr@xx","2555555","xxxxxx");
        Cliente c4=new Cliente(4,"maria","rodriguez","crodrigr@xx","2555555","xxxxxx");
        ClienteService.save(c1);
        ClienteService.save(c2);
        ClienteService.save(c3);
        ClienteService.save(c4);
        
    
    
    
    }
    
}
