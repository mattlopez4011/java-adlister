import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// We will use this method whenever we need access to the session object.
        HttpSession session = request.getSession();

        session.removeAttribute("user"); // remove key
        request.getRequestDispatcher("/login.jsp").forward(request, response);

        //If user has signed in as admin with key, send to profile
//        if (session.getAttribute("user") != null) { // If the user key is not null send to profile
////            response.sendRedirect("/login");
//            response.sendRedirect("/profile");
//        }else{
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
//
//        }

    }
}

