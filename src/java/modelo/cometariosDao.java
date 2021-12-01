
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class cometariosDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    comentarios co;
    
    public int insertarcomentario(comentarios com){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBcomentariossanitarios values(?,?,?,?)");
            ps.setInt(1, com.getCodigo());
            ps.setInt(2, com.getCodigovisita());
            ps.setString(3, com.getFecha());
            ps.setString(4, com.getDescripcion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
    public boolean actualizarcomentario(comentarios comactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update TBcomentariossanitarios set Tbingreso_ingres_codigo=?,comsani_fecha=?,Comsani_descripcion=? where comsani_codigo=?");
            
            ps.setInt(1, comactu.getCodigovisita());
            ps.setString(2, comactu.getFecha());
            ps.setString(3, comactu.getDescripcion());
            ps.setInt(4, comactu.getCodigo());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    public ArrayList<comentarios> consultageneralcomentario(){
       ArrayList<comentarios> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from TBcomentariossanitarios");
            rs=ps.executeQuery();
            while(rs.next()){
                co=new comentarios(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                lista.add(co);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
