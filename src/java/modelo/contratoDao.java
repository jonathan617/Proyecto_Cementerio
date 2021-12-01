
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class contratoDao {
    
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    contrato co;
    
    public int insertarcontrato(contrato con){
        int x=0;
        try {
            ps=cnn.prepareStatement("insert into TBcontrato values(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, con.getNumContrato());
            ps.setInt(2, con.getCodempleado());
            ps.setString(3, con.getTipopagocontra());
            ps.setString(4, con.getDescripagocontra());
            ps.setInt(5, con.getCantpagocontra());
            ps.setInt(6, con.getSalariocontra());
            ps.setString(7, con.getFecinicontra());
            ps.setString(8, con.getFecfincontra());
            ps.setString(9, con.getTipocontra());
            ps.setString(10, con.getCargocontra());
            x=ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al inserta"+ex);
        }
        return x;
    }
    public boolean actualizarcontrato(contrato contactu){
        int x=0;
        boolean r=false;
        try {
            ps=cnn.prepareStatement("update TBcontrato set TBempleado_Emple_codigo=?,Pagoconc_tipo=?,Pagoconc_descripcion=?,Pagoconc_cantidad=?,Contr_salario=?,Contr_fec_inicio=?,Contr_fec_fin=?,Contr_tipo=?,Contr_cargo=? where Contr_numero=?");
            
            ps.setInt(1, contactu.getCodempleado());
            ps.setString(2, contactu.getTipopagocontra());
            ps.setString(3, contactu.getDescripagocontra());
            ps.setInt(4, contactu.getCantpagocontra());
            ps.setInt(5, contactu.getSalariocontra());
            ps.setString(6, contactu.getFecinicontra());
            ps.setString(7, contactu.getFecfincontra());
            ps.setString(8, contactu.getTipocontra());
            ps.setString(9, contactu.getCargocontra());
            ps.setInt(10, contactu.getNumContrato());
            x=ps.executeUpdate();
            if(x>0){
                r=true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      return r;
    }
    
    public ArrayList<contrato> consultageneralcontrato(){
       ArrayList<contrato> lista=new ArrayList<>();
       try {
            ps=cnn.prepareStatement("select*from TBcontrato");
            rs=ps.executeQuery();
            while(rs.next()){
                co=new contrato(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10));
                lista.add(co);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error en la consulta"+ ex);
        }
       return lista;
    }
}
