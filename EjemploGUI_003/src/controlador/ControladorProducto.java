package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Producto;

public class ControladorProducto {
    
    public boolean agregar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Producto (IDMARCA, IDCATEGORIA, CODIGO, DESCRIPCION, STOCK, PRECIOCOSTO, PRECIOVENTA) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, producto.getIdMarca());
            st.setInt(2, producto.getIdCategoria());
            st.setLong(3, producto.getCodigo());
            st.setString(4, producto.getDescripcion());
            st.setInt(5, producto.getStock());
            st.setInt(6, producto.getPrecioCosto());
            st.setInt(7, producto.getPrecioVenta());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public boolean actualizar(Producto producto)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Producto SET idMarca=?, idCategoria=?, codigo=?, descripcion=?, stock=?, precioCosto=?, precioVenta=? WHERE id=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, producto.getIdMarca());
            st.setInt(2, producto.getIdCategoria());
            st.setLong(3, producto.getCodigo());
            st.setString(4, producto.getDescripcion());
            st.setInt(5, producto.getStock());
            st.setInt(6, producto.getPrecioCosto());
            st.setInt(7, producto.getPrecioVenta());
            st.setInt(8, producto.getId());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public Producto buscarPorId(int id)
    {
        Producto producto = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT idMarca, idCategoria, codigo, descripcion, stock, precioCosto, precioVenta FROM Producto WHERE id = ?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                producto = new Producto();
                producto.setId(id);
                producto.setIdMarca(rs.getInt("idMarca"));
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecioCosto(rs.getInt("precioCosto"));
                producto.setPrecioVenta(rs.getInt("precioVenta"));
                
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return producto; 
    }
    public boolean eliminar(int id)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Producto WHERE ID = ?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);

            int resultado = st.executeUpdate();
            st.close();
            cx.close();
            return resultado == 1;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public ArrayList<Producto> listarTodo()
    {
        ArrayList<Producto> listado = new ArrayList<Producto>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, idMarca, idCategoria, codigo, descripcion, stock, precioCosto, precioVenta FROM Producto";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Producto producto = new Producto();
                producto.setId(rs.getInt("id"));
                producto.setIdMarca(rs.getInt("idMarca"));
                producto.setIdCategoria(rs.getInt("idCategoria"));
                producto.setCodigo(rs.getLong("codigo"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setStock(rs.getInt("stock"));
                producto.setPrecioCosto(rs.getInt("precioCosto"));
                producto.setPrecioVenta(rs.getInt("precioVenta"));
                listado.add(producto);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado; 
    }
}
