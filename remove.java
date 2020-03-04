import java.util.*;
class remove
{

public static void main(String args[])
{
ArrayList <Integer> arr=new ArrayList<Integer>();
ArrayList <Integer>arr1=new ArrayList<Integer>();

Scanner sc=new Scanner(System.in);

System.out.println("enter the 1st limit");
int l1=sc.nextInt();

System.out.println("enter the 2nd limit");
int l2=sc.nextInt();

System.out.println("enter the elements of 2st");
for(int i=0;i<l2;i++)
{
arr1.add(sc.nextInt());
}

System.out.println("enter the elements of 1st");
for(int i=0;i<l1;i++)
{
arr.add(sc.nextInt());


if(arr1.contains(arr.get(i)))
{
boolean flag=true;
if(flag==true)
{
arr.remove(arr.get(i));
i=i-1;
l1=l1-1;
}

}

}





Iterator itr=arr.iterator();

while(itr.hasNext())
{
System.out.print(itr.next());

}






}

}