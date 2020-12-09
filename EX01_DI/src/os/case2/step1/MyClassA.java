package os.case2.step1;


public class MyClassA implements Observer{
	
	private boolean bPlay; // 실행 여부
	
	@Override
	public void update(boolean play) {
		this.bPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if(bPlay) {
			System.out.println("A 동작 시작");
		}else {
			System.out.println("A 동작 정지");
		}
	}
	
	
}
