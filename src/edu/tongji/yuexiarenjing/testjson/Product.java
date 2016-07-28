package edu.tongji.yuexiarenjing.testjson;

public class Product {

	private int No;
	private String Name;
	private int age;

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Product() {
		super();
	}

	public Product(int no, String name, int age) {
		super();
		No = no;
		Name = name;
		this.age = age;
	}
}
