
package modelo;

import modelo.Novedad;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NovedadDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Novedad no;
    
    public int insertarNovedad(Novedad no){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO TBnovedad VALUES(?,?,?,?,?)");
            ps.setInt(1,no.getCodnove());
            ps.setInt(2,no.getCodemple());
            ps.setString(3,no.getFecnove());
            ps.setString(4,no.getDescrinove());
            ps.setString(5,no.getEstnove());
            
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    }
    public ArrayList<Novedad> consultageneralNovedad(){
        ArrayList<Novedad> lista=new ArrayList<>();
        
        try {
            ps=cnn.prepareStatement("SELECT *FROM Tbnovedad");
            rs=ps.executeQuery();
            while(rs.next()){
                no=new Novedad(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
                
                lista.add(no);
            }
                    
        } catch (SQLException ex) {
            System.out.println("error en la consulta"+ex);
        }
        
        return lista;
        
    }

    
}
