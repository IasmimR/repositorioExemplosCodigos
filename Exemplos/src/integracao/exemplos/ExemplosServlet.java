package integracao.exemplos;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ExemplosServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Ol� Mundo");
	}
}
