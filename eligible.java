import java.util.*;
import java.text.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

class eligible
{
public static void main(String args[])throws Exception
{
HashMap<String,String> map=new HashMap<String,String>();

map.put("smitha","1995-12-12");
map.put("anu","1990-10-08");
map.put("abi","2013-05-06");

System.out.println(map);

for(Map.Entry m:map.entrySet())
{
String s=m.getValue().toString();
//Date d1=new SimpleDateFormat("dd-mm-yyyy").parse(s);

LocalDate d=LocalDate.parse(s);

DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy");
String s1=d.format(dtf);
int n=Integer.parseInt(s1);

Calendar c=Calendar.getInstance();
int n1=c.get(Calendar.YEAR);

int age=n1-n;

if(age>=18)
{
String name=m.getKey().toString();
System.out.println(name+" "+age);

}
//System.out.println(s1);
}


}
}