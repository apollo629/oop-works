package us.inal.oop.mvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by alpereninal on 24/10/16.
 */
public class IdentityController extends HttpServlet {

    public IdentityController() {
        super();
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("surname");
        RequestDispatcher rd;

        Authenticator authenticator = new Authenticator();
        Boolean result = authenticator.authenticate(username.toLowerCase(), password.toLowerCase());
        if (result) {
            rd = request.getRequestDispatcher("success.jsp");
        } else {
            rd = request.getRequestDispatcher("error.jsp");
        }
        rd.forward(request, response);
    }


}
