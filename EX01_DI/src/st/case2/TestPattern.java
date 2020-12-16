package st.case2;

public class TestPattern {

	public static void main(String[] args) {
		
		DatabaseUse myDB = new DatabaseUse();
		
		// 데이터 베이스 세팅
		myDB.connect(DBTYPE.MySQL);
		myDB.select();
		
		// 데이터 베이스 세팅
		myDB.connect(DBTYPE.Informix);
		myDB.select();
		
		// 추가 요청사항 -> 오라클 클래스를 추가하고 세팅하여 사용
		myDB.connect(DBTYPE.Oracle);
		myDB.select();
		
		
	}

}
