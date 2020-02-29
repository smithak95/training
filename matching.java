package collection.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class matching {
	public static void main(String[] args) {
		
		String s=" ";
		String str="-";
		int n=0,m=0;
		int arr[]=new int[5];
		int arr1[]=new int[5];
		ArrayList<String> l1=new ArrayList<String>();
		
		l1.add("hi");
		l1.add("me");
		l1.add("-");
		l1.add("here");
		l1.add("hi");
		l1.add("hello");
		
		ArrayList<String> l2=new ArrayList<String>();
		
		l2.add("10");
		l2.add("me");
		l2.add("-");
		l2.add("123");
		l2.add("-");
		l2.add("220");
		
		ArrayList<Integer> m1=new ArrayList<Integer>();
		ArrayList<Integer> m2=new ArrayList<Integer>();
		
		/*int x=l1.indexOf("-");
		int y=l2.indexOf("-");
		
		int a=l1.lastIndexOf("-");
		int b=l2.lastIndexOf("-");
		
		if(a==b&&x==y)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}*/
		
		Iterator t=l1.iterator();
		Iterator t1=l2.iterator();
		
		while(t.hasNext())
		{
			s=t.next().toString();
			//System.out.println(s);
			if(s.equals(str))
			{
				m1.add(l1.indexOf(s));
			}
		}
		
		while(t1.hasNext())
		{
			s=t1.next().toString();
			//n=Integer.parseInt(s);
			if(s.equals(str))
			{
				m2.add(l1.indexOf(s));
			}
			
			
		}
		System.out.println(m1);
		System.out.println(m2);
		if(m1.equals(m2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
