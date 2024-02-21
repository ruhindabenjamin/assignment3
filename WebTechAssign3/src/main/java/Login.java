import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("Admin12") && password.equals("password")) {
            HttpSession session = request.getSession();
            session.setAttribute("username", "logged in as : " + username);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Admission.jsp");

            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            request.setAttribute("error", "invalid Login!!");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Admission.jsp");

            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
