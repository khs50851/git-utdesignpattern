package case1.step1;

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
	
	public static Database getInstance(String name) {
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
