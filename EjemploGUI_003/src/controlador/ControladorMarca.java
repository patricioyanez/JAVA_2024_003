package controlador;
import BDD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Marca;

public class ControladorMarca {
    
    public boolean agregar(Marca marca)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "INSERT INTO MARCA (NOMBRE, HABILITADO) VALUES (?,?)";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setInt(2, marca.getHabilitado()?1:0);
            st.executeUpdate();
            st.close();
            cx.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;        
    }
    
    public Marca buscarPorId(int id)
    {
        Marca marca = null;
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM MARCA WHERE id = ?";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                marca = new Marca();
                marca.setId(id);
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return marca; 
    }
    public boolean eliminar(int id)
    {
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "DELETE FROM MARCA WHERE ID = ?";
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
    
    public ArrayList<Marca> listarTodo()
    {
        ArrayList<Marca> listado = new ArrayList<Marca>();
        try {
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();
            String sql = "SELECT id, nombre, habilitado FROM MARCA";
            PreparedStatement st;
            st = cx.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Marca marca = new Marca();
                marca.setId(rs.getInt("id"));
                marca.setNombre(rs.getString("nombre"));
                marca.setHabilitado(rs.getInt("habilitado")==1);
                listado.add(marca);
            }
            st.close();
            cx.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado; 
    }
}
