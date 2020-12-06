package fw.case1.step1;

public class TestPattern1 {

	public static void main(String[] args) {
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		String str3 = "홍길동";
		String str4 = "홍길동";
		
		//str1과 str2는 다른 객체를 참조
		// str3,4는 같이되어있음 중복 생성을 막기 위해 플라이웨이트 패턴이 적용됨
		
		
		System.out.println("FlyWeight Pattern");
	}

}
