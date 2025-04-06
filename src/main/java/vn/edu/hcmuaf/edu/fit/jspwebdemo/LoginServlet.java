package vn.edu.hcmuaf.edu.fit.jspwebdemo;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    // Giả lập kiểm tra tài khoản
    private final String VALID_EMAIL = "admin@gmail.com";
    private final String VALID_PASSWORD = "123456";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        if (VALID_EMAIL.equals(email) && VALID_PASSWORD.equals(password)) {
            // Đăng nhập thành công
            request.getSession().setAttribute("user", email);
            response.sendRedirect("welcome.jsp");
        } else {
            // Sai tài khoản
            request.setAttribute("error", "Email hoặc mật khẩu không đúng!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}