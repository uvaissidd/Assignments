package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class emp {

	public static void main(String[] args) throws Exception {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1," ravi "," Delhi ",40000));
		list.add(new Employee(2," raj "," Noida ",50000));
		list.add(new Employee(3," ram "," Gurgaon ",20000));
		list.add(new Employee(4," rishi "," Bangalore ",15000));
		System.out.println("Id Name Address Salary of the emplyees are : ");
		for(Employee s : list) {
			System.out.println(s.getId()+""+s.getName()+""+s.getAdd()+""+s.getSalary());
		}
	}

}
