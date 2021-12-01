package modelo;

import controlador.Conexion;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;

public class UsuarioDao {
    
    Conexion con = new Conexion();
    Connection cnn = con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Usuario us;
    
    public int Insertar_Usuario(Usuario usu) {
        int x=0;
        
        try {
            ps = cnn.prepareStatement("INSERT INTO tbusuario VALUES(?,?,?,?,?)");
            ps.setInt(1, usu.getCodigo_Usuario());
            ps.setString(2, usu.getNombre_Usuario());
            ps.setString(3, usu.getRol_Usuario());
            ps.setString(4, usu.getUser_Usuario());
            ps.setString(5, usu.getClave_Usuario());
            
            
            x = ps.executeUpdate();
            

            JOptionPane.showMessageDialog(null, "Datos ok");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar" + e);
        }
        return x;

    }
    public boolean actualizarusuario(Usuario usuactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update tbusuario set Usua_nombre=?,Usua_rol=?,Usua_user=?,Usua_clave=? where Usua_codigo=?");
            
            ps.setString(1, usuactu.getNombre_Usuario());
            ps.setString(2, usuactu.getRol_Usuario());
            ps.setString(3, usuactu.getUser_Usuario());
            ps.setString(4, usuactu.getClave_Usuario());
            ps.setInt(5, usuactu.getCodigo_Usuario());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    
    public ArrayList<Usuario> consultageneralUsuario(){
       ArrayList<Usuario> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from Tbusuario");
            rs=ps.executeQuery();
            while(rs.next()){
                us=new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5));
                lista.add(us);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
    

}