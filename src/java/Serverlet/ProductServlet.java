/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
<<<<<<< HEAD
package Serverlet;
=======
package src.java.Serverlet;
>>>>>>> 6d2f4f8b8f6b17736d9a433cedfe2389a651b742
import DAO.ProductDAO;
import DAO.ProductDAOImpl;
import Bean.Productbean;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProductServlet", urlPatterns = {"/products"})
public class ProductServlet extends HttpServlet {

    private ProductDAO productDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        try {
            // Initialize database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fwrp0", "root", "root");
            productDAO = new ProductDAOImpl(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("username");
		String password = (String) session.getAttribute("password");

		if (userName == null || password == null) {

			response.sendRedirect("login.jsp?message=Session Expired, Login Again!!");
		} 
                
        List<Productbean> productList = productDAO.getAllProducts();
        request.setAttribute("productList", productList);
        request.getRequestDispatcher("/product_list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle post requests if needed
    }
}
