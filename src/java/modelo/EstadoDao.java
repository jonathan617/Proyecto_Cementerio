/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EstadoDao {
    Conexion con=new Conexion();
    Connection cnn=con.conexionbd();
    PreparedStatement ps;
    ResultSet rs;
    Estado es;
    
    public int insertarEstado(Estado es){
        
        int x=0;
        try {
            ps=cnn.prepareStatement("INSERT INTO TbEstado VALUES(?,?,?,?,?)");
            ps.setInt(1,es.getCodestado());
            ps.setInt(2,es.getCodfallecido());
            ps.setString(3,es.getFecreal());
            ps.setString(4,es.getHorreal());
            ps.setString(5,es.getTipo());
            
            x=ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Datos guardados");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al insertar"+ex);
        }
     return x;
    } 
    public ArrayList<Estado> consultageneralestado(){
        ArrayList<Estado> lista=new ArrayList<>();
        
        try {
            ps=cnn.prepareStatement("SELECT *FROM TbEstado");
            rs=ps.executeQuery();
            while(rs.next()){
                es=new Estado(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5));
                
                lista.add(es);
            }
                    
        } catch (SQLException ex) {
            System.out.println("error en la consulta"+ex);
        }
        
        return lista;
        
    }
}