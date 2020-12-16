package st.case2;

enum DBTYPE { MySQL,Informix,Oracle }

public class DatabaseUse {
	
	private Database db;
	
	// 기능 선택
	
	// 여기에 계속 알고리즘이 추가되고 나중에 실행할때 변경할 수 있음
	public void connect(DBTYPE dbType) { 
		switch(dbType) {
		case MySQL:
			db = new MySQL();
			break;
		case Informix:
			db = new Informix();
			break;
		case Oracle:
			db = new Oracle();
			break;
		}
		
		if(db==null) {
			System.out.println("데이터베이스를 먼저 선택하세요.");
		}else {
			db.connectDatabase();
		}
	
	}
	
	public void select() {
		db.selectData();
	}
	
}