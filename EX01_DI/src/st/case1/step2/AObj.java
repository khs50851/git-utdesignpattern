package st.case1.step2;

public class AObj {

	BInterface binterface;
	
	public AObj() {
		binterface = new BImplement();
	}
	
	public void SomeFunc() {
//		System.out.println("AAA");
//		System.out.println("AAA");
		
		// 위의 기능이 필요합니다.
		// 기능 구현을 위임
		binterface.funcA();
		binterface.funcA();
	}	

}
