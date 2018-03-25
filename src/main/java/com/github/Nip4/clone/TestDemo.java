package com.github.Nip4.clone;

public class TestDemo {
	/**
	 * 对象的浅拷贝
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String args[]) throws CloneNotSupportedException {
		//栈区存放的对象的引用，堆区存放的是对象
		Person person = new Person("张三",18);
		//对象的克隆，浅拷贝，但是类中的引用数据类型只是将地址拷贝了而已
		Person p = (Person) person.clone();
		System.out.println(p);
		System.out.println("person:"+person);
		
		Person p1 = person;
		System.out.println("p1："+p1);
		//因为String是引用数据类型，不是真正的被拷贝了，而是拷贝了地址，所以他们的hashCode地址相等
		//直接从object中继承过来的clone默认实现的是浅拷贝
		System.out.println(person.getName().hashCode());
		System.out.println(p.getName().hashCode());
	}
}
