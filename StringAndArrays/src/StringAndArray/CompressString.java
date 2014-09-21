package StringAndArray;

public class CompressString {

	public String compressString(String temp){
		StringBuffer sb = new StringBuffer();
		if(temp.length()==0)
			return temp;
		char ch = temp.charAt(0);
		int count = 1;
		int j = 1;
		while(j<temp.length()){
			if(ch==temp.charAt(j)){
				count++;
				j++;
				if(j==temp.length()){
					sb.append(ch);
					sb.append(count);
				}
			}else{
				sb.append(ch);
				sb.append(count);
				count=1;
				ch = temp.charAt(j);
				j++;
			}
		}
		if(sb.length()<=temp.length()){
			return sb.toString();
		}else{
			return temp;
		}
		
	}
	public static void main(String[] args) {
		CompressString obj = new CompressString();
		String test = obj.compressString("aaaabbbbccc");
		System.out.println(test);
	}

}
