package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Categoria;

public class ControladorCategoria {
    
    public boolean agregar(Categoria categoria)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO Categoria (NOMBRE, HABILITADO) VALUES (?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, categoria.getNombre());
            st.setInt(2, categoria.isHabilitado()?1:0);
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public boolean actualizar(Categoria categoria)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "UPDATE Categoria SET nombre=?, habilitado=? WHERE id=?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, categoria.getNombre());
            st.setInt(2, categoria.isHabilitado()?1:0);
            st.setInt(3, categoria.getId());
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public Categoria buscarPorId(int id)
    {
        Categoria categoria = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria WHERE id = ?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                categoria = new Categoria();
                categoria.setId(id);
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return categoria; 
    }
    public boolean eliminar(int id)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM Categoria WHERE ID = ?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);

            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public ArrayList<Categoria> listarTodo()
    {
        ArrayList<Categoria> listado = new ArrayList<Categoria>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM Categoria";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id"));
                categoria.setNombre(rs.getString("nombre"));
                categoria.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(categoria);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado; 
    }
}
