package os.case2.step2;


public class MyClassA implements Observer{
	Publisher observable; // 등록될 observable
	private boolean bPlay; // 실행 여부
	
	// 생성될때 직접 자기 자신을 옵저버에 등록
	public MyClassA(Publisher o) {
		this.observable = o;
		observable.addObserver(this);
	}
	
	
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
