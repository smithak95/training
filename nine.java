import java.util.*;
class nine
{
public static void main(String args[])
{
ArrayList<String> list=new ArrayList<String>();

String s1=" ";

list.add("car");
list.add("java");
list.add("mat");

Iterator itr=list.iterator();

while(itr.hasNext())
{
String s=String.valueOf(itr.next());
int l=s.length();
char x=s.charAt(l-1);
System.out.print(x);


}
//System.out.print(s1);
}
}
