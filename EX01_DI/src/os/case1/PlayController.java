package os.case1;

import java.util.Observable;

public class PlayController extends Observable{ // 감시의 대상이 되는 클래스
	
	private boolean bPlay; // 실행 여부
	
	public PlayController() {
		
	}
	
	// 데이터를 전달받아 플래그 값을 변경하고 새로운 데이터가 
	// 들어왔음을 알린다
	public void setFlag(boolean bPlay) {
		this.bPlay = bPlay;
		setChanged();
		notifyObservers(); // 이걸로 옵저버가 연락을 받게되면
	}
	
	// 실행 여부 플래그 값 반환
	public boolean getFlag() {
		return bPlay;
	}
	
	
}
