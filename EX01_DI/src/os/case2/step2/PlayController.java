package os.case2.step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class PlayController implements Publisher{ // 감시의 대상이 되는 클래스
	private List<Observer> observers = new ArrayList<>();
	private boolean play; // 실행 여부
	
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
		public void deleteObserver(Observer observer) {
			int index = observers.indexOf(observer);
			observers.remove(index);
		}
	
	
	@Override
		public void notifyObservers() {
			for(int i=0;i<observers.size();i++) {
				observers.get(i).update(play);
			}

		
		}
	
	// 데이터를 전달받아 플래그 값을 변경하고 새로운 데이터가 
	// 들어왔음을 알린다
	public void setFlag(boolean play) {
		this.play = play;
		notifyObservers(); // 이걸로 옵저버가 연락을 받게되면
		
	}
	
	// 실행 여부 플래그 값 반환
	public boolean getFlag() {
		return play;
	}
	
	
}
