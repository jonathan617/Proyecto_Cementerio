/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import modelo.actividad;
import modelo.actividadDao;
import modelo.certificacion;
import modelo.certificacionDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servletcertificacion", urlPatterns = {"/Servletcertificacion"})
public class Servletcertificacion extends HttpServlet {

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
        
        JOptionPane.showMessageDialog(null, "en el servlet");
        String m;
        int c,nc;
        if(request.getParameter("dato").equals("insertar")){
            int y;
            c=Integer.parseInt(request.getParameter("c"));
            nc=Integer.parseInt(request.getParameter("nc"));
            m=request.getParameter("m");
            
            JOptionPane.showMessageDialog(null,m);
            
            certificacion certificacion = new certificacion(c,nc,m);
            certificacionDao cerdao=new certificacionDao();
            y=cerdao.insertarcertificacion(certificacion);
            if(y>0){
                response.sendRedirect("certificacion.jsp");
                JOptionPane.showMessageDialog(null, "datos guardados");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no guardados");
                response.sendRedirect("certificacion.jsp");
            }
        }
        if(request.getParameter("dato").equals("actualizar")){
            boolean dat;
            c=Integer.parseInt(request.getParameter("c"));
            nc=Integer.parseInt(request.getParameter("nc"));
            m=request.getParameter("m");
            
            JOptionPane.showMessageDialog(null,m);
            
            certificacion certificacion = new certificacion(c,nc,m);
            certificacionDao cerdao=new certificacionDao();
            dat=cerdao.actualizarcertificado(certificacion);
            if(dat){
                JOptionPane.showMessageDialog(null, "datos actualizados");
                response.sendRedirect("certificacion.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no fueron actualizados");
                response.sendRedirect("certificacion.jsp");
            }
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
