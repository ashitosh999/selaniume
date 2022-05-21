package package1;

public class Reverse_A_Srinng {
public static void main(String[] args) {
	
String str="ashitosh";
String rev="";
/*int len=str.length();
for (int i=len-1;i>=0;i--)
{rev=rev+str.charAt(i);
}
	System.out.println(rev);
}*/



char ch[]=str.toCharArray();
int len=ch.length;
for (int i=len-1;i>=0;i--)
{rev=rev+ch[i];
	
}
System.out.println(rev);


StringBuffer sb=new StringBuffer(str);
System.out.println(sb.reverse());
}
}