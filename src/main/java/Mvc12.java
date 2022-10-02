import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/mvc12")
public class Mvc12 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String startStr = req.getParameter("start");
        String endStr = req.getParameter("end");

        if (Objects.nonNull(startStr) && Objects.nonNull(endStr)) {
            int start = Integer.parseInt(startStr) + 10;
            int end = Integer.parseInt(endStr) + 10;

            req.setAttribute("start", start);
            req.setAttribute("end", end);
        }

        getServletContext().getRequestDispatcher("/jsp12.jsp").forward(req, resp);
    }
}
