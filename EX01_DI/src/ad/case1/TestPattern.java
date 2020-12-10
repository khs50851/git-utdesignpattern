package ad.case1;

public class TestPattern {

	public static void main(String[] args) {
		APlayer player1 = new APlayerImpl();
		player1.play("aaa.mp3");
		
		// 계약기간 만료로 APlayerImpl()을 사용할 수 없다
		
		//BPlayer : 새로 도입된 방식
		BPlayer player2 = new BPlayerImpl();
		player2.playFile("bbb.mp3");	
		
		// 우리가 사용하고싶은 것은
		// APlayer obj = (어댑터) = new BPlayerImpl();
		// 기존에 잘 작동하던 코드와 새로 도입된 코드를 
		// 변경 없이 사용하고 싶은것
		// 어댑터 적용 후 에러가 난다면 어댑터 부분만 보면 됨
		
		player1 = new BToAAdapter(new BPlayerImpl());
		player1.play("CCC.mp");
	}

}
