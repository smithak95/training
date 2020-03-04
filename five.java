import java.util.*;

class five
{
public static void main(String args[])
{
HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

int sum=0;

map.put(1,20);
map.put(2,10);
map.put(3,30);
map.put(4,25);

for(Map.Entry m:map.entrySet())
{

String s=m.getKey().toString();
int n=Integer.parseInt(s);

if(n%2!=0)
{
String s1=m.getValue().toString();
sum=sum+Integer.parseInt(s1);
}
}
System.out.println(sum);
}
}