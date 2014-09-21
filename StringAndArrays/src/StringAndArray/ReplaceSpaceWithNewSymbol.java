package StringAndArray;

public class ReplaceSpaceWithNewSymbol {
	char[] arr;
	int strlength;
	
	ReplaceSpaceWithNewSymbol(String str){
		arr = new char[str.length()+100];
		strlength = str.length();
		for(int i =0;i<str.length();i++)
			arr[i] = str.charAt(i);
	}
	
	public void replaceSpace(){
		int count =0;
		for(int i=0;i<strlength;i++){
			if(arr[i]==' ')
				count++;
		}
		
		int len = (strlength-count)+(count*3);
		for(int i=strlength-1,j=len-1;i>=0;i--){
			char ch = arr[i];
			if(ch!=' '){
				arr[j]=ch;
				j--;
			}else{
				arr[j--] = '0';
				arr[j--] = '2';
				arr[j--] = '%';
			}
		}
	}
	
	public static void main(String[] args) {
		ReplaceSpaceWithNewSymbol obj = new ReplaceSpaceWithNewSymbol("Mr. John Smith  is the       only person that is      so   cool");
		obj.replaceSpace();
		System.out.println(obj.arr);
	}
}
