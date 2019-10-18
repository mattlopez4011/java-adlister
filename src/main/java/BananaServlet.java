import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/banana")
public class BananaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, Banana!</h1>");
        out.println("<h2>YYYEEEAAAHHHHH</h2>");
        out.println("<img src=\"https://media.giphy.com/media/lcs5BL0NIM4WMv61a9/giphy.gif\">");

    }
}
