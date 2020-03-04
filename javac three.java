import java.util.*;
class three
{
public static void main(String args[])
{
TreeSet<String> set=new TreeSet<String>();

Scanner sc=new Scanner(System.in);

String arr[]=new String[];

System.out.println("enter the string elements");
for(int i=0;i<5;i++)
{
arr[i]=sc.newLine();
}

for(int i=0;i<5;i++)
{
set.add(arr[i]);
}

Iterator itr=set.iterator;

while(itr.hasNext())
{
System.out.println(itr.next());
}


}
}