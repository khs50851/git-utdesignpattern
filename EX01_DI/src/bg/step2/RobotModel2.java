package bg.step2;

public class RobotModel2 implements IRobot {

	@Override
	public void powerOn() {
		System.out.println("type2 : power on");
	}

	@Override
	public void powerOff() {
		System.out.println("type2 : power off");
	}

	// 행동 추가
	@Override
	public void doCook() {
		System.out.println("요리를 시작합니다.");
	}
	
}
