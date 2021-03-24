
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="RespIMG",urlPatterns = {"/RespIMG"})
public class RespIMG extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("image/jpg");
        
        try{
        String ruta =request.getServletContext().getRealPath(File.separator);
        System.out.print(ruta);
        File f =new File(ruta+ "hola.png");
        BufferedImage b1 = ImageIO.read(f);
        OutputStream out = response. getOutputStream();
        ImageIO.write(b1, "png",out);
        out.close();
}    finally{
        
        }
    }

    

}
