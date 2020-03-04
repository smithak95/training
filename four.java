import java.util.*;

class four
{
public static void main(String args[])
{
ArrayList<Integer> li=new ArrayList<Integer>();
int temp=0,rev=0,sum=0;

Scanner sc=new Scanner(System.in);

System.out.println("enter 1st");
int n1=sc.nextInt();

System.out.println("Enter 2nd");
int n2=sc.nextInt();

for(int i=n1;i<=n2;i++)
{
String x=String.valueOf(i);
for(int j=0;j<x.length();j++)
{
int z=i;
temp=z%10;
rev=(rev*10)+temp;
z=z/10;

System.out.println(rev);

if(i==rev)
{
System.out.println(i);
li.add(i);
}
}
}

for(int m:li)
{
System.out.println(m);
sum=sum+m;

}
System.out.println(sum);

}
}