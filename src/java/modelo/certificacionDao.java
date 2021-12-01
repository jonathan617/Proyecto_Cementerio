
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class certificacionDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    certificacion ce;
    
    public int insertarcertificacion(certificacion cer){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBcertificadolaboral values(?,?,?)");
            ps.setInt(1, cer.getCodigo());
            ps.setInt(2, cer.getNumcontrato());
            ps.setString(3, cer.getMotivo());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
    public boolean actualizarcertificado(certificacion ceractu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update TBcertificadolaboral set TBcontrato_Contr_numero=?,Certi_motivo_retiro=? where Certi_codigo=?");
            
            ps.setInt(1, ceractu.getNumcontrato());
            ps.setString(2, ceractu.getMotivo());
            ps.setInt(3, ceractu.getCodigo());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    public ArrayList<certificacion> consultageneralcertificado(){
       ArrayList<certificacion> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from TBcertificadolaboral");
            rs=ps.executeQuery();
            while(rs.next()){
                ce=new certificacion(rs.getInt(1), rs.getInt(2), rs.getString(3));
                lista.add(ce);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
