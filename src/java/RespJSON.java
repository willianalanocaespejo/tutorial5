

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
@WebServlet(name="RespJSON",urlPatterns = {"/RespJSON"})
public class RespJSON extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/csv");
        response.setHeader("content-Disposition","attachment;filename=empleados.json");
        PrintWriter out = response.getWriter(); 
        try{
        out.println("'empleados':[}");
        out.println("{'nombre' : 'Bruno' , 'apellidos': 'Diaz'}");
        out.println("{'nombre' : 'Juan Jose' , 'apellidos' : 'paredes' }");
        out.println("{'nombre' : 'Dolores' , 'apellidos' : 'fuertes'}");
        out.println("]}");
}    finally{
out.close();
}
    }

}
