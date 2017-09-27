package nonspringmvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DispatcherServlet extends HttpServlet {	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. uri 분석 : 요청 분석
		String uri = request.getRequestURI();
		String[] parse = uri.split("/");
		String result = parse[parse.length-1];
		
		//2. uri - controller 매핑 규칙 객체 
		// 키(url), 값(controller)
		HandlerMapping mapping = new HandlerMapping();
		//3. controller 선정
		Controller controller = mapping.getController(result);
		//4.controller 코맨드 실행(moder, view)
		String view = controller.HandleRequest(request, response);
		//5. forward
		RequestDispatcher rd = request.getRequestDispatcher(view);
		rd.forward(request, response);
	}

	

	
}
