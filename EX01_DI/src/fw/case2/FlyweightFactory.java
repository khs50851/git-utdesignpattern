package fw.case2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, Subject> map = new HashMap<String, Subject>();
	
	public Subject getSubject(String key) {
		// 이 메소드가 호출이 되면  위에 static변수에서 파라미터로 들어온 key값을 통해 데이터를 찾고 저장
		
		Subject subject = map.get(key); // 키값이 있는지 확인
		
		if(subject == null) {
			subject = new Subject(key);
			map.put(key, subject);
			
			System.out.println("새로 생성 : "+key);
		}else {
			System.out.println("재사용 "+key);
		}
		return subject;
	}
}
