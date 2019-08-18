package ua.com.servlet_exampl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book")
public class FineBooks extends HttpServlet {
    String title;
    double price;

    public FineBooks() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String title = request.getParameter("booktitle");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<html><body>");
        out.println("<h2>the book " + title + " costs only $65");
        out.println("<p>Please enter your credit card number");
        out.println("</body></html>");

    }
}
