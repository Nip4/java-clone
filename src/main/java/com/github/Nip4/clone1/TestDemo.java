package com.github.Nip4.clone1;

public class TestDemo {
	/**
	 * 深拷贝：如果若想实现深拷贝需要重写 clone 方法实现属性对象的拷贝。
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String args[]) throws CloneNotSupportedException {
		Car car = new Car("宝马",1888888);
		Person person = new Person();
		person.setCar(car);
		Person p = (Person) person.clone();
		System.out.println(person == p);
		System.out.println(person.getCar() == p.getCar());
		//因为string类中没有实现Cloneable接口和覆写clone方法所以只是拷贝了一份内存地址
		System.out.println(person.getCar().getBrand() == p.getCar().getBrand());
	}
}
