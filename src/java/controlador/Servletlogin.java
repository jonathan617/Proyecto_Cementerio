/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;
import modelo.login;
import modelo.loginDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servletlogin", urlPatterns = {"/Servletlogin"})
public class Servletlogin extends HttpServlet {

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
        
        
        if(request.getParameter("btnlogin")!=null){
            ArrayList<login> lista=new ArrayList<>();
            String u,c,r,n,co;
            int cod=0;
            u=request.getParameter("usuario");
            c=getMD5(request.getParameter("clave"));
            JOptionPane.showMessageDialog(null, u+c);
            r=request.getParameter("");
            n=request.getParameter("");
            login lo=new login(u, c);
            loginDao id=new loginDao();
            login datlo=new login(cod,r,u,c,n);
            lista=id.LoginDao(lo);
            JOptionPane.showMessageDialog(null, lista);
            if(lista.size()>0){
            for(int i=0;i<lista.size();i++){
                datlo=lista.get(i);
            }
                if(datlo.getUsuario().equals(u) && datlo.getClave().equals(c)){
                    JOptionPane.showMessageDialog(null, "Datos correctos");
                    HttpSession sesion=request.getSession();
                    sesion.setAttribute("rosesion",u);
                    sesion.setAttribute("varsesion",datlo.getNombre());
                    
                    if(datlo.getRol().equals("administrador")){
                        JOptionPane.showMessageDialog(null, datlo.getRol());
                        JOptionPane.showMessageDialog(null, datlo.getCodigo());
                        sesion.setAttribute("rol",datlo.getRol());
                        sesion.setAttribute("Codigo", datlo.getCodigo());
                            response.sendRedirect("EspacioEmpleado.jsp");
                        
                    }
                    else if(datlo.getRol().equals("trabajador")){
                        JOptionPane.showMessageDialog(null, datlo.getRol());
                        JOptionPane.showMessageDialog(null, datlo.getCodigo());
                        sesion.setAttribute("rol",datlo.getRol());
                        sesion.setAttribute("Codigo", datlo.getCodigo());
                            response.sendRedirect("EspacioEmpleado.jsp");
                        
                    }
                    else if(datlo.getRol().equals("visitante")){
                        JOptionPane.showMessageDialog(null, datlo.getRol());
                        JOptionPane.showMessageDialog(null, datlo.getCodigo());
                        sesion.setAttribute("rol",datlo.getRol());
                        sesion.setAttribute("Codigo", datlo.getCodigo());
                            response.sendRedirect("EspacioEmpleado.jsp");
                        
                    }
            }
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
