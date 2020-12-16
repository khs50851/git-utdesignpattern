package st.case2.step3;

public class TestPattern {

	public static void main(String[] args) {
		
		// 데이터베이스를 전략적으로 선택하여 사용
		DatabaseUse myDB = new DatabaseUse();
		myDB.connect();
		
		// A(DatabaseUse)에게 같은 일을 시켰지만 동작은 B(MySQL)가 한다
		myDB.setDatabase(new MySQL());
		myDB.connect();
		myDB.select();
		
		
		// A(DatabaseUse)에게 같은 일을 시켰지만 동작은 B(Informix)가 한다
		myDB.setDatabase(new Informix());
		myDB.connect();
		myDB.select();
		
		
		// 오라클 클래스 추가와 다음 코드 추가만으로
		// 기존 코드 수정없이 오라클 접속기능 추가
		myDB.setDatabase(new Oracle());
		myDB.connect();
		myDB.select();
		
	}

}
