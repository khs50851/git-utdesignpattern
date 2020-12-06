package fw.case1.step2;

public class TestPattern1 {

	public static void main(String[] args) {
		MyData md1 = new MyData();
		md1.xpos = 10;
		md1.ypos = 11;
		md1.name = "홍길동";
		
		MyData md2 = new MyData();
		md2 = md1; // 객체 풀에  있는 같은 객체를 공유함
		
		MyData md3 = new MyData();
		
		
		md3.xpos = 20;
		md3.ypos = 21;
		md3.name = "손오공";
		
		md2.name = "전우치";
		md2.xpos = 5;
		
		//이렇게 하면 md2랑 md1은 같은 자원을 공유하고 있기때문에 md1의 값도 바뀌게됨

	}

}

class MyData{
	int xpos;
	int ypos;
	String name;
	
}