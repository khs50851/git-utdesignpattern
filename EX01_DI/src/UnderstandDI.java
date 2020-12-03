import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date); // 이건 강한 결합
		
	}
	
	public static void getDate(Date d) {
		Date date = d;
		System.out.println(date); // 이건 약한 결합
		// 기존에 API,프레임워크에서도 강,약결합 만들 수 있음
	}
	
	public static void memeberUse1(){ // 강한 결합으로 직접 객체를 생성
		Member m1 = new Member(); // -> Member 클래스의 생성자를 private으로 바꿨더니 에러남
	}
	
	public static void memberUse2(Member m) {
		// 약한 결합 -> 생성된 것을 주입 받음 -> 의존 주입
		Member m2 = m;
		// 약한결합은 만들어져 있던것을 주입받는거라 에러가 발생하지 않음
		// 약한 결합은 다른 클래스의 변화에 보다 유연하게 대처할 수 있음
	}
}

// Member를 사용한다 --> Member의 기능에 의존한다라는 의미임
class Member{
	String name;
	String nickname;
	String point;
	String id;
	//private Member() {} // 생성자를 public -> private으로 바꿈
	public Member() {}
}
