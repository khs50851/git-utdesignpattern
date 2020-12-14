package dc.case2.decorator;

import dc.case2.base.Student;

public abstract class StudentDecorator extends Student{
	
	// 설명을 추가해야 하므로 서브클래스에서 꼭 구현하도록 강제
	public abstract String getDescription();
}
