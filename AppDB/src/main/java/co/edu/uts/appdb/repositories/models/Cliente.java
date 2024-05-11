
package co.edu.uts.appdb.repositories.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    private int    id;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String celular;   
    private String documento;



    public Cliente(String nombre, String apellido, String email, String direccion, String celular, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.celular = celular;
        this.documento = documento;
    }
    
    

    
    
    
    
}
