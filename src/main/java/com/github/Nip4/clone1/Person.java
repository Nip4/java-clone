package com.github.Nip4.clone1;

public class Person implements Cloneable{

	private Car car;
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	@Override
	public String toString() {
		return "Person [car=" + car + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Person person = (Person) super.clone();
		person.car = (Car) car.clone();
		return person;
	}
}
