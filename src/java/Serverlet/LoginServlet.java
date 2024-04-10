package src.java.Serverlet;

import DAO.UserDAOImpl;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession; // Import HttpSession
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    private final UserDAOImpl userService = new UserDAOImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String status = userService.isValidCredential(username, password);

        if ("valid".equals(status)) {
            String userType = userService.getUserType(username); // Retrieve userType

            // Start a session
            HttpSession session = request.getSession();
            session.setAttribute("username", username); 

            switch (userType) {
                case "Retailer":
                    response.sendRedirect("retailer.jsp"); // Redirect to retailer page
                    break;
                case "Consumer":
                    response.sendRedirect("consumer.jsp"); // Redirect to consumer page
                    break;
                case "Charitable Consumer":
                    response.sendRedirect("charitable.jsp"); // Redirect to charitable page
                    break;
                default:
                    // Redirect to a default page if userType is not recognized
                    response.sendRedirect("loginFailed.jsp");
                    break;
            }
        } else {
            // Login failed, redirect back to the login page with an error message
            request.setAttribute("errorMessage", "Invalid Username or Password");
            RequestDispatcher rd = request.getRequestDispatcher("loginFailed.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Redirect GET request to the login form, this is optional
        response.sendRedirect("login.jsp");
    }
}
