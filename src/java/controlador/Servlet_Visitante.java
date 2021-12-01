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
import modelo.Visitante;
import modelo.VisitanteDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servlet_Visitante", urlPatterns = {"/Servlet_Visitante"})
public class Servlet_Visitante extends HttpServlet {

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

        int c, d;
        String n, di, t, co;
        
        if(request.getParameter("dato").equals("insertar")){
            
        int y;

        c = Integer.parseInt(request.getParameter("c"));
        d = Integer.parseInt(request.getParameter("d"));
        n = request.getParameter("n");
        di = request.getParameter("di");
        t = request.getParameter("t");
        co = request.getParameter("co");

        JOptionPane.showMessageDialog(null, n + "  El nombre");

        Visitante visitante = new Visitante(c, d, n, di, t, co);
        VisitanteDao vidao = new VisitanteDao();

        y = vidao.Insertar_Visitante(visitante);
        if (y > 0) {
            JOptionPane.showMessageDialog(null, " guardados");
            response.sendRedirect("Visitante.jsp");
        } else {
            JOptionPane.showMessageDialog(null, " Fail");
            response.sendRedirect("Visitante.jsp");
        }
        }
        if(request.getParameter("dato").equals("actualizar")){
            boolean dat;
            c = Integer.parseInt(request.getParameter("c"));
            d = Integer.parseInt(request.getParameter("d"));
            n = request.getParameter("n");
            di = request.getParameter("di");
            t = request.getParameter("t");
            co = request.getParameter("co");

            JOptionPane.showMessageDialog(null, n + "  El nombre");

            Visitante visitante = new Visitante(c, d, n, di, t, co);
            VisitanteDao vidao = new VisitanteDao();
            dat=vidao.actualizarvisitante(visitante);
            if(dat){
                JOptionPane.showMessageDialog(null, "datos actualizados");
                response.sendRedirect("Visitante.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null, "datos no fueron actualizados");
                response.sendRedirect("Visitante.jsp");
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
