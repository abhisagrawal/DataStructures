package StringPermutation;

public class StringTelephoneProblem {
	
	public void permute(int[] num,int pos){
		StringBuilder out = new StringBuilder();
		String in = "";
		boolean used[] = new boolean[3];
		
		switch (num[pos]){
		case 1:
			in = "1";
			used = new boolean[1];
			break;
		case 2:
			in = "abc";
			used = new boolean[3];
			break;
		case 3:
			in = "def";
			used = new boolean[3];
			break;
		case 4:
			in = "ghi";
			used = new boolean[3];
			break;
		case 5:
			in = "jkl";
			used = new boolean[3];
			break;
		case 6:
			in = "mno";
			used = new boolean[3];
			break;
		case 7:
			in = "pqr";
			used = new boolean[3];
			break;
		case 8:
			in = "tuv";
			used = new boolean[3];
			break;
		case 9:
			in = "wxy";
			used = new boolean[3];
			break;
		case 0:
			in = "0";
			used = new boolean[1];
		}
		if(in.length()==out.length()){
			System.out.println(out);
			return;
		}else{
			for(int i=0;i<in.length();i++){
				if(used[i]==true)
					continue;
				out.append(in.charAt(i));
				used[i] = true;
				permute(num,pos+1);
				used[i] = false;
				out.setLength(out.length()-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		StringTelephoneProblem obj = new StringTelephoneProblem();
		obj.permute(arr,0);

	}

}
