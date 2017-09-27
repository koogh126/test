package front;
//==========command pattern===================
abstract class Command{//틀 제공
	abstract public void run();
}

class ACommand extends Command{
	public void run(){
		System.out.println("ACommand 실행");
	}
}
class BCommand extends Command{
	public void run(){
		System.out.println("BCommand 실행");
	}
}
//============================================
//==========factory method pattern============
class CommandFactory{
	public Command getCommand(String name){
		Command c = null;
		if(name.equalsIgnoreCase("a")){
			c = new ACommand();
		}else if(name.equalsIgnoreCase("b")){
			c = new BCommand();
		}
		return c;
		
		
	}
}
//============================================
//입력 값 Command 결정 권한이 factory 에 있다. 
public class CommandTest {

	public static void main(String[] args) {
		CommandFactory factory = new CommandFactory();
		Command c = factory.getCommand(args[0]);
		c.run();
		
		
	}

}
