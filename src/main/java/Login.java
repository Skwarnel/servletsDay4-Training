import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Objects;

@WebServlet("/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);


        String user = req.getParameter("name");
        String pass = req.getParameter("password");
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            if (Objects.nonNull(user) && Objects.nonNull(pass)) {

                HttpSession session = req.getSession();
                session.setAttribute("user", user);
                session.setAttribute("pass", pass);
                getServletContext().getRequestDispatcher("/admin.jsp").forward(req, resp);
            }
            // dodaj dane do sesji pod kluczem: username
            // przekieruj na adres /admin
        } else {
            resp.getWriter().println("Niestety, nie posiadasz uprawnień");
        }
    }
}
