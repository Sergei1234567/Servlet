package ua.com.servlet_exampl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/best")
public class HelloServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {

        // Передаём данные с Servlet на JSP
        req.setAttribute("name", "ServletExample");

        // Использование JSP
        req.getRequestDispatcher("mypage.jsp").forward(req, resp);
    }
}
