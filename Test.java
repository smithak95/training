package collection.programs;
import java.util.*;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<student> li=new ArrayList<student>();
		
		li.add(new student(400,"smitha",24));
		li.add(new student(300,"amrit",22));
		li.add(new student(200,"shahana",25));
		
		
		Collections.sort(li,student.rollcompare);
		
			for(student st:li)
			{
				System.out.println(st);
			}
			
		Collections.sort(li,student.namecompare);
		 
		   for(student st:li)
		   {
			   System.out.println(st);
		   }
			
		
		
	}

}
