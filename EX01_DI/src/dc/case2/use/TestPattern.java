package dc.case2.use;

import dc.case2.base.AmericanStudent;
import dc.case2.base.Student;
import dc.case2.decorator.Art;
import dc.case2.decorator.Science;

public class TestPattern {

	public static void main(String[] args) {
		Student g1 = new AmericanStudent();
		System.out.println(g1.getDescription());
		
		Science g2 = new Science(g1);
		System.out.println(g2.getDescription());
		
		Art g3 = new Art(g2);
		System.out.println(g3.getDescription());
	}

}
