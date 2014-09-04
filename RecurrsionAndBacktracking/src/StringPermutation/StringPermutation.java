package StringPermutation;

public class StringPermutation {
	String in;
	StringBuilder out = new StringBuilder();
	boolean[] used;
	
	StringPermutation(String temp){
		in = temp;
		used = new boolean[temp.length()];
	}
	
	public void permute(){
		if(in.length()==out.length()){
			System.out.println(out);
			return;
		}else{
			for(int i=0;i<in.length();i++){
				if(used[i]==true)
					continue;
				out.append(in.charAt(i));
				used[i] = true;
				permute();
				used[i] = false;
				out.setLength(out.length()-1);
			}
		}
	}
	
	public static void main(String[] args){	
		StringPermutation obj =new StringPermutation("abcd");
		obj.permute();
	}
}
