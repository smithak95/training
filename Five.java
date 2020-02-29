package collections;
import java.util.*;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		System.out.println("Enter the character");
		char c=sc.next().charAt(0);
		TestMain m=new TestMain();
		String s1=m.reshape(s,c);
		System.out.println("string is:"+s1);
		

	}

}
class TestMain{
	static String reshape(String s,char c){
		
		ArrayList al=new ArrayList();
		for(int i=0;i<s.length();i++){
			al.add(s.charAt(i));
			if(i==s.length()-1){
				
			}
			else{
			al.add("-");
			}
		}
		/*String s1=null;
		for(Object i:al){
		s1.concat(i);
		}*/
		String s1=al.toString();
		return s1;
	}
}
