package collections;
import java.util.*;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> al1=new ArrayList<Integer>(5);
		ArrayList<Integer> al2=new ArrayList<Integer>(5);
		
		System.out.println("Enter elements of al1:");
		for(int i=0;i<5;i++){
			al1.add(sc.nextInt());
		}
		System.out.println("Enter elements of al2:");
		for(int i=0;i<5;i++){
			al2.add(sc.nextInt());
		}
		List l=new List();
		
		ArrayList al3=new ArrayList();
		al3=l.listop(al1,al2);
		System.out.println("Sorte List 2,6,8:"+al3);

	}

}
class List{
	
	static ArrayList listop(ArrayList al1,ArrayList al2) {
		// TODO Auto-generated method stub		
		System.out.println("Merged Array List:");
		System.out.println(al1.addAll(al2));
		Collections.sort(al1);
		System.out.println("Sorte List:"+al1);
		ArrayList al3=new ArrayList();
		al3.add(al1.get(2));
		al3.add(al1.get(6));
		al3.add(al1.get(8));
		return al3;
	}
	
}
