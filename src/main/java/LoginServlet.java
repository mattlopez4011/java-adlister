import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// We will use this method whenever we need access to the session object.
        HttpSession session = request.getSession();

        //If user has signed in as admin with key, send to profile
        if (session.getAttribute("user") != null) { // If the user key is not null send to profile
//            response.sendRedirect("/login");
            response.sendRedirect("/profile");
        }else{
            request.getRequestDispatcher("/login.jsp").forward(request, response);

        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

        if (validAttempt) {
            // We will use this method whenever we need access to the session object.
             HttpSession session = request.getSession();
            session.setAttribute("user", username); // set user key to true, if user is admin

            response.sendRedirect("/profile");

        } else {
            response.sendRedirect("/login");
        }
    }
}
