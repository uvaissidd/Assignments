package Interface;

import java.util.Scanner;

public class Employee {
	public int id = 0;
	public String name = null;
	public String add = null;
	public int sal = 0;
	public int count = 0;
	public Employee(int id , String name , String add , int sal) {
		super();
		this.id= id;
		this.name= name;
		this.add = add;
		this.sal= sal;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public int getSalary() {
		return sal;
	}
}
