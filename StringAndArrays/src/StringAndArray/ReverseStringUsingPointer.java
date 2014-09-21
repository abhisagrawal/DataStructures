package StringAndArray;

class ReverseStringUsingPointer{
public static void main(String args[]){
StringBuffer sb = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
System.out.println(sb);
for(int i=0,j=sb.length()-1;i<=j;i++,j--){
	char ch = sb.charAt(i);
	sb.setCharAt(i,sb.charAt(j));
	sb.setCharAt(j,ch);
}
System.out.println(sb);
}}