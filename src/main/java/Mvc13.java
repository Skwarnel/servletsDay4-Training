import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String author = req.getParameter("author");
        String title = req.getParameter("title");
        String isbn = req.getParameter("isbn");

        Book book = new Book(author, title, isbn);

        if (Objects.nonNull(book)) {
            req.setAttribute("author", author);
            req.setAttribute("title", title);
            req.setAttribute("isbn", isbn);
        }

        getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
