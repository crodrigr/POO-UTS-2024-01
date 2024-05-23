
package co.edu.uts.appfactura;

import co.edu.uts.appfactura.repositories.RepositoryCliente;
import co.edu.uts.appfactura.repositories.RepositoryFactura;
import co.edu.uts.appfactura.repositories.RepositoryProducto;
import co.edu.uts.appfactura.repositories.entities.Cliente;
import co.edu.uts.appfactura.repositories.entities.Factura;
import co.edu.uts.appfactura.repositories.entities.ItemFactura;
import co.edu.uts.appfactura.repositories.entities.Producto;
import co.edu.uts.appfactura.repositories.impl.RepositoryClienteImpl;
import co.edu.uts.appfactura.repositories.impl.RepositoryFacturaMysqlImpl;
import co.edu.uts.appfactura.repositories.impl.RepositoryProductoMysqlImpl;
import co.edu.uts.appfactura.services.ServiceCliente;
import co.edu.uts.appfactura.services.ServiceFactura;
import co.edu.uts.appfactura.services.ServiceProducto;
import co.edu.uts.appfactura.services.impl.ServiceClienteImpl;
import co.edu.uts.appfactura.services.impl.ServiceFacturaImpl;
import co.edu.uts.appfactura.services.impl.ServiceProductoImpl;
import java.time.LocalDateTime;
import java.util.List;

public class AppFactura {

    public static void main(String[] args) {
        
        RepositoryCliente repositoryCliente=new RepositoryClienteImpl();
        ServiceCliente serviceCliente=new ServiceClienteImpl(repositoryCliente);
        RepositoryProducto repositoryProducto=new RepositoryProductoMysqlImpl();
        ServiceProducto serviceProdcuto=new ServiceProductoImpl(repositoryProducto);
        RepositoryFactura repositoryFactura=new RepositoryFacturaMysqlImpl();
        ServiceFactura serviceFactura=new ServiceFacturaImpl(repositoryFactura);
        
        /*Cliente cliente=new Cliente();
        cliente.setNombre("Camilo");
        cliente.setNombre("Rodriguez");
        cliente.setCelular("3485858585");
        cliente.setDireccion("xxxxxx");
        cliente.setEmail("crodrigr@gmail.com");        
        serviceCliente.crear(cliente);*/
        
        /*Cliente cliente= serviceCliente.findById(4);
        cliente.setApellido("Rodriguez");
        cliente.setNombre("Juan");
        System.out.println(cliente.getNombre()+" "+cliente.getApellido());
        serviceCliente.editar(cliente);*/
        
    
        
        try{ 
             
             Cliente c1=serviceCliente.findById(1);
            
             Producto p1=serviceProdcuto.porCodigo(1);
             Producto p2=serviceProdcuto.porCodigo(2);
             Producto p3=serviceProdcuto.porCodigo(3);             
             ItemFactura item1=new ItemFactura(1,p1);
             ItemFactura item2=new ItemFactura(1,p2);
             ItemFactura item3=new ItemFactura(1,p3);
             Factura factura=new Factura(3,LocalDateTime.now(),c1);
             factura.agregarItem(item1);
             factura.agregarItem(item2);
             factura.agregarItem(item3);
             serviceFactura.crear(factura);
        
        }catch(Exception e){
          System.out.println("error"+e);
        }
    
        
        
           //Lista todas la facturas
        /*List<Factura> facturas=serviceFactura.listar();        
        for(Factura factura:facturas){
           factura.display();
        }*/
        
        
        
        
       
        
    }
}
