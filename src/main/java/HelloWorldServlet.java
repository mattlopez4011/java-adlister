import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1>Hello, World!</h1>");

        String name = request.getParameter("name");
        if (name != null){
            response.getWriter().println("<h1>Hello, "+name+"!</h1>");
        }

        String name2 = request.getParameter("name2");
        if (name2 != null){
            response.getWriter().println("<h1>Hello, "+name2+"!</h1>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.getWriter().println("<h1>Hello, "+name+"!</h1>");
    }
}
