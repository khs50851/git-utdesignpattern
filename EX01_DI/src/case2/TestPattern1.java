package case2;

public class TestPattern1 {

	public static void main(String[] args) {
		LogWriter logger;
		
		logger = LogWriter.getInstance();
		logger.log("후후후");
		
		logger = LogWriter.getInstance();
		logger.log("또하장");
				
	}

}
