import java.util.*;

class three
{
public static void main(String args[])
{
ArrayList<String> arr=new ArrayList<String>();
//String[] s1=new String[3];
int temp=0;
String s3=" ";

arr.add("arun#10#10#10");
arr.add("amal#12#12#122");
arr.add("smitha#14#14#14");

for(String s:arr)
{
String[] s1=s.split("#");
int sum=Integer.parseInt(s1[1])+Integer.parseInt(s1[2])+Integer.parseInt(s1[3]);

if(sum>temp)
{
temp=sum;
s3=s1[0];
}


}
System.out.println(s3+" "+temp);
}
}