package case1.step2;

public class Database {
	private static Database singleton;
	private String name;

	private Database(String name) {
//		super();
//		this.name = name;
		try {
			Thread.sleep(100);
			this.name=name;
		}catch (Exception e) {
			
		}
		// 이렇게 하면 기본적으로 데이터베이스에 접속하면 시간이 걸림
		// 우리는 데이터가 없어서 바로 접속이 되서 실제로 접속했을때처럼 시간 걸리게 100밀리세컨드를 줌
	}
	
	
	// synchronized 이렇게 함으로써 메소드가 불릴때
	// 동시에 여러 쓰레드가 접근하더라도 차례대로 줄을 쳐서
	// 앞에 쓰레드가 끝나기를 기다림
	
	
	// 추가적인 문제는 synchronized는 비용이 비쌈
	// 스레드가 10개가 동시에 와서 대기하고있는데 얘네를 한줄로 세운거임
	// 그래서 병목현상이 일어남
	
	// 최초에만 null인지 판단하면 되는건데 이렇게하면 좀 비효율적
	public synchronized static Database getInstance(String name) {
		if(singleton == null) {
			singleton = new Database(name);
		}
		return singleton;
	}
	public String getName() {
		return name;
	}
	
	// 궁극적으로는 데이터베이스에 접근
	
	
	
	
}
