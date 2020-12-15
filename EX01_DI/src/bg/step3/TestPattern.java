package bg.step3;

public class TestPattern {
	
	public static void main(String[] args) {
		
		IRobot robot = new RobotModel1();
		Cook work = new Cook(robot);
		work.powerOn();
		work.poweroff();
		work.doCook();
		
		System.out.println("--------------------------------------------");
		
		robot = new RobotModel2();
		work = new Cook(robot);
		work.powerOn();
		work.doCook();
		work.poweroff();
		
		
	}
}
