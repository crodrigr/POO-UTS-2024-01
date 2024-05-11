package co.edu.uts.appdb.repositories;

import co.edu.uts.appdb.repositories.models.Cliente;
import co.edu.uts.appdb.utils.conexionDb.ConexionDBMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryClienteImpl implements RepositoryCliente {
    
    private Connection getConnection() throws SQLException{        
        return ConexionDBMysql.getConexion();       
    }

    @Override
    public List<Cliente> listar() {
       List<Cliente> listClientes=new ArrayList<>();
       
           try(Statement stmt=getConnection().createStatement();
               ResultSet rs=stmt.executeQuery("SELECT * FROM clientes");)
           {  
               while(rs.next()){
                   listClientes.add(crearCliente(rs));
               }
           
           } catch (SQLException e){    
                  System.out.println("Error:"+e.getMessage());
            
           }
           
           return listClientes;
       
    }

    @Override
    public Cliente findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente crear(Cliente cliente) {
         String sql = "INSERT INTO clientes(nombre, apellido,email,direccion,celular,documento) VALUES(?,?,?,?,?,?)";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getCelular());
            stmt.setString(6, cliente.getDocumento());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e.getMessage());
        }
        
       
        return cliente;
    }

    @Override
    public Cliente editar(Cliente cliente, int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private Cliente crearCliente(ResultSet rs)throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(rs.getInt("id"));
        cliente.setNombre(rs.getString("nombre"));
        cliente.setApellido(rs.getString("apellido"));
        cliente.setEmail(rs.getString("email"));
        cliente.setDireccion(rs.getString("direccion"));
        cliente.setCelular(rs.getString("celular"));
        cliente.setDocumento(rs.getString("documento"));
        return cliente;

    }
    
}
