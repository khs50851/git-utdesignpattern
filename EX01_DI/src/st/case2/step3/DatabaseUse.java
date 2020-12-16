package st.case2.step3;

public class DatabaseUse {
	
	// 접근점
	private Database db;
	
	// 데이터 베이스 교환을 가능하게
	public void setDatabase(Database db) {
		this.db = db;
	}
	
	// 기능 사용
	public void connect() {
		if(db == null) {
			System.out.println("DB를 선택하세요");
		}else {
			//기능 위임 -> 구체적인 데이터베이스 종류는 몰라도 사용 가능
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
		
	
	
}
