import java.util.*;
class eight
{
public static void main(String args[])
{

ArrayList<String> list=new ArrayList<String>();

list.add("tn_chennai");
list.add("kerala_tvm");
list.add("karnataka_bnglr");

Scanner sc=new Scanner(System.in);

System.out.println("enter the state");
String n=sc.nextLine();

Iterator itr=list.iterator();

while(itr.hasNext())
{

String s=String.valueOf(itr.next());
String[] arr=s.split("_");

if(arr[0].equals(n))
{
System.out.println(arr[1]);
}
}
}
}