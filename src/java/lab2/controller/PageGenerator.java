/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mgilbertson
 */
@WebServlet(name = "PageGenerator", urlPatterns = {"/pager"})
public class PageGenerator extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String color = request.getParameter("color");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PageGenerator</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome " + firstName + " " + lastName + "</h1>");
            out.println("<h1 style='color:" + color + "'>Lab2</h1>");
//            out.println("<table>"
//                            + "<tr>"
//                                + "<td>1</td>"
//                                + "<td>2</td>"
//                                + "<td>3</td>"
//                            + "</tr>"
//                            + "<tr>"
//                                + "<td>4</td>"
//                                + "<td>4</td>"
//                                + "<td>6</td>"
//                            + "</tr>"
//                            + "<tr>"
//                                + "<td>7</td>"
//                                + "<td>8</td>"
//                                + "<td>9</td>"
//                            + "</tr>"
//                        + "</table>");
            out.println("<table border = 1");
            int count = 1;
            for (int row=0;row < 3;row++){
                out.println("<tr>");
                    for(int col=0;col<3;col++){
                        out.println("<td>" + count + "</td>");
                        count++;
                    }
                out.println("</tr>");
            }
            out.println("</table");
            out.println("<p><a href=index.html>Go to home page</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
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
