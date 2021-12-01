
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class actividadDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    actividad ac;
    
    public int insertaractividad(actividad act){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBactividad values(?,?,?,?)");
            ps.setInt(1, act.getCodigo());
            ps.setInt(2, act.getCodempleado());
            ps.setString(3, act.getFecha());
            ps.setString(4, act.getDescripcion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
    
    public boolean actualizaractividad(actividad actiactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update TBactividad set tbrealiza_reali_codigo=?,Act_fecha=?,acti_descri=? where Act_codigo=?");
            
            ps.setInt(1, actiactu.getCodempleado());
            ps.setString(2, actiactu.getFecha());
            ps.setString(3, actiactu.getDescripcion());
            ps.setInt(4, actiactu.getCodigo());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    
    public ArrayList<actividad> consultageneralactividad(){
       ArrayList<actividad> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from TBactividad");
            rs=ps.executeQuery();
            while(rs.next()){
                ac=new actividad(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                lista.add(ac);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
