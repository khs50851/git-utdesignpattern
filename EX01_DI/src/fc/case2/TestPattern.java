package fc.case2;

public class TestPattern {

	public static void main(String args[]) {
		
		// 이전 사용방식
		Computer computer = new Computer();
		Light light = new Light();
		Radio radio = new Radio();
		
		// 집에서 나갈때 동작
		computer.turnOff();
		light.turnOff();
		radio.turnOff();
		
		System.out.println("------------------------------------------");
		// 파사드 패턴 적용 후 사용방식
		// 집에 들어올떄
		HomeFacade home = new HomeFacade(computer, light, radio);
		home.homeIn();
			
		
	}
	
}
