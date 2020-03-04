import java.util.*;
class sort
{
public static void main(String args[])
{

ArrayList<String> st=new ArrayList<String>();
ArrayList<String> st1=new ArrayList<String>();

st.add("x");
st.add("a");
st.add("l");
st.add("b");

Collections.sort(st);

for(String s:st)
{
System.out.println(s);
}

}
}



