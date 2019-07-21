package gunsan.gov;

import java.util.logging.Logger;

public class MainClass {
	final static Logger logger = Logger.getLogger(MainClass.class.getSimpleName());
	
	public static void main(String[] args) {
		
		User user = new User();
		user.setName("YOU DANAH");
		user.setBirth("920205");
		user.setId(1);
		logger.info(user.toString());
		logger.info("hello world");
	}

}
