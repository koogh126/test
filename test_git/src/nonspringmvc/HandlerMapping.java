package nonspringmvc;

import java.util.HashMap;

public class HandlerMapping {
	private HashMap<String,Controller> mappings = new HashMap<String,Controller>();
	HandlerMapping(){
		mappings.put("hello.mvc", new HelloController());
		mappings.put("board.mvc", new BoardController());
	}
	
	Controller getController(String result){
		return mappings.get(result);
	}
}
