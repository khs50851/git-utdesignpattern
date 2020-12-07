package bd.step1;

import java.time.LocalDate;

public class Person {
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String addressOne;
	private String addressTwo;
	private String sex;
	private boolean driverLicense;
	private boolean married;
	// 멤버변수가 20개 넘을경우 그 생성자를 통해 객체를 생성하기는 쉽지 않을거다
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
}
