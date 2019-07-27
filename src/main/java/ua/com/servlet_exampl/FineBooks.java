package ua.com.servlet_exampl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book")
public class FineBooks extends HttpServlet {

    public FineBooks() {
        super();
    }
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
//    Cookie myCookie = new Cookie("bookName", "Java Programing" +
//            " 24 - hour trainer");
//    myCookie.setMaxAge(60*60*24);
//    response.addCookie(myCookie);
//
//    Cookie[] cookies = request.getCookies();
//
//    for (int i = 0; i < cookies.length; i++){
//        Cookie currentCookie = cookies[i];
//        String name = currentCookie.getName();
//        String value = currentCookie.getValue();
//    }
        String title = request.getParameter("booktitle");
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<html><body>");
        out.println("<h2>the book " + title + " costs only $65");
        out.println("<p>Please enter your credit card number");
        out.println("</body></html>");
    }
}
