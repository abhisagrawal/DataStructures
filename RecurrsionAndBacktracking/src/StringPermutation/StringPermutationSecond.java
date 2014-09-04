package StringPermutation;


public class StringPermutationSecond {
	StringBuilder out = new StringBuilder();
	String in;
	boolean[] used;
	
	StringPermutationSecond(String temp){
		in = temp;
		used = new boolean[temp.length()];
	}
	
	public void callStringCombination(){
		for(int i = 1;i<=in.length();i++){
			permute(i,0);
			used = new boolean[in.length()];
		}
	}
	
	public void permute(int len, int pos){
		if(len==0){
			System.out.println(out);
			return;
		}else{
			for(int i=pos;i<in.length();i++){
				if(used[i]==true)
					continue;
				out.append(in.charAt(i));
				used[i]=true;
				permute(len-1,i+1);
				used[i]=false;
				out.setLength(out.length()-1);
			}
		}
	}

	public static void main(String[] args) {
		StringPermutationSecond obj = new StringPermutationSecond("wxyz");
		obj.callStringCombination();

	}

}
