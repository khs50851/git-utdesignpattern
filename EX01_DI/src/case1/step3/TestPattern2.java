package case1.step3;

public class TestPattern2 {

	static int nNum = 0; //일반 변수로 만들면 main이랑 Thread변수랑 같이 쓸수 없어서 static으로 만듬
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			try {
				nNum++;
				Database database = Database.getInstance(nNum+"번째 Database");
				System.out.println("This is the "+database.getName()+" !!");
				
				// 쓰레드는 메모리가 여유되는대로 생성되는거라 순서는 뒤죽박죽
				
				// 근데 이렇게 하니까 10번째까지 다 생김 (원래 하나만 만들어야하는데)
				
				// 스레드 10개가 거의 동시에 데이터베이스에 접속해서 동시에 왔기때문에
				// 싱글톤은 10개의 스레드한테 모두 다 
				// 각각의 스레드에서 singleton을 null로 봐서 10개 전부 생성한거
				// 만약 스레드하나가 늦게 시작했으면 9개가 생성될수도 있었겠지..
				// 이런식으로 10개가 다 만들어지면 싱글톤패턴의 취약점이 드러남
			
				
				// public synchronized static Database getInstance
				// 이렇게 했기때문에 먼저 온 쓰레드에 sington이 만들어지고 
				// 그게 끝나길 기다리기때문에 다른 쓰레드는 접근 안됨
			}catch (Exception e) {
				
			}
		};
		
		for (int i=0;i<10;i++) {
			Thread t = new Thread(task); // 포문으로 10개를 반복하며 스레드를 시작
			t.start();
		}
		
	}

}
