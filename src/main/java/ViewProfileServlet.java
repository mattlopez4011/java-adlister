import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(); // Create session instance

        //If user has signed in as admin with key, send to profile
        if (session.getAttribute("user") == null ){
                        response.sendRedirect("/login");

//            response.sendRedirect("/profile");
        }else{
        request.getRequestDispatcher("WEB-INF/profile.jsp").forward(request, response);
        }

    }
}
