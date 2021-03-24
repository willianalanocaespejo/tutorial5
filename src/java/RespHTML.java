/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author VILLASANTI
 */
@WebServlet(name="RespHTML",urlPatterns = {"/RespHTML"})
public class RespHTML extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/HTML");
        PrintWriter out = response.getWriter(); 
      try{ 
          out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RespHTML</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RespHTML at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>"); 
      }finally{
      out.close();
    }

   

}}
