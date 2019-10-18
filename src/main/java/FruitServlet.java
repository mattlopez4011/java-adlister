import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String fruit = request.getParameter("fruit");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, Banana!</h1> " +
                       "<h2>Here is a "+fruit+"</h2>" +
                "<img src=\"https://media.giphy.com/media/lcs5BL0NIM4WMv61a9/giphy.gif\">"
        );

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fruit = request.getParameter("fruit");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, Banana!</h1> " +
                "<h2>Here is a "+fruit+"</h2>" +
                "<img src=\"https://media.giphy.com/media/lcs5BL0NIM4WMv61a9/giphy.gif\">"
        );
    }
}

