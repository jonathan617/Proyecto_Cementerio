
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PQRSDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    PQRS pq;
    
    public int insertarPQRS(PQRS pqrs){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TbPQRS values(?,?,?,?)");
            ps.setInt(1, pqrs.getCodigo());
            ps.setInt(2, pqrs.getCodigovis());
            ps.setString(3, pqrs.getFecha());
            ps.setString(4, pqrs.getDescripcion());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
    public boolean actualizarPQRS(PQRS pqrsactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update TbPQRS set Tbregistra_Regis_codigo=?,PQRS_fecha=?,PQRS_descripcion=? where PQRS_codigo=?");
            
            ps.setInt(1, pqrsactu.getCodigovis());
            ps.setString(2, pqrsactu.getFecha());
            ps.setString(3, pqrsactu.getDescripcion());
            ps.setInt(4, pqrsactu.getCodigo());

            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    public ArrayList<PQRS> consultageneralPQRS(){
       ArrayList<PQRS> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from TbPQRS");
            rs=ps.executeQuery();
            while(rs.next()){
                pq=new PQRS(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                lista.add(pq);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
