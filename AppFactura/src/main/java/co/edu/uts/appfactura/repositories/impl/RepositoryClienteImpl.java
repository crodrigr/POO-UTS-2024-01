package co.edu.uts.appfactura.repositories.impl;

import co.edu.uts.appfactura.repositories.RepositoryCliente;
import co.edu.uts.appfactura.repositories.entities.Cliente;
import co.edu.uts.appfactura.utils.db.ConexionDBMysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RepositoryClienteImpl implements RepositoryCliente {

    private Connection getConnection() throws SQLException {
        return ConexionDBMysql.getConexion();
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> listClientes = new ArrayList<>();

        try (Statement stmt = getConnection().createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM clientes");) {
            while (rs.next()) {
                listClientes.add(crearCliente(rs));
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());

        }

        return listClientes;

    }

    @Override
    public Cliente findById(int id) {
        Cliente cliente = null;

        try (PreparedStatement stmt = getConnection()
                .prepareStatement("SELECT * FROM clientes WHERE id=?")) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    cliente = crearCliente(rs);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return cliente;

    }

    @Override
    public Cliente crear(Cliente cliente) {
        String sql = "INSERT INTO clientes(nombre, apellido,email,direccion,celular,documento) "
                + "VALUES(?,?,?,?,?,?)";

        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getCelular());
            stmt.setString(6, cliente.getDocumento());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return cliente;
    }

    @Override
    public void editar(Cliente cliente) {
        String sql = "UPDATE clientes SET nombre=?, apellido=?, email=?, "
                + "direccion=?, celular=? WHERE id=?";
        try (PreparedStatement stmt = getConnection().prepareStatement(sql)) {
            stmt.setString(1, cliente.getNombre());
            stmt.setString(2, cliente.getApellido());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getDireccion());
            stmt.setString(5, cliente.getCelular());
            stmt.setInt(6, cliente.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    @Override
    public void eliminar(Cliente cliente) {
        try (PreparedStatement stmt = getConnection()
                .prepareStatement("DELETE FROM clientes WHERE id=?")) {
            stmt.setInt(1, cliente.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private Cliente crearCliente(ResultSet rs) throws SQLException {
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
