package nonspringmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public String HandleRequest(HttpServletRequest request, HttpServletResponse response);
}
