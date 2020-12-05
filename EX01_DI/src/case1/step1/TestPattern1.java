package case1.step1;

public class TestPattern1 {

	public static void main(String[] args) {
		Database database;
		database = Database.getInstance("첫 번째 Database");
		System.out.println("This is the "+database.getName()+" !!");
		
		database = Database.getInstance("두 번째 Database"); // 이것도 첫 번째 Database라고 찍힘
		System.out.println("This is the "+database.getName()+" !!");
		
		//첫 번째로 들어갈땐 singleton의 값이 없으니 객체가 생성되어 저장되지만 두 번째는 
		//데이터가 이미 들어가 있으므로 if문에 의해 새로 객체를 저장하지 않고 기존에 있던 singeton 변수를 리턴함
		
		// 하지만 사용자가 우리가 만든거 사용 안하고 직접 생성자를 호출한다면? 
		// Database dt = new Database("마음대로"); //이런식으로 하면 계속 객체가 생성됨 그걸 막기 위해 
		// 생성자를 public이 아닌 private으로 설정해야함 
		// private으로 바꿔서 이제 에러남
		
//		Database d1 = new Database("1");
//		Database d2 = new Database("2");
//		Database d3 = new Database("3");
//		Database d4 = new Database("4");
//		Database d5 = new Database("5");
//		Database d6 = new Database("6");
		
		// 객체 생성을 n개로 제한
	}

}
