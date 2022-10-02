import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class Filter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String header = httpServletRequest.getHeader("User-Agent");
        System.out.println(header);

        long startTime = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        long stopTime = System.currentTimeMillis();

        System.out.println("Moj komunikat: " + (stopTime - startTime));
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
