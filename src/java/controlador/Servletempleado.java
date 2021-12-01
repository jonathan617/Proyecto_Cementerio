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
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;
import modelo.actividad;
import modelo.actividadDao;
import modelo.empleado;
import modelo.empleadoDao;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Servletempleado", urlPatterns = {"/Servletempleado"})
@MultipartConfig
public class Servletempleado extends HttpServlet {

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
        if(request.getParameter("op").equals("ins")){
        int c;
        Boolean y;
        String t, n, d, te, e;

        c=Integer.parseInt(request.getParameter("Documento"));
        t=request.getParameter("tipo");
        n=request.getParameter("Nombres");
        d=request.getParameter("Direccion");
        te=request.getParameter("Telefono");
        e=request.getParameter("correo");
        Part i = request.getPart("img");      

        JOptionPane.showMessageDialog(null,t+n+d+te+e);
        
        String nomfoto=i.getSubmittedFileName();
            
        String nombre=n+""+nomfoto;
        String Url="C:\\Users\\jonat\\Documents\\GitHub\\Cementerio\\web\\imagenes\\"+nombre;
        String Url2="imagenes/"+nombre;
            
        InputStream file=i.getInputStream();
        File f=new File(Url);
        FileOutputStream sal=new FileOutputStream(f);
        int num=file.read();
        while(num != -1){
            sal.write(num);
            num=file.read();
        }

        empleado empleado = new empleado(c, t, n, d, te, e, Url2);
        empleadoDao emdao = new empleadoDao();

        y = emdao.insertarempleado(empleado);
        if (y) {
            JOptionPane.showMessageDialog(null, " guardados");
            response.sendRedirect("Empleado.jsp");
        } else {
            JOptionPane.showMessageDialog(null, " Fail");
            response.sendRedirect("Empleado.jsp");
        }
        }
        if(request.getParameter("dato").equals("actualizar")){
            boolean dat;
            String t, n, d, te, e;
            int c;
            c=Integer.parseInt(request.getParameter("c"));
            t=request.getParameter("t");
            n=request.getParameter("n");
            d=request.getParameter("d");
            te=request.getParameter("te");
            e=request.getParameter("e");
            Part i = request.getPart("img");      

        JOptionPane.showMessageDialog(null,t+n+d+te+e);
        
        String nomfoto=i.getSubmittedFileName();
            
        String nombre=n+""+nomfoto;
        String Url="C:\\Users\\jonat\\Documents\\GitHub\\Cementerio\\web\\imagenes\\"+nombre;
        String Url2="imagenes/"+nombre;
            
        InputStream file=i.getInputStream();
        File f=new File(Url);
        FileOutputStream sal=new FileOutputStream(f);
        int num=file.read();
        while(num != -1){
            sal.write(num);
            num=file.read();
        }

        empleado empleado = new empleado(c, t, n, d, te, e, Url2);
        empleadoDao emdao = new empleadoDao();

        dat = emdao.actualizarempleado(empleado);
        if (dat) {
            JOptionPane.showMessageDialog(null, " guardados");
            response.sendRedirect("Empleado.jsp");
        } else {
            JOptionPane.showMessageDialog(null, " Fail");
            response.sendRedirect("Empleado.jsp");
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
