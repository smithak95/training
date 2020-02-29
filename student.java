package collection.programs;
import java.util.*;

public class student {
	int age;
	String name;
	int roll;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	
	@Override
	public String toString() {
		return "student [age=" + age + ", name=" + name + ", roll=" + roll + "]";
	}

	public student(int roll, String name,int age){
	this.age=age;
	this.name=name;
	this.roll=roll;
	}
	
	public static Comparator<student> rollcompare=new Comparator<student>()
			{

				@Override
				public int compare(student s1, student s2) {
					int r1=s1.getRoll();
					int r2=s2.getRoll();
					return r1-r2;
				}
		
			};
			
	public static Comparator<student> namecompare=new Comparator<student>()
			{

				@Override
				public int compare(student s1, student s2) {
					String a1=s1.getName();
					String a2=s2.getName();
					return a1.compareTo(a2);
				}
		
			};
	
	
}
