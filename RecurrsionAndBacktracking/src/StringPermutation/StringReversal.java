package StringPermutation;

public class StringReversal {

	static StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
	
	public static void reverseString(int pos){
		if(pos==sb.length()){
			sb = new StringBuilder();
		}else{
			char temp = sb.charAt(pos);
			reverseString(pos+1);
			sb.append(temp);
		}
		
	}
	
	public static void main(String[] args) {
		reverseString(0);
		System.out.println(sb);
	}

}
