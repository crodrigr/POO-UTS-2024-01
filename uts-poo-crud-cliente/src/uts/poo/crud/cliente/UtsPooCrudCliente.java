
import java.util.ArrayList;
import java.util.List;
import uts.poo.crud.cliente.respositories.entities.Cliente;
import uts.poo.crud.cliente.services.ClienteService;


public class UtsPooCrudCliente {
    
    
    
    public static void main(String[] args) {
        
        load();
        listaClientes();
    
        
        
    }
    
    public static void listaClientes(){
        List<Cliente> listClient=ClienteService.findAll();
        for(Cliente c: listClient){
            System.out.println("nombres: "+c.getNombre() +" "+c.getApellido());
        }
    }
    
    public static void load(){
      
        Cliente c1=new Cliente(1,"camilo","rodriguez","crodrigr@xx","2555555","xxxxxx");
        Cliente c2=new Cliente(1,"juan","rodriguez","crodrigr@xx","2555555","xxxxxx");
        Cliente c3=new Cliente(1,"pedro","rodriguez","crodrigr@xx","2555555","xxxxxx");
        Cliente c4=new Cliente(1,"maria","rodriguez","crodrigr@xx","2555555","xxxxxx");
        ClienteService.save(c1);
        ClienteService.save(c2);
        ClienteService.save(c3);
        ClienteService.save(c4);
        
    
    
    
    }
    
}
