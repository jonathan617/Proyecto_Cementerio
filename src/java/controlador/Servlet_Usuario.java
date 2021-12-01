/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import static jdk.nashorn.tools.ShellFunctions.input;
import modelo.Usuario;
import modelo.UsuarioDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servlet_Usuario", urlPatterns = {"/Servlet_Usuario"})
public class Servlet_Usuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        JOptionPane.showMessageDialog(null, "Ser");
        JOptionPane.showMessageDialog(null, "  El nombre");

        int c;
        String n, r, u, cl;
        
        if(request.getParameter("dato").equals("insertar")){
            
        int y;

        c = Integer.parseInt(request.getParameter("c"));
        n = request.getParameter("d");
        r = request.getParameter("n");
        u = request.getParameter("di");
        cl = request.getParameter("t");

        JOptionPane.showMessageDialog(null, "El nombre "+n);

        Usuario usuario = new Usuario(c, n, r, u, cl);
        UsuarioDao usdao = new UsuarioDao();

        y = usdao.Insertar_Usuario(usuario);
        if (y > 0) {
            JOptionPane.showMessageDialog(null, " guardados");
            response.sendRedirect("Usuario.jsp");
        } else {
            JOptionPane.showMessageDialog(null, " Fail");
            response.sendRedirect("Usuario.jsp");
        }
        }
        if(request.getParameter("dato").equals("actualizar")){
            boolean dat;
            c = Integer.parseInt(request.getParameter("c"));
            n = request.getParameter("d");
            r = request.getParameter("n");
            u = request.getParameter("di");
            cl = request.getParameter("t");
            

            JOptionPane.showMessageDialog(null,"El nombre "+n);

            Usuario Usuario = new Usuario(c, n, r, u, cl);
            UsuarioDao usdao = new UsuarioDao();
            dat=usdao.actualizarusuario(Usuario);
            if(dat){
                JOptionPane.showMessageDialog(null, "datos actualizados");
                response.sendRedirect("Usuario.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no fueron actualizados");
                response.sendRedirect("Usuario.jsp");
            }
        }
        
    }
        public String getMD5(String input){
        try {
            MessageDigest md=MessageDigest.getInstance("MD5");
            byte[] encBytes=md.digest(input.getBytes());
            BigInteger numero=new BigInteger(1, encBytes);
            String encString=numero.toString(16);
            while(encString.length()<32){
                encString="0"+encString;
            }
         return encString; 
         } catch (Exception e) {
             throw new RuntimeException(e);
        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
