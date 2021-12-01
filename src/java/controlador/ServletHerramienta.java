/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;

import modelo.Herramientas;
import modelo.HerramientasDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
@WebServlet(name = "ServletHerramienta", urlPatterns = {"/ServletHerramienta"})
public class ServletHerramienta extends HttpServlet {

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
        
        String  nomh,marh,pro;
            int codh,codt,ph,eh,y;
            codh=Integer.parseInt(request.getParameter("ch"));
            codt=Integer.parseInt(request.getParameter("ct"));
            nomh=request.getParameter("nh");
            marh=request.getParameter("mh");
            ph=Integer.parseInt(request.getParameter("ph"));
            eh=Integer.parseInt(request.getParameter("eh"));
            pro=request.getParameter("p");
            
            Herramientas her=new Herramientas(codh, codt, nomh, marh, ph, eh, pro);
            HerramientasDao usudao=new HerramientasDao();
            y=usudao.insertarHerramientas(her);
               if(y>0){
                   response.sendRedirect("Herramientas.jsp");
                   JOptionPane.showMessageDialog(null,"datos guardados");
                   
               }
               else{
                   JOptionPane.showMessageDialog(null,"los datos no se guardaron");
                   response.sendRedirect("Herramientas.jsp");
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
