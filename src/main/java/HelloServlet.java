import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name == null){
            out.println("<h1>Hello World!</h1>" + "<img src=\"https://media.giphy.com/media/lcs5BL0NIM4WMv61a9/giphy.gif\">");
        }else if (name.equals("google")){
            response.sendRedirect("https://google.com");
        }
        else {
            out.println("<h1>Hello, "+name+"</h1>");
        }

        request.setAttribute("name", name);
        request.getRequestDispatcher("/hello.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name == null){
            out.println("<h1>Hello World!</h1>");
        }else {
            out.println("<h1>Hello, "+name+"</h1>");
        }

//        out.println("<h1>Hello, Banana!</h1> " +
//                "<h2>Here is a "+fruit+"</h2>" +
//                "<img src=\"https://media.giphy.com/media/lcs5BL0NIM4WMv61a9/giphy.gif\">"
//        );
    }
}