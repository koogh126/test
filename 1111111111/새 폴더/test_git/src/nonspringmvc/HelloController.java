package nonspringmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

	@Override
	public String HandleRequest(HttpServletRequest request, HttpServletResponse response) {
		//Model 선정 및 실행 , view  선정
		request.setAttribute("message", "hello mvc");
		//view 선정
		return "hello.jsp";
	}

}
