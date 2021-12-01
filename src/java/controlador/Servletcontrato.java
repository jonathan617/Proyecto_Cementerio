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
import modelo.contrato;
import modelo.contratoDao;
import modelo.empleado;
import modelo.empleadoDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servletcontrato", urlPatterns = {"/Servletcontrato"})
public class Servletcontrato extends HttpServlet {

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
        String tpc,dpc,fic,ffc,tc,cc;
        int c,ec,ca,s;
        if(request.getParameter("dato").equals("insertar")){
            int y;
            c=Integer.parseInt(request.getParameter("c"));
            ec=Integer.parseInt(request.getParameter("ec"));
            tpc=request.getParameter("tpc");
            dpc=request.getParameter("dpc");
            ca=Integer.parseInt(request.getParameter("ca"));
            s=Integer.parseInt(request.getParameter("s"));
            fic=request.getParameter("fic");
            ffc=request.getParameter("ffc");
            tc=request.getParameter("tc");
            cc=request.getParameter("cc");
            
            JOptionPane.showMessageDialog(null,tpc+dpc+fic+ffc+tc+cc);
            
            contrato contrato = new contrato(c,ec,tpc,dpc,ca,s,fic,ffc,tc,cc);
            contratoDao condao=new contratoDao();
            y=condao.insertarcontrato(contrato);
            if(y>0){
                response.sendRedirect("contrato.jsp");
                JOptionPane.showMessageDialog(null, "datos guardados");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no guardados");
                response.sendRedirect("contrato.jsp");
            }
        }
        if(request.getParameter("dato").equals("actualizar")){
            boolean dat;
            c=Integer.parseInt(request.getParameter("c"));
            ec=Integer.parseInt(request.getParameter("ec"));
            tpc=request.getParameter("tpc");
            dpc=request.getParameter("dpc");
            ca=Integer.parseInt(request.getParameter("ca"));
            s=Integer.parseInt(request.getParameter("s"));
            fic=request.getParameter("fic");
            ffc=request.getParameter("ffc");
            tc=request.getParameter("tc");
            cc=request.getParameter("cc");
            
            JOptionPane.showMessageDialog(null,tpc+dpc+fic+ffc+tc+cc);
            
            contrato contrato = new contrato(c,ec,tpc,dpc,ca,s,fic,ffc,tc,cc);
            contratoDao condao=new contratoDao();
            dat=condao.actualizarcontrato(contrato);
            if(dat){
                JOptionPane.showMessageDialog(null, "datos actualizados");
                response.sendRedirect("contrato.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no fueron actualizados");
                response.sendRedirect("contrato.jsp");
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
