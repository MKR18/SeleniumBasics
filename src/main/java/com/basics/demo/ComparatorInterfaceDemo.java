package com.basics.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class student{
	
	int id;
	int marks;
	
	public student(int id, int marks) {
		this.id     =  id;
		this.marks  =  marks;
		
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", marks=" + marks + "]";
	}
	
}

class employee implements Comparable<employee>{
	
	int id;
	int salary;
	
	public employee(int id, int salary) {
		this.id     =  id;
		this.salary  =  salary;
		
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", salary=" + salary + "]";
	}

	public int compareTo(employee emp) {
		// TODO Auto-generated method stub
		return this.salary > emp.salary?-1:this.salary < emp.salary?1:0;
	}
	
}

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student> list = new ArrayList<student>();
		list.add(new student(1, 234));
		list.add(new student(2, 765));
		list.add(new student(3, 569));
		list.add(new student(4, 356));
		
		List<employee> empList = new ArrayList<employee>();
		empList.add(new employee(1, 234));
		empList.add(new employee(2, 765));
		empList.add(new employee(3, 569));
		empList.add(new employee(4, 356));

		//comparator interface
//		Collections.sort( list, new Comparator<student>() {
//
//			@Override
//			public int compare(student s1, student s2) {
//				// TODO Auto-generated method stub
//				return s1.marks%10>s2.marks%10?1:-1; //to sort only last digits use %10
//				
//			}
//		});
		
		//comparator interface
//		Collections.sort(list, (student s1, student s2)-> {
//			return s1.marks>s2.marks?1:-1;
//		});
		
		for( student s: list) {
			System.out.println(s);
		}
		
		//comparable interface no need to second argument as you implement comprable interface in employee class
		//when to use comparable interface?  when you have custom class its good to use comparable, otherwise Number or some other predefined class use comparator interface
		Collections.sort(empList);
		
		for( employee e:empList)
			System.out.println(e);
		
	}

}
