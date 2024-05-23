
package co.edu.uts.appfactura.services.impl;

import co.edu.uts.appfactura.repositories.RepositoryFactura;
import co.edu.uts.appfactura.repositories.entities.Factura;
import co.edu.uts.appfactura.services.ServiceFactura;
import java.util.List;



public class ServiceFacturaImpl implements ServiceFactura {

  private final RepositoryFactura repositoryFacturaMysql;


  public ServiceFacturaImpl(RepositoryFactura repositoryFacturaMysql) {
    this.repositoryFacturaMysql = repositoryFacturaMysql;

  }

  @Override
  public List<Factura> listar() {
    return this.repositoryFacturaMysql.listar();

  }

  @Override
  public void crear(Factura factura) {
      try {
          guardarEnMysql(factura);
      } catch (Exception e) {
         e.printStackTrace();
      }
  }
  
 
  
  private void guardarEnMysql(Factura factura) throws Exception {
      this.repositoryFacturaMysql.crear(factura);
  }
  
  
  

}
