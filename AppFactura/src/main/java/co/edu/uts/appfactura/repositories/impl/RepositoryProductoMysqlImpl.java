
package co.edu.uts.appfactura.repositories.impl;

import co.edu.uts.appfactura.repositories.RepositoryProducto;
import co.edu.uts.appfactura.repositories.entities.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.uts.appfactura.utils.db.ConexionDBMysql;



public class RepositoryProductoMysqlImpl implements RepositoryProducto {

    private Connection getConnection() throws SQLException {
        return ConexionDBMysql.getConexion();
    }

    @Override
    public List<Producto> listar() {
         List<Producto> listProducto = new ArrayList<>();

        try (Connection conn = getConnection();
            Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM producto")) {
            while (rs.next()) {
                listProducto.add(crearProducto(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listProducto;
       
    }

    @Override
    public Producto porCodigo(int codigo) {
        Producto producto = null;

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM producto WHERE codigo=?")) {
            stmt.setInt(1, codigo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    producto = crearProducto(rs);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return producto;
    
    }

    @Override
    public void crear(Producto producto) {
        String sql = "INSERT INTO producto(nombre, descripcion,precioVenta,precioCompra) VALUES(?,?,?,?)";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getDescripcion());
            stmt.setDouble(3, producto.getPrecioVenta());
            stmt.setDouble(4, producto.getPrecioCompra());           
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    
    }

    @Override
    public void editar(Producto producto) {       
        String sql = "UPDATE producto SET nombre=?, descripcion=?,precioVenta=?,precioCompra=? WHERE codigo=? ";

        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getDescripcion());
            stmt.setDouble(3, producto.getPrecioVenta());
            stmt.setDouble(4, producto.getPrecioCompra());
            stmt.setInt(5,producto.getCodigo());           
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void eliminar(Producto producto) {
        try (Connection conn = getConnection();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM producto WHERE codigo=?")) {
            stmt.setInt(1, producto.getCodigo());
            stmt.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private Producto crearProducto(ResultSet rs) throws SQLException {
        Producto producto = new Producto();
        producto.setCodigo(rs.getInt("codigo"));
        producto.setNombre(rs.getString("nombre"));
        producto.setDescripcion(rs.getString("descripcion"));
        producto.setPrecioVenta(rs.getDouble("precioVenta"));
        producto.setPrecioCompra(rs.getDouble("precioCompra"));
        return producto;

    }


   

}
