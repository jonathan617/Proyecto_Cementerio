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

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servletactividad", urlPatterns = {"/Servletactividad"})
public class Servletactividad extends HttpServlet {

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
        String a,de;
        int c,d;
        if(request.getParameter("dato").equals("insertar")){
            int y=0;
            c=Integer.parseInt(request.getParameter("c"));
            d=Integer.parseInt(request.getParameter("d"));
            a=request.getParameter("a");
            de=request.getParameter("de");
            
            JOptionPane.showMessageDialog(null,a+de);
            
            actividad actividad = new actividad(c,d,a,de);
            actividadDao actdao=new actividadDao();
            y=actdao.insertaractividad(actividad);
            if(y>0){
                response.sendRedirect("actividades.jsp");
                JOptionPane.showMessageDialog(null, "datos guardados");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no guardados");
                response.sendRedirect("actividades.jsp");
            }
        }
        if(request.getParameter("dato").equals("actualizar")){
            boolean dat;
            c=Integer.parseInt(request.getParameter("c"));
            d=Integer.parseInt(request.getParameter("d"));
            a=request.getParameter("a");
            de=request.getParameter("de");
            
            JOptionPane.showMessageDialog(null,a+de);
            
            actividad actividad = new actividad(c,d,a,de);
            actividadDao actdao=new actividadDao();
            dat=actdao.actualizaractividad(actividad);
            if(dat){
                JOptionPane.showMessageDialog(null, "datos actualizados");
                response.sendRedirect("actividades.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no fueron actualizados");
                response.sendRedirect("actividades.jsp");
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
