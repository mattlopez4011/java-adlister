import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class CountServlet extends HttpServlet {

    private int counter;

    public void init() {
        // Reset hit counter.
        counter = 0;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String count = request.getParameter("count");
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if(count == null){

            counter++;
            out.println("<h1>Current views count: "+counter+"</h1>");
        }


        else if(count.equalsIgnoreCase("reset")){
            init(); // reset counter
//            counter = 0;
            out.println("<h1>Current views count: "+counter+"</h1>");

        }


//        if (count == null){
////            out.println("<h1>Hello World!</h1>" + "<img src=\"https://media.giphy.com/media/lcs5BL0NIM4WMv61a9/giphy.gif\">");
//            out.println("<h1>Current views count: "+counter+"</h1>");
//        }else {
//            counter++;
//            out.println("<h1>Current views count: "+counter+"</h1>");
////            out.println("<h1>Hello, "+name+"</h1>");
//        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name == null) {
            out.println("<h1>Hello World!</h1>");
        } else {
            out.println("<h1>Hello, " + name + "</h1>");
        }

    }
}