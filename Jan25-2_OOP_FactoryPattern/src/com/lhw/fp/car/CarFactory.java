package com.lhw.fp.car;

// 2. 같은 패키지에 객체 생성 공장 역할을 할 클래스를
public class CarFactory {
	private int lastNo;

	// 3. 객체를 만들 때 사용할 메소드를 상황에 맞게 잘.
	public Car makeACar(String type) {
		lastNo++;

		if (type == "ㅌ") {
			return new Truck(lastNo);
		} else {
			return new Bus(lastNo);
		}
	}
}
