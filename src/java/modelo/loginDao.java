
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class loginDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<login> LoginDao(login lo){
        ArrayList<login> lista =new ArrayList<>();
        try {
            ps=cnn.prepareStatement("select Usua_codigo,Usua_rol,Usua_user,Usua_clave,Usua_nombre from Tbusuario where Usua_user=? && Usua_clave=?");
            ps.setString(1, lo.getUsuario());
            ps.setString(2, lo.getClave());
            rs=ps.executeQuery();
            if(rs.next()){
            login log=new login(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            lista.add(log);
            }
            JOptionPane.showMessageDialog(null, lista);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error el login");
        }
        return lista;
    }
}
