package case2;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class LogWriter {
	private static LogWriter singleton = new LogWriter();
	private static BufferedWriter bw;
	
	private LogWriter() {
		try {
			bw = new BufferedWriter(new FileWriter("log1.txt"));
		}catch (Exception e) {
		}
	}
	
	public static LogWriter getInstance() {
		return singleton;
	}
	
	public synchronized void log(String str) {
		try {
			// 현재 날짜와 시각 추가
			// bw.write(LocalDateTime.now()+":"+str+"\n";
			
			// 싱크로나이즈로 여러 스레드에서 접근하는거 막음
			bw.write(str+"\n");
			bw.flush();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		bw.close();
	}
	
	
}
