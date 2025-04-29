import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;


@WebServlet(urlPatterns = "/Internal",loadOnStartup = 1)
public class Internal extends GenericServlet {

    public Internal(){
        System.out.println("Elephant servlet created by Tomcat....");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running Internal in Generic Servlet");

    }
}
