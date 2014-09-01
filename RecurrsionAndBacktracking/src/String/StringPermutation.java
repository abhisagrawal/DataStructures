package String;

public class StringPermutation {
	private static char[] sb = {'a','b','c','d','e'};
	private static boolean ch[] = new boolean[sb.length];
	private static StringBuilder sbout = new StringBuilder();
	
	public void permute(int pos){
		if(pos==sb.length){
			System.out.println(sbout);
		}else{
			char temp = getLetter();
			sbout.append(temp);
			permute(pos+1);
			
		}
	}
	
	public static void main(String[] args){
	
	}

}
