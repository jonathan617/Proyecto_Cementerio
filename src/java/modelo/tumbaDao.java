
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class tumbaDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    tumba tu;
    
    public int insertartumba(tumba tum){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into Tbtumba values(?,?,?)");
            ps.setInt(1, tum.getCodigo());
            ps.setInt(2, tum.getCodigoemp());
            ps.setString(3, tum.getUbicacion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
    public boolean actualizartumba(tumba tumactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update Tbtumba set Tbempleado_Emple_codigo=?,Tumba_ubicacion=? where Tumba_codigo=?");
            
            ps.setInt(1, tumactu.getCodigoemp());
            ps.setString(2, tumactu.getUbicacion());
            ps.setInt(3, tumactu.getCodigo());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    public ArrayList<tumba> consultageneraltumba(){
       ArrayList<tumba> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from Tbtumba");
            rs=ps.executeQuery();
            while(rs.next()){
                tu=new tumba(rs.getInt(1), rs.getInt(2), rs.getString(3));
                lista.add(tu);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
