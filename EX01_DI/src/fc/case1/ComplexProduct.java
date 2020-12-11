package fc.case1;

public class ComplexProduct {
	char nameChars[] = new char[10];
	public ComplexProduct() {
		
	}
	
	public void setZeroNameCharactor(char c) {
		nameChars[0] = c;
	}
	
	public void setFirstNameCharactor(char c) {
		nameChars[1] = c;
	}
	
	public void setSecondNameCharactor(char c) {
		nameChars[2] = c;
	}
	
	public void setThirdNameCharactor(char c) {
		nameChars[3] = c;
	}
	
	public void setFourthNameCharactor(char c) {
		nameChars[4] = c;
	}
	
	public void setFifthNameCharactor(char c) {
		nameChars[5] = c;
	}
	
	public void setSixthNameCharactor(char c) {
		nameChars[6] = c;
	}
	
	public String getName() {
		return new String(nameChars);
	}
}
