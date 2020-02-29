package collections;
import java.util.*;
public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		UserMain um=new UserMain();
		String s1=um.formNewWord(s,n);
		System.out.println("New String:"+s1);

	}

}
class UserMain{
	static String formNewWord(String s,int n){
		ArrayList al=new ArrayList();
		for(int i=0;i<n;i++){
			al.add(s.charAt(i));
		}
		for(int i=n;i>0;i--){
			al.add(s.charAt((s.length())-i));
		}
		String s1=al.toString();
		return s1;
		
	}
	
}
