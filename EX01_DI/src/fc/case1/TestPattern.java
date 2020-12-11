package fc.case1;

public class TestPattern {
	
	public static void main(String args[]) {
		// 기존 complex~ 여기에 메소드를 7번 호출하는거보다 simple 한번 호출하는게 나음
		SimpleProductFacade simpleProductFacade = new SimpleProductFacade();
		simpleProductFacade.setName("Printer");
		System.out.println("The product is a "+simpleProductFacade.getName());
	}

}
