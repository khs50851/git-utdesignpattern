package bd.step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

	public static void main(String[] args) {
		Person p1 = Person.builder()
				.firstName("FirstName")
				.lastName("LastName")
				.addressOne("경기도 평택시")
				.addressTwo("address2")
				.birthDate(LocalDate.of(1995, Month.APRIL, 13))
				.sex("male")
				.driverLicense(true)
				.married(true)
				.build();
		
		// 이렇게하면 필요한 값을 만들면서 가볍게 넣을 수 있음
		// 줄이고싶으면 그냥 줄이면 됨 다양한 생성자를 만들 필요가 없어짐
		System.out.println(p1.getAddressOne());
	}

	
	
}
